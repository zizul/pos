package pl.company.pos.main;

import pl.company.pos.controller.PosController;
import pl.company.pos.controller.PosControllerImpl;
import pl.company.pos.dao.ProductDao;
import pl.company.pos.dao.ProductDaoStubImpl;
import pl.company.pos.service.ProductService;
import pl.company.pos.service.ProductServiceImpl;
import pl.company.pos.service.input.BarCodeScannerImpl;
import pl.company.pos.service.input.InputDevice;
import pl.company.pos.service.output.LcdDisplayImpl;
import pl.company.pos.service.output.OutputDevice;
import pl.company.pos.service.output.PrinterImpl;

public class PosAppMain {
	
	public static void main(String[] args) {
		
		ProductService pservice = new ProductServiceImpl();
		ProductDao pdao = new ProductDaoStubImpl();

		pservice.setProductDao(pdao);
		
		OutputDevice lcddisplay = new LcdDisplayImpl();
		OutputDevice printer = new PrinterImpl();
		
		PosController controller = new PosControllerImpl();
		controller.setProductService(pservice);
		controller.addOutputDevice(lcddisplay);
		controller.addOutputDevice(printer);

		InputDevice scanner = new BarCodeScannerImpl();
		scanner.setController(controller);

		new Thread(scanner).start();

	}
	
}
