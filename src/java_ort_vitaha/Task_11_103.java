package java_ort_vitaha;

import java.util.Arrays;

//Дан массив ненулевых целых чисел. Определить сколько раз элементы масива 
//при просмотре от его начала меняют знак

public class Task_11_103 {

	public static void main(String[] args) {
		int mass[] = new int[10];
		for (int i = 0; i < mass.length; i++) {
			mass[i] = (int) (Math.random() * 50) - 25;
			while (mass[i] == 0) {
				mass[i] = (int) (Math.random() * 50) - 25;
			}
		}
		System.out.println(Arrays.toString(mass));
		int result = 0;
		for (int i = 0; i < mass.length - 1; i++) {
			if (mass[i] > 0 && mass[i + 1] < 0) {
				result++;
			} else if (mass[i] < 0 && mass[i + 1] > 0) {
				result++;
			}
		}
		System.out.println("Элементы массива изменили знак = " + result + " раз");
	}

}
