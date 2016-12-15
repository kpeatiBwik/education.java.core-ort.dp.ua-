package taskFromEugene11;

public class EmployeePaidByTheHour extends Employee {

	public EmployeePaidByTheHour(String _name, String _surname, int _age, String _department, String _post,
			double _salaryByTheHour) {
		super(_name, _surname, _age, _department, _post);
		salary(_salaryByTheHour);
	}

	@Override
	public void salary(double x) {
		_salary = 20.8 * 8 * x;
	}

}
