package kr.or.kosta.pattern.proxy.problem;

public interface Printable {
	/**
	 * 기본프린터인지 아닌지 설정한다.
	 * @param b 기본프린터일 경우 true, 아닐 경우 false
	 */
	void setDefaultPrinter(boolean b);
	/**
	 * 기본프린터인지 물어본다.
	 * @return 기본프린터일 경우 true, 아닐 경우 false
	 */
	boolean isDefaultPrinter();
	/**
	 * 프린터 이름을 반환한다.
	 * @return 프린터 이름
	 */
	String getPrinterName();
	/**
	 * 출력한다.
	 * @param string 출력할 문자열
	 */
	void print(String string);
}
