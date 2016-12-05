package taskFromEugene10;

import java.time.LocalDate;

public class Visa {

	private VisaType _visaType;
	private LocalDate _startDate;
	private LocalDate _endDate;

	public Visa(VisaType visaType, LocalDate _startDate, Integer FIVE_YEARS) {
		super();
		setVisaType(visaType);
		setStartDate(_startDate);
		setEndDate(FIVE_YEARS);
	}

	public Visa() {

	};

	public VisaType getVisaType() {
		return _visaType;
	}

	public void setVisaType(VisaType _visaType) {
		this._visaType = _visaType;
	}

	public LocalDate getStartDate() {
		return _startDate;
	}

	public void setStartDate(LocalDate _startDate) {
		this._startDate = _startDate;
	}

	public LocalDate getEndDate() {
		return _endDate;
	}

	public void setEndDate(int visaType) {
		this._endDate = getStartDate().plusYears(visaType);
	}

}
