package kr.or.kosta.pattern.templatemethod.problem;

public class Client {

	public static void main(String[] args) {
		Client client = new Client();
		
		Coffee coffee = client.pressCoffeeButton();
		coffee.prepareRecipe();
		
		System.out.println();
		Tea tea = client.pressTeaButton();
		tea.prepareRecipe();
	}
	
	public Coffee pressCoffeeButton() {
		System.out.println("커피버튼을 누르셨습니다.");
		return new Coffee();
	}
	
	public Tea pressTeaButton() {
		System.out.println("레몬차 버튼을 누르셨습니다.");
		return new Tea();
	}
}
