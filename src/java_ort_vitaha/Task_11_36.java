package java_ort_vitaha;

import java.util.Arrays;

/*
11.36. Дан массив. Напечатать:
а) все неотрицательные элементы;
б) все элементы. не превышающие числ0 100.
*/

/*PS. да задание выполнено чуть не так, объеденены пункты а и б, но оно слегка бафнуто, 
 * так что думаю простительно*/
public class Task_11_36 {


	static int[] createArray(int lenght) {
		int mass[] = new int[lenght];
		for (int i = 0; i < mass.length; i++) {
			mass[i] = (int) (Math.random() * 200) - 75;
		}
		System.out.println(Arrays.toString(mass)); // Проверка

		return mass;
	}

	static int printArray(int mass[]) {
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] >= 0 && mass[i] <= 100) {
				System.out.println(mass[i]);
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		printArray(createArray(15));
	}
}
