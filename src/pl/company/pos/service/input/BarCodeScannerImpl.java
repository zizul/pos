package pl.company.pos.service.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import pl.company.pos.controller.PosController;

public class BarCodeScannerImpl implements InputDevice {

	private PosController controller;
	
	public void run() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String input;
			Boolean isActive = true;
			while (isActive) {
				System.out.print("Scan code:");
				input = br.readLine();
				isActive = controller.handleInput(input);
			}
		} catch (IOException io) {
			controller.handleException(io.getMessage());
		}

	}

	public void setController(PosController controller) {
		this.controller = controller;
	}
}
