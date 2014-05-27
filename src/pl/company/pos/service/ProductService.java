package pl.company.pos.service;

import pl.company.pos.dao.ProductDao;
import pl.company.pos.model.Product;

public interface ProductService {

	public Product getProduct(String code);
	
	public void setProductDao(ProductDao productDao);
}
