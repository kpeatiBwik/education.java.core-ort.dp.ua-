package taskFromEugene6;

/*6.
Определить класс, хранящий такую информацию о пользователе библиотеки: ФИО, номер читательского билета, факультет, 
дата рождения, телефон. Доступ к данным класса организовать посредством соответствующих методов. Разработать программу, 
в которой создается массив объектов данного класса. В программе организовать:
– ввод данных о читателях;
– вывод данных массива на экран;
– поиск (по фамилии или факультету) и вывод информации о читателях*/

public class UserLibrary {

	private String _name;
	private String _surname;
	private String _patronymic;
	private String _ticketNumber;
	private Faculty _faculty;
	private String _birthday;
	private long _phoneNumber;

	public UserLibrary() {

	}

	public UserLibrary(String _name, String _surname, String _patronymic, String _ticketNumber, Faculty faculty,
			String _birthday, Long _phoneNumber) {
		set_name(_name);
		set_surname(_surname);
		set_patronymic(_patronymic);
		set_ticketNumber(_ticketNumber);
		set_faculty(faculty);
		set_birthday(_birthday);
		set_phoneNumber(_phoneNumber);
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public String get_surname() {
		return _surname;
	}

	public void set_surname(String _surname) {
		this._surname = _surname;
	}

	public String get_patronymic() {
		return _patronymic;
	}

	public void set_patronymic(String _patronymic) {
		this._patronymic = _patronymic;
	}

	public String get_ticketNumber() {
		return _ticketNumber;
	}

	public void set_ticketNumber(String _ticketNumber) {
		this._ticketNumber = _ticketNumber;
	}

	public Faculty get_faculty() {
		return _faculty;
	}

	public void set_faculty(Faculty faculty) {
		this._faculty = faculty;
	}

	public String get_birthday() {
		return _birthday;
	}

	public void set_birthday(String _birthday) {
		this._birthday = _birthday;
	}

	public Long get_phoneNumber() {
		return _phoneNumber;
	}

	public void set_phoneNumber(Long _phoneNumber) {
		this._phoneNumber = _phoneNumber;
	}

}
