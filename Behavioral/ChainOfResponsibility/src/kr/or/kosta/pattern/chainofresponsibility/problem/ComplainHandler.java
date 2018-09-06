package kr.or.kosta.pattern.chainofresponsibility.problem;

import java.util.ArrayList;
import java.util.List;

public class ComplainHandler {
	
	private List<Complain> complainContainer;
	
	public void addComplain(Complain complain) {
		if (complainContainer == null) {
			complainContainer = new ArrayList<Complain>();
		}
		complainContainer.add(complain);
	}

	public void handleComplain() throws Exception {
		if (complainContainer == null || complainContainer.isEmpty()) {
			System.out.println("처리할 불만사항이 없습니다.");
			return;
		}
		
		System.out.println("요청하신 불만사항을 처리합니다.");
		for (int i=0; i<complainContainer.size(); i++) {
			requestResolve(complainContainer.get(i));
		}
	}
	
	private void requestResolve(Complain complain) {
		switch (complain.getType()) {
			case Complain.DEVELOP_TROUBLE:
				System.out.println("[내용] " + complain.getMessage());
				System.out.println("[처리] 고장신고가 접수되었습니다. 10일 이내에 서비스센터에 방문하셔서 수리하십시요...");
				break;
			case Complain.UNKINDNESS_SERVICE:
				System.out.println("[내용] " + complain.getMessage());
				System.out.println("[처리] 사내 친절교육을 강화하도록 하여 개선하도록 하겠습니다.");
				break;
			case Complain.DELIVERY_DELAYING:
				System.out.println("[내용] " + complain.getMessage());
				System.out.println("[처리] 현재 재고가 없습니다. 환불조치 하겠습니다.");
				break;
			case Complain.DEFICIENT_INFORMATION:
				System.out.println("[내용] " + complain.getMessage());
				System.out.println("[처리] 제품 카탈로그를 발송하였습니다. 원하시는 제품을 선택하시여 주문하시기 바랍니다.");
				break;
			default:
				System.out.println("요청하신 불만사항(" + complain.getType() + ")은 처리가능한 유형이 아닙니다.");
				break;
		}
	}
	
}
