package kr.or.kosta.pattern.abstractfactory.problem;

public class KRPhoneNumber {

	private static final String COUNTRY_CODE = "89";
	
	private String phoneNumber;

	/**
	 * 국가코드 반환
	 * @return the countryCode
	 */
	public String getCountryCode() {
		return COUNTRY_CODE;
	}

	/**
	 * 전화번호 반환
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * 전화번호 설정
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
