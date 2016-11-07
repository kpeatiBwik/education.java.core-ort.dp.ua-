package java_ort_vitaha;

/*
9.7. Дано название футбольного клуба. Определить количество символов нем.

9.8. Дано название города. Определить. четно или нет количество символов нем.

9.9. Даны две фамилии. Определить, какая из них длиннее.
*/

import java.util.Scanner;

public class Task_9_dot_7_8_9 {

	public static void main(String[] args) {
		/* 9.7 */
		String footballTeamName;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите называние футбольной команды");
		footballTeamName = scanner.nextLine();
		int count = footballTeamName.length();
		System.out.println("В названии команды " + count + " символов");

		/* 9.8 */
		String cityName;
		System.out.println("Введите называние города");
		cityName = scanner.nextLine();
		if (cityName.length() % 2 == 0) {
			System.out.println("В названии города четное кол-во символов");
		} else {
			System.out.println("В названии города НЕчетное кол-во символов");
		}

		/* 9.9 */
		String surnameFirst;
		String surnameSecond;
		System.out.println("Введите первую фамилию");
		surnameFirst = scanner.nextLine();
		System.out.println("Введите вторую фамилию");
		surnameSecond = scanner.nextLine();
		if (surnameFirst.length() > surnameSecond.length()) {
			System.out.println("Первая фамилия длиннее");
		} else if (surnameFirst.length() < surnameSecond.length()) {
			System.out.println("Вторая фамилия длиннее");
		} else {
			System.out.println("Фамилии равны");
		}

		scanner.close();

	}

}
