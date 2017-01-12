package taskFromEugene3;

/*3.
Класс Дробное число со знаком (Fractions). Число должно быть представлено двумя полями: 
целая часть - длинное целое со знаком, дробная часть - беззнаковое короткое целое. 
Реализовать арифметические операции сложения, вычитания, умножения и операции сравнения. 
В функции main проверить эти методы
*/

public class Fractions {

	private long firstOperand;
	private short secondOperand;

	public Fractions() {

	}
	
	public Fractions(long firstOperand, short secondOperand) {
		setFirstOperand(firstOperand);
		setSecondOperand(secondOperand);
	}
	
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
	

	
	public void plus (Fractions f1 , Fractions f2){

	}

}