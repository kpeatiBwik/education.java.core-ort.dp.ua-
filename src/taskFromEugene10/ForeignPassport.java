package taskFromEugene10;

import java.time.LocalDate;

public class ForeignPassport extends Passport {

	private Integer _foreignPassportNumber;
	private Visa _visa;

	public ForeignPassport(PassportSerie _passportSerie, Integer _passportNumber, String _name, String _surName,
			int year, int month, int day, String _city, String _issuedBy, Integer _foreignPassportNumber,
			VisaType visaType, LocalDate localDate, Integer x) {
		super(_passportSerie, _passportNumber, _name, _surName, year, month, day, _city, _issuedBy);
		set_foreignPassportNumber(_foreignPassportNumber);
		set_visa(visaType, localDate, x);

	}

	public Integer get_foreignPassportNumber() {
		return _foreignPassportNumber;
	}

	public void set_foreignPassportNumber(Integer _foreignPassportNumber) {
		this._foreignPassportNumber = _foreignPassportNumber;
	}

	public Visa get_visa() {
		return _visa;
	}

	public void set_visa(VisaType visaType, LocalDate localDate, Integer x) {
		this._visa = new Visa(visaType, LocalDate.now(), x);
	}

	public ForeignPassport() {

	}

}
