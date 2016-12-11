package taskFromEugene10;

import java.time.LocalDate;

/*10. Создайте класс Passport, который будет содержать 
 * паспортные данные гражданина Украниы. С помощью наследования (расширения), 
 * создайте класс ForeignPassport (паспорт для выезда за границу) производный от Passport. 
 * Загранпаспорт содержит данные о визах и номер загранпаспорта. Визу рекомендую реализовать 
 * как отдельный класс и типом визы и датой открытия и закрытия (плюс дополнительные свойства на ваше усмотрение)*/

public class Passport {
	private String _passportSerie;
	private Integer _passportNumber;
	private String _name;
	private String _surName;
	private LocalDate _birthday = LocalDate.of(1970, 01, 01);
	private String _city;
	private String _issuedBy;
	private LocalDate _dateOfIssue = LocalDate.now();

	public Passport() {

	}

	public Passport(String passwordSeria, Integer passportNumber, String name, String surName, int year, int month,
			int day, String city, String issuedBy) {
		super();
		setPassportSerie(passwordSeria);
		setPassportNumber(passportNumber);
		setName(name);
		setSurName(surName);
		setBirthday(year, month, day);
		setCity(city);
		setIssuedBy(issuedBy);
	}

	public String getPassportSerie() {
		return _passportSerie;
	}

	public void setPassportSerie(String passwordSeria) {
		this._passportSerie = passwordSeria;
	}

	public Integer getPassportNumber() {
		return _passportNumber;
	}

	public void setPassportNumber(Integer _passportNumber) {
		this._passportNumber = _passportNumber;
	}

	public String getName() {
		return _name;
	}

	public void setName(String _name) {
		this._name = _name;
	}

	public String getSurName() {
		return _surName;
	}

	public void setSurName(String _surName) {
		this._surName = _surName;
	}

	public LocalDate getBirthday() {
		return _birthday;
	}

	public void setBirthday(int x, int y, int z) {
		this._birthday = LocalDate.of(x, y, z);
	}

	public String getCity() {
		return _city;
	}

	public void setCity(String _city) {
		this._city = _city;
	}

	public String getIssuedBy() {
		return _issuedBy;
	}

	public void setIssuedBy(String _issuedBy) {
		this._issuedBy = _issuedBy;
	}

	public LocalDate getDateOfIssue() {
		return _dateOfIssue;
	}

}
