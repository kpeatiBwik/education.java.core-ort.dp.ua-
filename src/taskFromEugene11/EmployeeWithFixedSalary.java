package taskFromEugene11;

public class EmployeeWithFixedSalary extends Employee {

	private double _fixedSalary;

	public EmployeeWithFixedSalary(String _name, String _surname, int _age, String _department, String _post,
			double _fixedSalary) {
		super(_name, _surname, _age, _department, _post);
		setFixedSalary(_fixedSalary);
	}

	public double getFixedSalary() {
		return _fixedSalary;
	}

	public void setFixedSalary(double _fixedSalary) {
		this._fixedSalary = _fixedSalary;
	}

	@Override
	public void salary() {

	}

	@Override
	public void salary(double x) {

	}

}
