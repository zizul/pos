package pl.company.pos.controller;

import pl.company.pos.service.ProductService;
import pl.company.pos.service.output.OutputDevice;

public interface PosController {

	public void handleInput(String input);

	public void addOutputDevice(OutputDevice lcddisplay);

	public void handleError(String message);
	
	public void setProductService(ProductService service);

}
