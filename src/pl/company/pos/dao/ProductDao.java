package pl.company.pos.dao;

import pl.company.pos.model.Product;

public interface ProductDao {

	public Product loadProduct(String code);
}
