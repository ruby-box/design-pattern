package kr.or.kosta.pattern.abstractfactory.problem;

public class Client {

	public static void main(String[] args) throws Exception {
		System.out.println("국내 거주 주소 및 전화번호를 가져온다.");
		Client client = new Client();
		KRAddress krAddress = client.createAddress("KR");
		KRPhoneNumber krPhoneNumber = client.createPhoneNumber("KR");
		
		System.out.println("주소 : " + krAddress.getFullAddress());
		System.out.println("전화번호 : (" + krPhoneNumber.getCountryCode() + ") " + krPhoneNumber.getPhoneNumber());
	}
	
	/**
	 * 주소를 가져온다.
	 * @return KRAddress
	 */
	public KRAddress createAddress(String countryType) {
		KRAddress krAddress = null;
		
		if (countryType.equals("KR")) {
			krAddress = new KRAddress();
			
			krAddress.setPostalCode("153-803");
			krAddress.setCountry("대한민국");
			krAddress.setCity("서울");
			krAddress.setRegion("금천구");
			krAddress.setAddr("가산동 우림라이온스밸리 A동 405호");
		}
		
		return krAddress;
	}
	
	/**
	 * 전화번호를 가져온다.
	 * @param countryType
	 * @return
	 */
	public KRPhoneNumber createPhoneNumber(String countryType) {
		KRPhoneNumber krPhoneNumber = null;
		
		if (countryType.equals("KR")) {
			krPhoneNumber = new KRPhoneNumber();
			
			krPhoneNumber.setPhoneNumber("02-2026-4016");
		}
		
		return krPhoneNumber;
	}
}
