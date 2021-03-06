package pl.company.pos.model;

public class Product {

	private String code;
	private String name;
	private Double price;
	
	public Product(String pcode, String pname, Double pprice) {
		code = pcode;
		name = pname;
		price = pprice;
	}
	
	public Product() {
	}

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}

}
