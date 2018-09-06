package kr.or.kosta.pattern.bridge.problem;

public class HtmlFormatter extends Formatter {

	private String string;
	
	public HtmlFormatter(String string) {
		this.string = string;
	}
	
	public void printHeader() {
		System.out.println("<table border=\"1\">");
	}
	
	public void printBody() {
		System.out.println("<tr><td>" + string + "</td></tr>");
	}
	
	public void printTail() {
		System.out.println("</table>");
	}
}
