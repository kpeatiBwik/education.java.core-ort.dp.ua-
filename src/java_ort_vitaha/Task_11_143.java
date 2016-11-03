package java_ort_vitaha;

import java.util.Arrays;

//Изменить знак у максимального по модулю элемента массива.
//Минимальный элемент массива при этом не определять.

public class Task_11_143 {

	public static void main(String[] args) {
        /*11.143*/
        int mass[] = new int[10];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 50) - 25;
            if (mass[i] < 0) {
                mass[i] = Math.abs(mass[i]);
            }
        }
        Arrays.sort(mass);
        System.out.println("максимальный элемент массива = " + mass[mass.length-1]);
	}

}
