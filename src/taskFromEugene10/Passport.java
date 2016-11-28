package taskFromEugene10;

import java.time.LocalDate;

/*10. Создайте класс Passport, который будет содержать 
 * паспортные данные гражданина Украниы. С помощью наследования (расширения), 
 * создайте класс ForeignPassport (паспорт для выезда за границу) производный от Passport. 
 * Загранпаспорт содержит данные о визах и номер загранпаспорта. Визу рекомендую реализовать 
 * как отдельный класс и типом визы и датой открытия и закрытия (плюс дополнительные свойства на ваше усмотрение)*/

public class Passport {
	private String _passportSerie;
	private String _passportNumber;
	private String _name;
	private String _surName;
	private String _birthday;
	private String _issuedBy;
	private String _city;
	private LocalDate _dateOfIssue;
}
