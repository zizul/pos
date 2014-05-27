package pl.company.pos.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Receipt {

	private Date date;
	private List<Product> products;
	
	public Receipt() {
		products = new ArrayList<Product>();
	}
	
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public void addProduct(Product product) {
		products.add(product);
	}
	
	public Double getTotalPrice() {
		Double total = 0.0;
		for (Product product : products) {
			total += product.getPrice();
		}
		return total;
	}
}
