package kr.or.kosta.pattern.bridge.problem;

public class Main {
	public static void main(String[] args) {
		Formatter d1 = new TextFormatter("Gasan-Dong Genumcheon-Gu, Seoul, Korea");
		Formatter d2 = new HtmlFormatter("Gasan-Dong Genumcheon-Gu, Seoul, Korea");
		d1.print();
		d2.print();
	}
}
