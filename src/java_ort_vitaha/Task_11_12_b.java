package java_ort_vitaha;

import java.util.Arrays;
//Заполнить массив тридцатью первыми простыми числами

public class Task_11_12_b {
	public static void main(String[] args) {
		int[] array = new int[30];
		int i = 1;
		int result = 3;
		array[0] = 2;
		boolean flag;
		while (i < array.length) {
			flag = true;
			for (int k = 0; k < i; k++) {
				if (result % array[k] == 0) {
					result = result + 2;
					flag = false;
					break;
				}
			}
			if (flag) {
				array[i] = result;
				result = result + 2;
				i++;
			}
		}
		System.out.println(Arrays.toString(array));
	}
}
