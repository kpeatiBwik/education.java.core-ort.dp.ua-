package java_ort_vitaha;
/*6.90. Имеется фрагмент программы в виде оператора цикла с параметром.
обеспечивающий вывод на экран "столбиком" квадратного корня из
всех целых чисел от а до Ь (а > Ь).
Оформигь этот фрагмент в вид...
а) операюра цикла с предусловием.
б) оператора цикла с постусловием.*/

public class Task_6_90 {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;

		int i = a;
		while (i >= b) {
			System.out.println(Math.pow(i, 2));
			i--;
		}

		int j = a;
		do {
			System.out.println(Math.pow(j, 2));
			j--;
		} while (j >= b);
	}
}
