package java_ort_vitaha;
/*Запрашивает имя
 * а) выводит на экран
 * б) выводит на экран с приветствием*/

import java.util.Scanner;

public class Task_9_1 {

	public static void main(String[] args) {
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи свое имя, смертный");
        name = scanner.nextLine();
        System.out.println("а) " + name);
        System.out.println("б) " + "Приветствую тебя, " + name);
        scanner.close();
	}
}
