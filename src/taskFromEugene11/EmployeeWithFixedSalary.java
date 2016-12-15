package taskFromEugene11;

public class EmployeeWithFixedSalary extends Employee {

	public EmployeeWithFixedSalary(String _name, String _surname, int _age, String _department, String _post,
			double _salary) {
		super(_name, _surname, _age, _department, _post);
		salary(_salary);
	}

	@Override
	public void salary(double x) {
		_salary = x;
	}

}
