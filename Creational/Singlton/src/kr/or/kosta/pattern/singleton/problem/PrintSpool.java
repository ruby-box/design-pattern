package kr.or.kosta.pattern.singleton.problem;

public class PrintSpool {
	// 생성된 인스턴스 수
	public static int numOfInstance = 0;
	// 생성된 인스턴스를 일관된 방법으로 접근하도록
	// 제공되는 static 변수
	public static PrintSpool SPOOL;
	
	public PrintSpool() {
		// 인스턴스 수를 증가하고 1개 이상 생성되면 에러를 발생한다.
		numOfInstance++;
		if (numOfInstance > 1) {
			throw new RuntimeException("이 인스턴스는 2개 이상 생성될 수 없습니다");
		}
	}
	
	public void print(String string) {
		System.out.println("출력 : " + string);
	}
}
