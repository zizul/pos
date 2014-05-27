package pl.company.pos.service.output;

import pl.company.pos.model.Product;
import pl.company.pos.model.Receipt;

public class LcdDisplayImpl implements OutputDevice {
	
	@Override
	public void updateSingle(Product product) {
		String name = product.getName();
		Double price = product.getPrice();
		output(name + ", " + price.toString());
	}

	@Override
	public void updateTotal(Receipt receipt) {
		output("Total price " + receipt.getTotalPrice().toString());
	}

	@Override
	public void output(String info) {
		System.out.println("Lcd display: " + info);
	}

	@Override
	public void updateError(String message) {
		output("Error: " + message);
	}

}
