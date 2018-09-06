package kr.or.kosta.pattern.strategy.problem;

public class USProductOrder extends ProductOrder {

	private static final String ORDER_COUNTRY = "UNITED STATE";
	
	private static final double TAX_RATE = 0.35;
	
	private static final double CURRENCY_RATE = 0.94;
	
	public USProductOrder(Product product) {
		super(product);
	}
	
	public String getOrderCountry() {
		return ORDER_COUNTRY;
	}
	
	public double calculateTax() {
		return getPrice() * TAX_RATE;
	}

	public double getCurrency() {
		return getPrice() * CURRENCY_RATE;
	}

}
