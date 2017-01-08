package taskFromEugene11;

import java.util.Arrays;
import java.util.Comparator;

public class TestMain<E> {

	public static void main(String[] args) {

		Employee[] arrayEmployee = { new EmployeeWithFixedSalary(0, "vasya", 423.24),
				new EmployeePaidByTheHour(1, "olya", 8), new EmployeeWithFixedSalary(2, "petya", 658.24),
				new EmployeePaidByTheHour(3, "aolya", 8), new EmployeeWithFixedSalary(4, "dima", 423.24),
				new EmployeePaidByTheHour(5, "vitaha", 8), new EmployeeWithFixedSalary(6, "igar'", 658.24),
				new EmployeePaidByTheHour(7, "ira", 8) };

		// a
		System.out.println("A\n---------------------");
		Arrays.sort(arrayEmployee, new EmployeeComparator());
		for (int i = 0; i < arrayEmployee.length; ++i) {
			System.out.println(arrayEmployee[i]);
		}
		// b
		System.out.println("\nB\n---------------------");
		for (int i = 0; i < 5; ++i) {
			System.out.println(arrayEmployee[i].getName());
		}
		// c
		System.out.println("\nC\n---------------------");
		for (int i = arrayEmployee.length - 3; i < arrayEmployee.length; ++i) {
			System.out.println(arrayEmployee[i].getId());
		}
	}
}

class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee arg0, Employee arg1) {
		int result = Double.compare(arg0.getSalary(), arg1.getSalary()) * -1;
		if (result == 0) {
			result = arg0.getName().toLowerCase().compareTo(arg1.getName().toLowerCase());
		}
		return result;
	}

}