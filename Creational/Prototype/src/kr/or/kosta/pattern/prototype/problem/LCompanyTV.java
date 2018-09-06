package kr.or.kosta.pattern.prototype.problem;

public class LCompanyTV {

	/**
	 * 채널
	 */
	private static final String[] channels = { "SBS", "KBS2", "KBS1", "MBC", "EBS" };
	
	/**
	 * 채널Index
	 */
	private int channelIndex = 0;
	
	/**
	 * TV 켜기
	 */
	public void turnOn() {
		System.out.println("LCompany TV Turn on...");
	}
	
	/**
	 * 채널변경
	 */
	public String changeChannel() {
		if (channelIndex < 0) channelIndex = channels.length -1;
		else if (channelIndex > channels.length -1) channelIndex = 0;
		
		String channel = channels[channelIndex++];
		System.out.println("LCompany TV " + channel + " channel change...");
		
		return channel;
	}
	
	/**
	 * TV 끄기
	 */
	public void turnOff() {
		System.out.println("LCompany TV Turn off...");
	}
}
