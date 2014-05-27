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
			while (true) {
				System.out.print("Scan code:");
				input = br.readLine();
				controller.handleInput(input);
			}
		} catch (IOException io) {
			controller.handleError(io.getMessage());
		}

	}

	public void setController(PosController controller) {
		this.controller = controller;
	}
}
