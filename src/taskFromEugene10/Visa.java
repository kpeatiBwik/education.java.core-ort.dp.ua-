package taskFromEugene10;

import java.time.LocalDate;

public class Visa {

	private String _visaType;
	private LocalDate _startDate = LocalDate.now();
	private LocalDate _endDate;

	public Visa(String visaType, int period) {
		super();
		_visaType = setVisaType(visaType);
		_endDate = setEndDate(period);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("тип визы: ").append(_visaType).append("\nвиза действительна от ").append(_startDate).append(" до ")
				.append(_endDate);
		return sb.toString();
	}

	public Visa() {

	};

	public String getVisaType() {
		return _visaType;
	}

	public String setVisaType(String _visaType) {
		return this._visaType = _visaType;
	}

	public LocalDate getStartDate() {
		return _startDate;
	}

	public LocalDate getEndDate() {
		return _endDate;
	}

	public LocalDate setEndDate(int period) {
		return this._endDate = getStartDate().plusYears(period);
	}

}
