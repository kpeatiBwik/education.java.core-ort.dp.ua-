package java_ort_vitaha;

// Заполнить массив 20тью первыми натуральными числами,
// делящимися нацело на 13 или на 17 и находящимися в интервале,
// левая граница которого равна 300.

import java.util.Arrays;

public class Task_11_12_a {

	public static void main(String[] args) {
		/* 11_12 a */
		int[] array = new int[20];
		int i = 0;
		int limit = 300;
		while (i < array.length) {
			if (limit % 13 == 0 || limit % 17 == 0) {
				array[i] = limit;
				limit++;
				i++;
			} else {
				limit++;
			}
		}
		System.out.print(Arrays.toString(array));
	}

}
