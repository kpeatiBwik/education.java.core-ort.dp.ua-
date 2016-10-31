package java_ort_vitaha;

import java.util.Arrays;
import java.util.Scanner;

//Заполнить массив из десяти 
//элементов значениями, 
//вводимыми с клавиатуры 
//в ходе выполнения программы

public class Task_11_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a[] = new int[10];
		for (int i = 0; i < 10; ++i) {
			System.out.println("Введите " + i + "й элемент массива:");
			a[i] = scanner.nextInt();
		}
		System.out.println(Arrays.toString(a));
		scanner.close();
	}

}
