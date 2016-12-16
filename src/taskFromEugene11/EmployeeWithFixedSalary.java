package taskFromEugene11;

public class EmployeeWithFixedSalary extends Employee {

	public EmployeeWithFixedSalary(int _id,String _name, double _salary) {
		super(_name, _id);
		salary(_salary);
	}

	@Override
	public void salary(double x) {
		_salary = x;
	}

}
