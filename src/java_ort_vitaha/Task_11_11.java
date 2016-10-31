package java_ort_vitaha;

import java.util.Arrays;

public class Task_11_11 {

	public static void main(String[] args) {
		int array[] = new int[20];
        array[0] = (int) (Math.random() * 21);
        int i = 0;
        while (i < array.length) {
            int number = (int) (Math.random() * 21);
            boolean flag = false;
            for (int j = 0; j <= i; j++) {
                if (number == array[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                array[i] = number;
                i++;
            }
        }
        Arrays.sort(array); //Чтобы было легче просматривать массив
        System.out.println(Arrays.toString(array));

	}

}
