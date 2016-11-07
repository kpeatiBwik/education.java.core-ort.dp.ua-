package java_ort_vitaha;

/*
9.41. Дано название футбольного клуба. Напечатать его на экране "столбиком"

9.42. Составить программу, которая печатает заданное слово, начиная с последней буквы.

9.43. Дано слово s1. Получить слово s2, образованное нечетными буквами слова s1.
*/
public class Task_9_dot_41_42_43 {
	private static void task_9_41(String s1) {
		for (int i = 0; i < s1.length(); i++) {
			System.out.println(s1.charAt(i));
		}
	}

	private static void task_9_42(String s2) {
		for (int i = s2.length() - 1; i >= 0; i--) {
			System.out.printf(String.valueOf(s2.charAt(i)));
		}
	}

	private static String task_9_43(String s, String s2) {
		for (int i = 0; i < s.length(); i += 2) {
			s2 += String.valueOf(s.charAt(i));
		}
		return s2;
	}

	public static void main(String[] args) {
		String s = "Dnipro";
		System.out.println("Строка в столбик");
		task_9_41(s);
		System.out.println("Вывод строки с последнего символа");
		task_9_42(s);
		System.out.println("\nВывод только нечетных символов строки");
		String s2 = "";
		s2 = task_9_43(s, s2);
		System.out.println(s2);
	}

}
