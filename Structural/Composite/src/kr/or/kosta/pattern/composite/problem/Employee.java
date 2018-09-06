package kr.or.kosta.pattern.composite.problem;

/**
 * 직원
 */
public class Employee {
	// 직원이름
	private String name;
	// 직원성별 (교육 편의상 string으로 처리함.)
	private String gender;
	
	public Employee(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	
	/**
	 * 직원이름 반환한다.
	 * @return 직원이름
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 직원성별을 반환한다.
	 * @return 직원성별
	 */
	public String getGender() {
		return gender;
	}
}
