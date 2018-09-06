package kr.or.kosta.pattern.templatemethod.problem;

public class Tea {

	public void prepareRecipe() {
		boilWater();
		steepTeaBag();
		pourInCup();
		addLemon();
	}
	
	public void boilWater() {
		System.out.println("Bolling Water...");
	}
	
	public void steepTeaBag() {
		System.out.println("Steeping the tea...");
	}
	
	public void addLemon() {
		System.out.println("Adding Lemon...");
	}
	
	public void pourInCup() {
		System.out.println("Pouring into cup...");
	}
}
