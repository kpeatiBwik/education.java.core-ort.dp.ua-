package taskFromEugene11;

/*11. Построить три класса (базовый и 2 потомка), описывающих некоторых работников с почасовой оплатой (один из потомков) 
 * и фиксированной оплатой (второй потомок). Описать в базовом классе абстрактный метод для расчета среднемесячной заработной платы. 
 * Для «повременщиков» формула для расчета такова: «среднемесячная заработная плата = 20.8 * 8 * почасовую ставку», для работников с 
 * фиксированной оплатой «среднемесячная заработная плата = фиксированной месячной оплате».
a) Упорядочить всю последовательность работников по убыванию среднемесячного заработка. При совпадении зарплаты – упорядочивать данные 
по алфавиту по имени. Вывести идентификатор работника, имя и среднемесячный заработок для всех элементов списка.
b) Вывести первые 5 имен работников из полученного в пункте а) списка.
c) Вывести последние 3 идентификатора работников из полученного в пункте а) списка.*/

public abstract class Employee {

	final int DEFAULT_AGE = 18;

	private String _name;
	private String _surname;
	private int _age;
	private String _department;
	private String _post;

	public Employee(String _name, String _surname, int _age, String _department, String _post) {
		super();
		setName(_name);
		setSurname(_surname);
		setAge(_age);
		setDepartment(_department);
		setPost(_post);
	}

	public String getName() {
		return _name;
	}

	public void setName(String _name) {
		this._name = _name;
	}

	public String getSurname() {
		return _surname;
	}

	public void setSurname(String _surname) {
		this._surname = _surname;
	}

	public int getAge() {
		return _age;
	}

	public void setAge(int _age) {
		if (_age < 18) {
			this._age = DEFAULT_AGE;
		} else {
			this._age = _age;
		}
	}

	public String getDepartment() {
		return _department;
	}

	public void setDepartment(String _department) {
		this._department = _department;
	}

	public String getPost() {
		return _post;
	}

	public void setPost(String _post) {
		this._post = _post;
	}

	public abstract void salary();

	public abstract void salary(double x);

}
