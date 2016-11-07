package java_ort_vitaha;

import java.util.Scanner;

/*
9.17. Дано слово. Верно ли. что оно начинается и оканчивается на одну и
ту же букву?

9.18. Даны два слова. Верно ли. что первое слово начинается на ту же букву.
на которую заканчивается второе слово.
*/
public class Task_9_dot_17_18 {

	public static void main(String[] args) {
		/* 9.17 */
		String word;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите слово");
		word = scanner.nextLine();
		if (word.charAt(0) == word.charAt(word.length() - 1)) {
			System.out.println("Первый и последний символ в слове " + word + " равны");
		} else {
			System.out.println("Первый и последний символ в слове " + word + " НЕ равны");
		}

		/* 9.18 */
		String wordFirst;
		String wordSecond;
		System.out.println("Введите первое слово");
		wordFirst = scanner.nextLine();
		System.out.println("Введите второе слово");
		wordSecond = scanner.nextLine();
		if (wordFirst.charAt(0) == wordSecond.charAt(wordSecond.length() - 1)) {
			System.out.println("Первый символ в слове " + "\"" + wordFirst + "\"" + " равен последнему символу в слове "
					+ "\"" + wordSecond + "\"");
		} else {
			System.out.println("Первый символ в слове " + "\"" + wordFirst + "\""
					+ " НЕ равен последнему символу в слове " + "\"" + wordSecond + "\"");
		}
		scanner.close();
	}

}
