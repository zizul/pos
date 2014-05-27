package pl.company.pos.service.input;

import pl.company.pos.controller.PosController;

public interface InputDevice extends Runnable {
	
	public void setController(PosController controller);
}
