package taskFromEugene4;

/*4. 
Создать свой собственный класс строки, базирующийся на массиве 
символов. Реализовать для него простейшие операции: создание, возврат длины, сложение строк, далее на ваш выбор*/

public class VitahaString {
	protected StringBuilder sb = new StringBuilder();

	private char[] _masschars;

	public char[] getMasschars() {
		return _masschars;
	}

	public void setMasschars(char[] masschars) {
		_masschars = masschars;
	}

	/**
	 * Создание строки из массива чаров
	 * 
	 * @param masschars
	 * @return строка из массива чаров
	 */
	public String createString(char[] masschars) {
		for (int i = 0; i < getLenght(masschars); i++) {
			sb.append(masschars[i]);
		}
		return sb.toString();
	}

	/**
	 * Возвращает длинну массива
	 * 
	 * @param masschars
	 * @return длинна массива
	 */
	public Integer getLenght(char[] masschars) {
		Integer massLenght = getMasschars().length;
		return massLenght;
	}

}
