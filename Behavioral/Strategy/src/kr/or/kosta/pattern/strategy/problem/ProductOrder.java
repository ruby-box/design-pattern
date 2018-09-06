package kr.or.kosta.pattern.strategy.problem;


public abstract class ProductOrder {

	private Product product;
	
	public ProductOrder(Product product) {
		this.product = product;
	}
	
	public double getPrice() {
		return product.getPrice();
	}
	
	public abstract String getOrderCountry();
	
	public abstract double calculateTax();
	
	public abstract double getCurrency();
	
}
