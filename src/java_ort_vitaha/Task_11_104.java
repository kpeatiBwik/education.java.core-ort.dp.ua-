package java_ort_vitaha;

import java.util.Arrays;

//В массиве из 20 элементов числа образуют неубывающую последовательность.
//Несколько элементов, идущих подряд, равны между собой.
//Найти количество таких элементов. Сколько различных чисел имеется в массиве?

public class Task_11_104 {

	public static void main(String[] args) {
		int[] mass = new int[20];
		int numberRepeats = 0;
		int numberDifferent = 1;
		boolean flag = true;
		for (int i = 0; i < mass.length; i++) {
			mass[i] = (int) (Math.random() * 10);
		}
		Arrays.sort(mass);
		System.out.println(Arrays.toString(mass)); // Проверка
		for (int i = 0; i < mass.length - 1; i++) {
			if (mass[i] != mass[i + 1]) {
				numberDifferent++;
				flag = true;
			} else {
				if (flag) {
					numberRepeats += 2;
					flag = false;
				} else {
					numberRepeats++;
				}
			}
		}
		System.out.println("Кол-во элементов равных между собой = " + numberRepeats);
		System.out.println("Различных чисел в массиве = " + numberDifferent);

	}

}
