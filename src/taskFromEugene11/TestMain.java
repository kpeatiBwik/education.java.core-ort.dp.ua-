package taskFromEugene11;

import java.util.ArrayList;

public class TestMain {

	public static void main(String[] args) {

		ArrayList<Employee> arrayEmployee = new ArrayList<Employee>();
		arrayEmployee.add(new EmployeeWithFixedSalary("vasya", "fedorov", 18, "qa", "qa engineer", 423.24));
		arrayEmployee.add(new EmployeeWithFixedSalary("petya", "vladimirov", 23, "java", "developer", 658.24));
		arrayEmployee.add(new EmployeePaidByTheHour("olya", "sech", 26, "hr", "hr", 8));
		arrayEmployee.add(new EmployeePaidByTheHour("kolya", "sech", 16, "php", "developer", 14));
	}

}
