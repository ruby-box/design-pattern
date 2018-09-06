package kr.or.kosta.pattern.proxy.problem;

/**
 * 실제 출력을 담당하는 프린터
 */
public class Printer implements Printable {
	// 프린터 이름
	private String name;
	// 기본 프린터 여부
	private boolean defaultPrinter;
	
	public Printer(String name) {
		this.name = name;
		initialize();
	}

	public String getPrinterName() {
		return this.name;
	}
	
	public void setDefaultPrinter(boolean b) {
		defaultPrinter = b;
	}
	
	public boolean isDefaultPrinter() {
		return defaultPrinter;
	}
	
	public void print(String string) {
		System.out.println("===== " + name + " Printer =====");
		System.out.println(string);
	}
	
	// 프린터 초기화 작업. 이 작업은 많은 시간이 걸린다고 가정한다.
	// 예제에서는 5초 걸림
	private void initialize() {
		System.out.print(name + " Printer 생성 중 (5초) ...");
		for(int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000L);
			} catch (InterruptedException e) {
			}
			System.out.print('.');
		}
		System.out.println(" 완료.");
	}
}
