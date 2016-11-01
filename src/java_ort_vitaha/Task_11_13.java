package java_ort_vitaha;

import java.util.Scanner;

//Вывести на экран любой элемент массива по его индексу

public class Task_11_13 {

	public static void main(String[] args) {
        int[] array = new int[9];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i]); // Проверка
        }
        System.out.println("\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите элемент массива от 1 до " + array.length);
        int index = scanner.nextInt();
        if (index < 1 || index > array.length) {
            System.out.println("Вы не правильно ввели индекс!");
        } else {
            System.out.println("Элемент массива под " + index + "м "
            		+ "индексом = " + array[index - 1]);
        }
        scanner.close();
	}
}
