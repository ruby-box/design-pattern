package kr.or.kosta.pattern.bridge.problem;

public abstract class Formatter {
	
	/**
	 * Header를 출력한다.
	 */
	public abstract void printHeader();
	
	/**
	 * 본문(주소)을 출력한다.
	 */
	public abstract void printBody();
	
	/**
	 * Tail을 출력한다.
	 */
	public abstract void printTail();
	
	/**
	 * 출력 : Header, 주소, Tail 순으로 출력한다.
	 */
	public final void print() {
		printHeader();
		printBody();
		printTail();
	}
}
