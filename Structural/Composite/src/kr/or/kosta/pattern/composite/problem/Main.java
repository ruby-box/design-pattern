package kr.or.kosta.pattern.composite.problem;

public class Main {

	public static void main(String[] args) {
		/*
		 * 다음 구조대로 정보를 구성한다.
		 * 
		 * 미래소프트
		 *   - 개발부서 / 을지로
		 *     - 김개발 / 남자
		 *     - 이개발 / 여자
		 *   - 영업부서 / 종로
		 *     - 김영업 / 남자
		 *     - 이영업 / 여자
		 */
		Company company = new Company("미래소프트");
		
		Department deptDev = new Department("개발부서", "을지로");
		deptDev.addEmployee(new Employee("김개발", "남자"));
		deptDev.addEmployee(new Employee("이개발", "여자"));
		company.addDepartment(deptDev);
		
		Department deptSale = new Department("영업부서", "종로");
		deptSale.addEmployee(new Employee("김영업", "남자"));
		deptSale.addEmployee(new Employee("이영업", "여자"));
		company.addDepartment(deptSale);
		
		company.print();
	}

}
