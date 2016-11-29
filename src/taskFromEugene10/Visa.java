package taskFromEugene10;

import java.time.LocalDate;

public class Visa {

	private VisaType _visaType;
	private LocalDate _startDate;
	private LocalDate _endDate;

	public Visa(VisaType visaType, LocalDate _startDate, Integer fIVE_YEARS) {
		super();
		set_visaType(visaType);
		set_startDate(_startDate);
		set_endDate(0);
	}

	public VisaType get_visaType() {
		return _visaType;
	}

	public void set_visaType(VisaType _visaType) {
		this._visaType = _visaType;
	}

	public LocalDate get_startDate() {
		return _startDate;
	}

	public void set_startDate(LocalDate _startDate) {
		this._startDate = _startDate;
	}

	public LocalDate get_endtDate() {
		return _endDate;
	}

	public void set_endDate(int visaType) {
		this._endDate = this._startDate.plusYears(visaType);
	}

}
