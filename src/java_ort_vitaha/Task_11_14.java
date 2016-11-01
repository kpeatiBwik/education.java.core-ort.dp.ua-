package java_ort_vitaha;

//Вывести элемента массива в обратном порядке.

public class Task_11_14 {

 public static void main(String[] args) {
  int[] array = new int[10];
  for (int i = 0; i < array.length; i++) {
   array[i] = (int) (Math.random() * 11);
   System.out.print(array[i]); // Проверка
  }
  System.out.println("\n");
  for (int i = array.length - 1; i >= 0; i--) {
   System.out.print(array[i]);
  }
 }
}