package kr.or.kosta.pattern.strategy.problem;

public class JPProductOrder extends ProductOrder {

	private static final String ORDER_COUNTRY = "JAPAN";
	
	private static final double TAX_RATE = 0.15d;
	
	private static final double CURRENCY_RATE = 1.34;
	
	public JPProductOrder(Product product) {
		super(product);
	}
	
	@Override
	public double calculateTax() {
		return getPrice() * TAX_RATE;
	}

	@Override
	public double getCurrency() {
		return getPrice() * CURRENCY_RATE;
	}

	@Override
	public String getOrderCountry() {
		return ORDER_COUNTRY;
	}

}
