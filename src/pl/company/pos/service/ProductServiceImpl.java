package pl.company.pos.service;

import pl.company.pos.dao.ProductDao;
import pl.company.pos.model.Product;

public class ProductServiceImpl implements ProductService {

	private ProductDao productDao;
	
	public Product getProduct(String code) {
		return productDao.loadProduct(code);
	}

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
}
