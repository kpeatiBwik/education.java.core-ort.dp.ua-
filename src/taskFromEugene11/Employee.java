package taskFromEugene11;

/*11. Построить три класса (базовый и 2 потомка), описывающих некоторых работников с почасовой оплатой (один из потомков) 
 * и фиксированной оплатой (второй потомок). Описать в базовом классе абстрактный метод для расчета среднемесячной заработной платы. 
 * Для «повременщиков» формула для расчета такова: «среднемесячная заработная плата = 20.8 * 8 * почасовую ставку», для работников с 
 * фиксированной оплатой «среднемесячная заработная плата = фиксированной месячной оплате».
a) Упорядочить всю последовательность работников по убыванию среднемесячного заработка. При совпадении зарплаты – упорядочивать данные 
по алфавиту по имени. Вывести идентификатор работника, имя и среднемесячный заработок для всех элементов списка.
b) Вывести первые 5 имен работников из полученного в пункте а) списка.
c) Вывести последние 3 идентификатора работников из полученного в пункте а) списка.*/

/**
 * Базовый класс для сотрудника
 * 
 */
public abstract class Employee {

	private String _name;
	private double _salary;
	private int _id;

	public Employee(String _name, int _id) {
		super();
		setName(_name);
		setId(_id);
	}

	public String getName() {
		return _name;
	}

	public void setName(String _name) {
		this._name = _name;
	}

	/**
	 * метод расчета зарплаты, записывает данные в поле _salary
	 * 
	 * необходимо вызывать при создании сотрудника
	 * 
	 * @param x
	 *            принимает уникальную зп для каждого типа работника
	 * 
	 */
	public abstract void salary(double uniquSalary);

	protected double getSalary() {
		return _salary;
	}

	protected void setSalary(double _salary) {
		this._salary = _salary;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id: ").append(getId()).append("\nимя сотрудника: ").append(getName()).append("\nзарплата: ")
				.append(getSalary()).append("\n*************************************");
		return sb.toString();
	}

	public int getId() {
		return _id;
	}

	public void setId(int _id) {
		this._id = _id;
	}

}
