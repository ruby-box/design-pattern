package kr.or.kosta.pattern.abstractfactory.problem;

public class KRAddress {

	private static final String SPACE = " ";
	
	/**
	 * 우편번호
	 */
	private String postalCode;
	
	/**
	 * 국가명
	 */
	private String country;
	
	/**
	 * 도시명
	 */
	private String city;
	
	/**
	 * 지역명 (구/군)
	 */
	private String region;
	
	/**
	 * 주소 (동/번지)
	 */
	private String addr;
	
	/**우편번호 리턴
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * 우편번호 셋팅
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * 국가명 리턴
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * 국가명 셋팅
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * 도시명 리턴
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * 도시명 셋팅
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}

	/**
	 * @return the addr
	 */
	public String getAddr() {
		return addr;
	}

	/**
	 * @param addr1 the addr to set
	 */
	public void setAddr(String addr) {
		this.addr = addr;
	}

	
	/**
	 * 전체 주소
	 * @return
	 */
	public String getFullAddress() {
		return postalCode + SPACE
				+ city + SPACE
				+ region + SPACE
				+ addr;
	}
}
