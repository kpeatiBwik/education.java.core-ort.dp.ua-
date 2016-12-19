package taskFromEugene11;

public class EmployeePaidByTheHour extends Employee {

	/**
	 * Создание сотрудника с почасовой оплатой
	 * 
	 * @param _id ид сотрудника
	 * @param _name имя сотрубника
	 * @param _salaryByTheHour ставка за час 
	 */
	public EmployeePaidByTheHour(int _id, String _name, double _salaryByTheHour) {
		super(_name, _id);
		salary(_salaryByTheHour);
	}

	@Override
	public double salary(double uniquSalary) {
		return _salary = 20.8 * 8 * uniquSalary;
	}

}
