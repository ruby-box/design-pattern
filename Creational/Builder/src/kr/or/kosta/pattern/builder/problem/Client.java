package kr.or.kosta.pattern.builder.problem;

public class Client {

	public static void main(String[] args) {
		TodayMenu todayMenu = new TodayMenu();
		String result = todayMenu.construct();
		
		System.out.println(result);
	}

}
