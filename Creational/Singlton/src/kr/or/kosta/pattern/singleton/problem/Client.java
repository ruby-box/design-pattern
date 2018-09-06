package kr.or.kosta.pattern.singleton.problem;

public class Client {

	public static void main(String[] args) {
		print1();
		// 많은 작업 후
		print2();
	}
	
	private static void print1() {
		PrintSpool.SPOOL = new PrintSpool();
		PrintSpool.SPOOL.print("디자인 패턴");
	}
	
	private static void print2() {
		PrintSpool.SPOOL = new PrintSpool();
		PrintSpool.SPOOL.print("Creational 패턴");
	}

}
