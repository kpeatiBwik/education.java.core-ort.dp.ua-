package java_ort_vitaha;

import java.util.Arrays;

//Изменить знак у максимального по модулю элемента массива.
//Минимальный элемент массива при этом не определять.

public class Task_11_143 {

	public static void main(String[] args) {
		/* 11.143 */
		int mass[] = new int[10];
		int max = 0;
		for (int i = 0; i < mass.length; i++) {
			mass[i] = (int) (Math.random() * 50) - 25;
		}
		System.out.println(Arrays.toString(mass));
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] < 0) {
				if (Math.abs(mass[i]) > max) {
					max = Math.abs(mass[i]);
					mass[i] = max;
				}
			} else {
				if (mass[i] > max) {
					max = mass[i];
					mass[i] = max * (-1);
				}
			}
		}
		System.out.println(Arrays.toString(mass));
		System.out.println("максимальный элемент массива = " + max);
	}

}
