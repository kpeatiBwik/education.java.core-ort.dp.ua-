package taskFromEugene5;

import java.util.Arrays;

/*5. 
Создать класс резинового массива, который умеет расширяться или сужаться по необходимости*/

public class MainMagicArray {

	public static void main(String[] args) {

		MagicArray array = new MagicArray();
		array.addElement(5);
		array.addElement(8);
		array.addElement(10);
		System.out.println(Arrays.toString(array.getArray()));// Проверка
		array.addElement(15);
		System.out.println(Arrays.toString(array.getArray()));// Проверка
		array.addElement(23);
		System.out.println(Arrays.toString(array.getArray()));// Проверка
		array.deleteElement(2);
		System.out.println(Arrays.toString(array.getArray()));// Проверка
		array.deleteElement(2);
		System.out.println(Arrays.toString(array.getArray()));// Проверка

	}
}
