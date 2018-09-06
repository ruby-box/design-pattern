package kr.or.kosta.pattern.prototype.problem;

public class LCompanyRemocon {

	public static void main(String[] args) throws Exception {
		LCompanyRemocon remocon = new LCompanyRemocon();
		remocon.watchingTV(new LCompanyTV());
	}
	
	/**
	 * L사 TV 시청
	 * @param lcompanyTV
	 */
	public void watchingTV(LCompanyTV lcompanyTV) {
		lcompanyTV.turnOn();
		for (int i=0; i<3; i++) {
			lcompanyTV.changeChannel();
		}
		lcompanyTV.turnOff();
	}
}
