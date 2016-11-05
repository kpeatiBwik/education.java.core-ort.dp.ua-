package java_ort_vitaha;

import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

//Изменить знак у максимального по модулю элемента массива.
//Минимальный элемент массива при этом не определять.

public class Task_11_143 {

	public static void main(String[] args) {
		/* 11.143 */
		int mass[] = new int[10];
		for (int i = 0; i < mass.length; i++) {
			mass[i] = (int) (Math.random() * 50) - 25;
			if (mass[i] < 0) {
				mass[i] = Math.abs(mass[i]);
			}
		}
		System.out.println(Arrays.toString(mass));
		// Arrays.sort(mass);
		int max = 0;
		for (int i = 0; i < mass.length - 1; i++) {
			if (mass[i] > max) {
				max = mass[i];
			} 
		}
		System.out.println("максимальный элемент массива = " + max);
	}

}
