package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import model.Department;
import model.Employee;

public class Example1 {

	public static void main(String[] args) {

		List<Employee> emplist = new ArrayList<Employee>();
		List<Department> deptList = new ArrayList<Department>();
		emplist.add(new Employee(new Integer(1), "shekar"));
		emplist.add(new Employee(new Integer(2), "Puttaraju"));

		deptList.add(new Department(new Integer(1), "Dev"));
		deptList.add(new Department(new Integer(2), "Sales"));

		List<Employee> filteredList = emplist
				.stream().filter(
						empl -> deptList.stream()
								.anyMatch(dept -> dept.getDepartment().equals("Sales")
										&& empl.getEmployeeId().equals(dept.getEmployeeId())))
				.collect(Collectors.toList());

		List<Employee> testList = emplist
				.stream().filter(
						emp1 -> deptList.stream()
								.anyMatch(dept -> dept.getDepartment().equals("Dev")
										&& emp1.getEmployeeId().equals(dept.getEmployeeId())))
				.collect(Collectors.toList());
	}

}
