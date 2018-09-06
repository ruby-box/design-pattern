package kr.or.kosta.pattern.chainofresponsibility.problem;

public class Client {

	public static void main(String[] args) throws Exception {
		Client client = new Client();
		
		System.out.println("불만사항 처리를 요청합니다.");
		System.out.println();
		
		Complain[] complains = client.pileupComplain();
		ComplainHandler complainHandler = new ComplainHandler();
		for (int i=0; i<complains.length; i++) {
			complainHandler.addComplain(complains[i]);
		}
		
		complainHandler.handleComplain();
	}
	
	public Complain[] pileupComplain() {
		Complain[] complains = new Complain[2];
		complains[0] = new Complain(Complain.UNKINDNESS_SERVICE, "제품교환을 원하는데 전화를 받지 않습니다.");
		complains[1] = new Complain(Complain.DEFICIENT_INFORMATION, "넥스브로커 제품의 구성 및 사양을 원합니다.");
		
		return complains;
	}
}
