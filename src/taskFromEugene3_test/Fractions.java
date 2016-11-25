package taskFromEugene3_test;

/*3.
Класс Дробное число со знаком (Fractions). Число должно быть представлено двумя полями: 
целая часть - длинное целое со знаком, дробная часть - беззнаковое короткое целое. 
Реализовать арифметические операции сложения, вычитания, умножения и операции сравнения. 
В функции main проверить эти методы
*/

public class Fractions {

	private long firstOperand;
	private short secondOperand;

	public long getFirstOperand() {
		return firstOperand;
	}

	public void setFirstOperand(long firstOperand) {
		this.firstOperand = firstOperand;
	}

	public short getSecondOperand() {
		return secondOperand;
	}

	public void setSecondOperand(short secondOperand) {
		this.secondOperand = secondOperand;
	}

	public double addition(double x, double y) {
		double result = x + y;
		return result;
	}

	public double subtraction(double x, double y) {
		double result = x - y;
		return result;
	}

	public double multiplication(double x, double y) {
		double result = x * y;
		return result;
	}

	public double division(double x, double y) {
		double result = x / y;
		return result;
	}

	public String comparison(double x, double y) {
		String s = null;
		if (x > y) {
			s = "Первый операнд больше второго";
			return s;
		} else if (x < y) {
			s = "Второй операнд больше первого";
			return s;
		} else {
			s = "Операнды равны";
		}
		return s;

	}
}
