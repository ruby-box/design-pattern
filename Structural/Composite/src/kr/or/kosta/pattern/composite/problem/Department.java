package kr.or.kosta.pattern.composite.problem;

import java.util.ArrayList;
import java.util.List;

/**
 * 부서
 */
public class Department {
	// 부서이름
	private String name;
	// 부서위치
	private String location;
	// 부서에 속한 직원들
	public List<Employee> employees = new ArrayList<Employee>();
	
	public Department(String name, String location) {
		this.name = name;
		this.location = location;
	}
	
	/**
	 * 부서에 직원을 추가한다.
	 * @param employee 직원
	 */
	public void addEmployee(Employee employee) {
		this.employees.add(employee);
	}

	/**
	 * 부서이름을 반환한다.
	 * @return 부서이름
	 */
	public String getName() {
		return name;
	}

	/**
	 * 부서위치를 반환한다.
	 * @return 부서위치
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * 부서의 모든 직원들을 반환한다.
	 * @return 직원들
	 */
	public List<Employee> getEmployees() {
		return employees;
	}

}
