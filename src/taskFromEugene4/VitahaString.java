package taskFromEugene4;

/*4. 
Создать свой собственный класс строки, базирующийся на массиве 
символов. Реализовать для него простейшие операции: создание, возврат длины, сложение строк, далее на ваш выбор*/

public class VitahaString {

	private char[] _masschars;

	public VitahaString() {

	}

	public VitahaString(char[] masschars) {
		_masschars = masschars;
	}

	public char[] getMasschars() {
		return _masschars;
	}

	public void setMasschars(char[] masschars) {
		_masschars = masschars;
	}

}
