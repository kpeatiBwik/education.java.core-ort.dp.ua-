package taskFromEugene10;

public class ForeignPassport extends Passport {

	private int _foreignPassportNumber;
	private Visa _visa;

	public ForeignPassport(String passwordSeria, int passportNumber, String name, String surName, int year, int month,
			int day, String city, String issuedBy, int foreignPassportNumber, String visaType, int period) {
		super(passwordSeria, passportNumber, name, surName, year, month, day, city, issuedBy);
		setForeignPassportNumber(foreignPassportNumber);
		setVisa(visaType, period);
	}

	public int getForeignPassportNumber() {
		return _foreignPassportNumber;
	}

	public void setForeignPassportNumber(int _foreignPassportNumber) {
		this._foreignPassportNumber = _foreignPassportNumber;
	}

	public Visa getVisa() {
		return _visa;
	}

	public void setVisa(String visaType, int period) {
		_visa = new Visa(visaType, period);
	}

}
