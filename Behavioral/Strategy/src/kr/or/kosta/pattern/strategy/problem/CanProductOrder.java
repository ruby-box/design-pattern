package kr.or.kosta.pattern.strategy.problem;

public class CanProductOrder extends ProductOrder {

	private static final String ORDER_COUNTRY = "CANADA";
	
	private static final double TAX_RATE = 0.3d;
	
	private static final double CURRENCY_RATE = 0.94d;
	
	public CanProductOrder(Product product) {
		super(product);
	}
	
	public String getOrderCountry() {
		return ORDER_COUNTRY;
	}
	
	@Override
	public double calculateTax() {
		return getPrice() * TAX_RATE;
	}

	@Override
	public double getCurrency() {
		return getPrice() * CURRENCY_RATE;
	}

}
