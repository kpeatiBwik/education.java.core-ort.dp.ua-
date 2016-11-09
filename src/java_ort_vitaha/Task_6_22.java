package java_ort_vitaha;

import java.util.Scanner;

public class Task_6_22 {
/*6.22. Дано натуральное число. Определить: количество цифр 3 в нем;*/
 static int findNumber(int nomer1, int number1) {
  int copyNumber = 0;
  int result = 0;
  while (number1 != 0) {
   copyNumber = number1 % 10;
   if (copyNumber == nomer1) {
    result++;
   }
   number1 /= 10;
  }
  return result;
 }

 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.println("Введи цифру которую искать");
  int nomer = scanner.nextInt();
  System.out.println("Введи число в котором искать");
  int number = scanner.nextInt();
  System.out.println(
    "Цифра " + nomer + " встречается в числе " + number + " , "
  + findNumber(nomer, number) + " раз(а)");
  
  
  scanner.close();
 }
}