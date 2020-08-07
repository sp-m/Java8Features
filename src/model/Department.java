package model;

public class Department {

	Integer employeeId;
	String department;

	
	public Department(Integer employeeId, String department) {
		super();
		this.employeeId = employeeId;
		this.department = department;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
