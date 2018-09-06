package kr.or.kosta.pattern.strategy.problem;

import java.text.NumberFormat;


public class TaskController {
	
	public static void main(String[] args) {
		TaskController controller = new TaskController();
		controller.process();
	}

	public void process() {
		Product product = getProduct();
		
		System.out.println("[제품명] " + product.getName());
		System.out.println("[가격] " + NumberFormat.getInstance().format(product.getPrice()));
		
		System.out.println();
		ProductOrder usProductOrder = new USProductOrder(product);
		System.out.println("[주무국가] " + usProductOrder.getOrderCountry());
		System.out.println("[관세] " + NumberFormat.getInstance().format(usProductOrder.calculateTax()));
		System.out.println("[환율 적용 가격] " + NumberFormat.getInstance().format(usProductOrder.getCurrency()));
		
		System.out.println();
		ProductOrder jpProductOrder = new JPProductOrder(product);
		System.out.println("[주무국가] " + jpProductOrder.getOrderCountry());
		System.out.println("[관세] " + NumberFormat.getInstance().format(jpProductOrder.calculateTax()));
		System.out.println("[환율 적용 가격] " + NumberFormat.getInstance().format(jpProductOrder.getCurrency()));
		
		System.out.println();
		ProductOrder canProductOrder = new CanProductOrder(product);
		System.out.println("[주무국가] " + canProductOrder.getOrderCountry());
		System.out.println("[관세] " + NumberFormat.getInstance().format(canProductOrder.calculateTax()));
		System.out.println("[환율 적용 가격] " + NumberFormat.getInstance().format(canProductOrder.getCurrency()));
	}
	
	private Product getProduct() {
		Product product = new Product("넥스브로커", 15000000);
		return product;
	}
}
