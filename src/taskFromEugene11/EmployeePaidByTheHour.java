package taskFromEugene11;

public class EmployeePaidByTheHour extends Employee {

	private final int RATE_PER_HOUR = 38;

	private double _salaryByTheHour;

	public EmployeePaidByTheHour(String _name, String _surname, int _age, String _department, String _post,
			double _salaryByTheHour) {
		super(_name, _surname, _age, _department, _post);
		setSalaryByTheHour(_salaryByTheHour);
	}

	public double getSalaryByTheHour() {
		return _salaryByTheHour;
	}

	public void setSalaryByTheHour(double _salaryByTheHour) {
		this._salaryByTheHour = _salaryByTheHour;
	}

	@Override
	public void salary(double x) {
		double salary = 20.8 * 8 * RATE_PER_HOUR;
		setSalaryByTheHour(salary);

	}

	@Override
	public void salary() {

	}

}
