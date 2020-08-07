package model;

public class Employee {
	Integer employeeId;
	String employeeName;

	public Employee(Integer employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}    

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

}
