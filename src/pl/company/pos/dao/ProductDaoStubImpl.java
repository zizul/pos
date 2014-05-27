package pl.company.pos.dao;

import java.util.ArrayList;
import java.util.List;

import pl.company.pos.model.Product;

public class ProductDaoStubImpl implements ProductDao {

	private List<Product> productRepository;
	
	public ProductDaoStubImpl() {
		productRepository = new ArrayList<Product>();
		Product product1 = new Product();
		product1.setCode("a1");
		product1.setName("Bread");
		product1.setPrice(2.1);
		Product product2 = new Product();
		product2.setCode("a2");
		product2.setName("Butter");
		product2.setPrice(4.2);
		Product product3 = new Product();
		product3.setCode("a3");
		product3.setName("Milk");
		product3.setPrice(3.5);
		Product product4 = new Product();
		product4.setCode("a4");
		product4.setName("Cheese");
		product4.setPrice(5.0);
		Product product5 = new Product();
		product5.setCode("a5");
		product5.setName("Cucamber");
		product5.setPrice(1.8);
		productRepository.add(product1);
		productRepository.add(product2);
		productRepository.add(product3);
		productRepository.add(product4);
		productRepository.add(product5);
	}
	
	@Override
	public Product loadProduct(String code) {
		for (Product product : productRepository) {
			if(product.getCode().equals(code))
				return product;
		}
		return null;
	}

}
