package taskFromEugene10;

import java.util.ArrayList;
import java.util.List;

public class ForeignPassport extends Passport {

	private int _foreignPassportNumber;
	private List<Visa> _visas = new ArrayList<Visa>();

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
		String vs = "в загран паспорте ещё нету виз";
		for (int i = 0; i < _visas.size(); i++) {
			vs = _visas.toString();
		}
		return vs;
	}

	public void setVisa(String visaType, int period) {
		if (visaType == null) {
			_visas.add(new Visa(Constants.DEFAULT_VISA, period));
		} else {
			_visas.add(new Visa(visaType, period));
		}
	}

}
