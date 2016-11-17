package taskFromEugene3;

import java.util.Scanner;

public class MainFractions {

	public static void main(String[] args) {
		Fractions fractions = new Fractions();
		Scanner s = new Scanner(System.in);
		double arrayOperands[] = new double[2];

		for (int i = 0; i < arrayOperands.length; i++) {
			System.out.println("Введите первый операнд:");
			fractions.setFirstOperand(s.nextLong());
			System.out.println("Введите второй операнд:");
			fractions.setSecondOperand(s.nextShort());
			arrayOperands[i] = universalOperand(fractions.getFirstOperand(), fractions.getSecondOperand());
			System.out.println(arrayOperands[i]); // Проверка
		}
		System.out.println("Результат сложения = " + fractions.addition(arrayOperands[0], arrayOperands[1]));
		System.out.println("Результат вычитания = " + fractions.division(arrayOperands[0], arrayOperands[1]));
		System.out.println("Результат умножения = " + fractions.multiplication(arrayOperands[0], arrayOperands[1]));
		System.out.println("Результат деления = " + fractions.subtraction(arrayOperands[0], arrayOperands[1]));
		System.out.println("Результат сравнения -> " + fractions.comparison(arrayOperands[0], arrayOperands[1]));
		s.close();
	}

	private static double universalOperand(long firstOperand, short secondOperand) {
		String s = String.valueOf(secondOperand);
		int lenghtSecondOperand = s.length();
		double result = 0;
		if (firstOperand < 0 || secondOperand < 0) {
			result = (double) firstOperand - (double) secondOperand / Math.pow(10, lenghtSecondOperand);
			return result;
		} else if (firstOperand < 0 && secondOperand < 0) {
			result = (double) firstOperand - (double) secondOperand / Math.pow(10, lenghtSecondOperand);
			return result;
		} else {
			result = (double) firstOperand + (double) secondOperand / Math.pow(10, lenghtSecondOperand);
			return result;
		}
	}

}
