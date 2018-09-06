package kr.or.kosta.pattern.prototype.problem;

public class SCompanyRemocon {

	public static void main(String[] args) throws Exception {
		SCompanyRemocon remocon = new SCompanyRemocon();
		remocon.watchingTV(new SCompanyTV());
	}
	
	/**
	 * S사 TV 시청
	 * @param scompanyTV
	 */
	public void watchingTV(SCompanyTV scompanyTV) {
		scompanyTV.turnOn();
		for (int i=0; i<2; i++) {
			scompanyTV.changeChannel();
		}
		scompanyTV.turnOff();
	}
}
