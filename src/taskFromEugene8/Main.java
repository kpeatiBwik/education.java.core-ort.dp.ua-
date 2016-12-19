package taskFromEugene8;

import java.util.LinkedList;

public class Main {
	/*
	 * 8. Односвязным списком называют набор элементов, каждый из которых
	 * содержит собственно полезные данные, и ссылку на следующий элемент.
	 * Создать такой список и реализовать для него CRUD операции
	 */

	public static void main(String[] args) {

		LinkedList<String> example = new LinkedList<>();

		example.add("Vitaha");
		example.add("Dima");
		example.add("Vasya");
		example.add("Kolya");
		example.add("Petya");
		example.add("Vadya");
		example.add("Miron");

		// возвращаем элемент по индексу
		System.out.println(example.get(5));
		System.out.println(example);
		// добавляем элемент по индексу
		example.add(3, "!!!!");
		System.out.println(example);
		// перезаписываем элемент по индексу
		example.set(3, "????");
		System.out.println(example);
		//удаляем элементы по индексу
		example.remove(1);
		example.remove(3);
		System.out.println(example);
		// удаляем объект
		example.remove("Miron");
		System.out.println(example);
		// очищаем коллекцию
		example.removeAll(example);
		System.out.println(example);

	}

}
