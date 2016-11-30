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
	private String _faculty;
	private String _birthday;
	private long _phoneNumber;
	private final long DEFAULT_PHONE_NUMBER = 777777;
	
	
	public UserLibrary() {

	}

	public UserLibrary(String _name, String _surname, String _patronymic, String _ticketNumber, String faculty,
			String _birthday, Long _phoneNumber) {
		setName(_name);
		setSurname(_surname);
		setPatronymic(_patronymic);
		setTicketNumber(_ticketNumber);
		setFaculty(faculty);
		setBirthday(_birthday);
		setPhoneNumber(_phoneNumber);
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

	public String getPatronymic() {
		return _patronymic;
	}

	public void setPatronymic(String _patronymic) {
		this._patronymic = _patronymic;
	}

	public String getTicketNumber() {
		return _ticketNumber;
	}

	public void setTicketNumber(String _ticketNumber) {
		this._ticketNumber = _ticketNumber;
	}

	public String getFaculty() {
		return _faculty;
	}

	public void setFaculty(String faculty) {
		this._faculty = faculty;
	}

	public String getBirthday() {
		return _birthday;
	}

	public void setBirthday(String _birthday) {
		this._birthday = _birthday;
	}

	public Long getPhoneNumber() {
		return _phoneNumber;
	}

	public void setPhoneNumber(Long _phoneNumber) {
		this._phoneNumber = _phoneNumber;
	}

}
