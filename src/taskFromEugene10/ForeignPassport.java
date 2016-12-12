package taskFromEugene10;

import java.util.ArrayList;

public class ForeignPassport extends Passport {

	private int _foreignPassportNumber;
	private ArrayList<Visa> _visas = new ArrayList<Visa>();

	public ForeignPassport(String passwordSeria, int passportNumber, String name, String surName, int year, int month,
			int day, String city, String issuedBy, int foreignPassportNumber) {
		super(passwordSeria, passportNumber, name, surName, year, month, day, city, issuedBy);
		setForeignPassportNumber(foreignPassportNumber);
	}

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

	public String getVisas() {
		String vs = "в загрн паспорте ещё нету виз";
		for (Visa visa : _visas) {
			vs = visa.toString();
		}
		return vs;
	}

	public void setVisa(String visaType, int period) {
		_visas.add(new Visa(visaType, period));
	}

}
