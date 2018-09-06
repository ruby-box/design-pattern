package kr.or.kosta.pattern.composite.problem;

import java.util.ArrayList;
import java.util.List;

/**
 * 회사
 */
public class Company {
	// 회사이름
	private String name;
	// 회사의 부서들
	private List<Department> departments = new ArrayList<Department>();
	
	public Company(String name) {
		this.name = name;
	}
	
	/**
	 * 부서추가
	 * @param department 추가할 부서
	 */
	public void addDepartment(Department department) {
		this.departments.add(department);
	}
	
	/**
	 * 회사/부서/직원의 계층 정보를 출력한다.
	 */
	public void print() {
		System.out.println("회사 : " + this.name );
		for(int i = 0; i < this.departments.size(); i++) {
			Department department = this.departments.get(i);
			System.out.println("  - 부서 : " + department.getName() + "," + department.getLocation());
			List<Employee> employees = department.getEmployees();
			for(int j = 0; j < employees.size(); j++) {
				Employee employee = employees.get(j);
				System.out.println("    - 직원 : " + employee.getName() + ", " + employee.getGender());
			}
		}
	}
	
	/**
	 * 회사이름 반환
	 * @return 회사이름
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 회사의 부서들 반환
	 * @return 회사의 부서들
	 */
	public List<Department> getDepartments() {
		return departments;
	}
}
