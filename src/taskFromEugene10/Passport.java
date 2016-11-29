package taskFromEugene10;

import java.time.LocalDate;

/*10. Создайте класс Passport, который будет содержать 
 * паспортные данные гражданина Украниы. С помощью наследования (расширения), 
 * создайте класс ForeignPassport (паспорт для выезда за границу) производный от Passport. 
 * Загранпаспорт содержит данные о визах и номер загранпаспорта. Визу рекомендую реализовать 
 * как отдельный класс и типом визы и датой открытия и закрытия (плюс дополнительные свойства на ваше усмотрение)*/

public class Passport {
	private PassportSerie _passportSerie;
	private Integer _passportNumber;
	private String _name;
	private String _surName;
	private LocalDate _birthday = LocalDate.of(1970, 01, 01);
	private String _city;
	private String _issuedBy;
	private LocalDate _dateOfIssue = LocalDate.now();

	public Passport() {

	}

	public Passport(PassportSerie _passportSerie, Integer _passportNumber, String _name, String _surName, int year,
			int month, int day, String _city, String _issuedBy) {
		super();
		set_passportSerie(_passportSerie);
		set_passportNumber(_passportNumber);
		set_name(_name);
		set_surName(_surName);
		set_birthday(year, month, day);
		set_city(_city);
		set_issuedBy(_issuedBy);
	}

	public PassportSerie get_passportSerie() {
		return _passportSerie;
	}

	public void set_passportSerie(PassportSerie _passportSerie) {
		this._passportSerie = _passportSerie;
	}

	public Integer get_passportNumber() {
		return _passportNumber;
	}

	public void set_passportNumber(Integer _passportNumber) {
		this._passportNumber = _passportNumber;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public String get_surName() {
		return _surName;
	}

	public void set_surName(String _surName) {
		this._surName = _surName;
	}

	public LocalDate get_birthday() {
		return _birthday;
	}

	public void set_birthday(int x, int y, int z) {
		this._birthday = LocalDate.of(x, y, z);
	}

	public String get_city() {
		return _city;
	}

	public void set_city(String _city) {
		this._city = _city;
	}

	public String get_issuedBy() {
		return _issuedBy;
	}

	public void set_issuedBy(String _issuedBy) {
		this._issuedBy = _issuedBy;
	}

	public LocalDate get_dateOfIssue() {
		return _dateOfIssue;
	}

	public void set_dateOfIssue() {
		this._dateOfIssue = LocalDate.now();
	}

}
