package pl.company.pos.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import pl.company.pos.model.Product;
import pl.company.pos.model.Receipt;
import pl.company.pos.service.ProductService;
import pl.company.pos.service.output.OutputDevice;

public class PosControllerImpl implements PosController {

	private List<OutputDevice> outputDevices;
	private Receipt currentReceipt;
	private ProductService productService;
	
	public PosControllerImpl() {
		currentReceipt = new Receipt();
		outputDevices = new ArrayList<OutputDevice>();
	}
	
	@Override
	synchronized public Boolean handleInput(String input) {
		if(input.equals("quit")) {
			return false;
		} else if(input.equals("exit")) {
			currentReceipt.setDate(new Date());
			notifyTotal();
			currentReceipt = new Receipt();
		} else if(input.equals("")) {
			notifyError("Invalid bar-code.");
		} else {
			Product product = productService.getProduct(input);
			if(product != null) {
				currentReceipt.addProduct(product);
				notifySingle(product);
			} else {
				notifyError("Product not found.");
			}
		}
		return true;
	}

	private void notifyTotal() {
		for (OutputDevice device : outputDevices) {
			device.updateTotal(currentReceipt);
		}
	}

	private void notifySingle(Product product) {
		for (OutputDevice device : outputDevices) {
				device.updateSingle(product);
		}
	}
	
	private void notifyError(String message) {
		for (OutputDevice device : outputDevices) {
				device.updateError(message);
		}
	}

	@Override
	public void addOutputDevice(OutputDevice device) {
		outputDevices.add(device);
	}
	
	public void setProductService(ProductService service) {
		productService = service;
	}

	@Override
	public void handleException(String message) {
		notifyError(message);
	}

}
