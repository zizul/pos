package pl.company.pos.service.output;

import pl.company.pos.model.Product;
import pl.company.pos.model.Receipt;

public interface OutputDevice {

	public void updateSingle(Product outputtype);
	
	public void updateTotal(Receipt outputtype);

	public void updateError(String message);
	
	public void output(String info);
}
