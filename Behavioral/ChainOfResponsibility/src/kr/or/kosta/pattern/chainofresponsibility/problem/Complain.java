package kr.or.kosta.pattern.chainofresponsibility.problem;

public class Complain {

	public static final int DEVELOP_TROUBLE = 1;
	
	public static final int UNKINDNESS_SERVICE = 2;
	
	public static final int DELIVERY_DELAYING = 3;
	
	public static final int DEFICIENT_INFORMATION = 4;
	
	public static final String NOT_MATCH_TYPE = "Not Match Complain";
	
	private int type;
	
	private String message;
	
	private String result;
	
	public Complain(int type, String message) {
		this.type = type;
		this.message = message;
	}
	
	public int getType() {
		return type;
	}
	
	public String getMessage() {
		return message;
	}
	
	public String getResult() {
		return result;
	}
	
	public void setResult(String result) {
		this.result = result;
	}
}
