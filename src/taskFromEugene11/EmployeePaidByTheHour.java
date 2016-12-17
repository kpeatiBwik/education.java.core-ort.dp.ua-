package taskFromEugene11;

public class EmployeePaidByTheHour extends Employee {

	public EmployeePaidByTheHour(int _id, String _name, double _salaryByTheHour) {
		super(_name, _id);
		salary(_salaryByTheHour);
	}

	@Override
	public void salary(double salaryPerHour) {
		_salary = 20.8 * 8 * salaryPerHour;
	}

}
