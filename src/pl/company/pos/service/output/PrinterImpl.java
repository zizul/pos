package pl.company.pos.service.output;

import pl.company.pos.model.Product;
import pl.company.pos.model.Receipt;

public class PrinterImpl implements OutputDevice {

	@Override
	public void updateSingle(Product outputtype) {
	}

	@Override
	public void updateTotal(Receipt receipt) {
		for (Product product : receipt.getProducts()) {
			output(product.getName() + ", " + product.getPrice().toString());
		}
		output("Total price " + receipt.getTotalPrice().toString());
	}
	
	@Override
	public void output(String info) {
		System.out.println("Printer: " + info);
	}

	@Override
	public void updateError(String message) {
		
	}

}
