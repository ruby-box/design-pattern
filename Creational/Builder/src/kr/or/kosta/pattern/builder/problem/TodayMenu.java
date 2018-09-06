package kr.or.kosta.pattern.builder.problem;

public class TodayMenu {
	
	private StringBuilder buffer = new StringBuilder();

	/**
	 * 식단 생성
	 * @return 식단결과
	 */
	public String construct() {
		makeTitle("11월 27일 식단");
		makeString("아침식단");
		makeItems(new String[]{
				"토스트",
				"유우",
				"달걀"
		});
		
		makeString("점심식단");
		makeItems(new String[] {
				"된장찌게",
				"김치",
				"고등어 조림"
		});
		
		buffer.append("==========================\n");
		return buffer.toString();
	}
	
	// 식단 제목 생성
	private void makeTitle(String title) {
		buffer.append("==========================\n");
		buffer.append("『" + title + "』");
		buffer.append("\n");
	}

	// 소제목 생성
	private void makeString(String str) {
		buffer.append("\n");
		buffer.append("■ " + str + "\n");
	}

	// 식단 아이템 생성
	private void makeItems(String[] items) {
		for (int i = 0; i < items.length; i++) {
			buffer.append("-" + items[i] + "\n");
		}
	}
	
}
