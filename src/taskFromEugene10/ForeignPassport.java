package taskFromEugene10;

public class ForeignPassport extends Passport {

	private Integer _foreignPassportNumber;
	private Visa _visa;

	public ForeignPassport(String passwordSeria, Integer passportNumber, String name, String surName, int year,
			int month, int day, String city, String issuedBy, Integer foreignPassportNumber, String visaType, int period) {
		super(passwordSeria, passportNumber, name, surName, year, month, day, city, issuedBy);
		setForeignPassportNumber(foreignPassportNumber);
		setVisa(visaType,period);
	}

	public Integer getForeignPassportNumber() {
		return _foreignPassportNumber;
	}

	public void setForeignPassportNumber(Integer _foreignPassportNumber) {
		this._foreignPassportNumber = _foreignPassportNumber;
	}

	public Visa getVisa() {
		return _visa;
	}

	public void setVisa(String visaType, int period) {
		_visa = new Visa(visaType, period);
	}

}
