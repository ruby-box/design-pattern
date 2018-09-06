package kr.or.kosta.pattern.bridge.problem;

public class TextFormatter extends Formatter {

	private String string;
	private int width;
	
	public TextFormatter(String string) {
		this.string = string;
		this.width = string.getBytes().length;
	}
	
	public void printHeader() {
		printLine();
	}
	
	public void printBody() {
		System.out.println("|" + string + "|");
	}
	
	public void printTail() {
		printLine();
	}
	
	private void printLine() {
		System.out.print("+");
		for (int i = 0; i < width; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}

}
