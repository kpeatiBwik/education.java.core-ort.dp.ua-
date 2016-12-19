package taskFromEugene11;

public class EmployeeWithFixedSalary extends Employee {

	/**
	 * Создание сотрудника с фиксированной зп
	 * 
	 * @param _id ид сотрудника
	 * @param _name имя сотрудника
	 * @param _salary фиксированная зп 
	 */
	public EmployeeWithFixedSalary(int _id, String _name, double _salary) {
		super(_name, _id);
		salary(_salary);
	}

	@Override
	public double salary(double uniquSalary) {
		return _salary = uniquSalary;
	}

}
