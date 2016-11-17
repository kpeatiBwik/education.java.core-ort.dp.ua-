package taskFromEugene5;

public class MagicArray {

	private int Array[] = new int[0];

	// Для проверки
	public int[] getArray() {
		return Array;
	}

	// Безопасная запись в приватное поле
	private void setArray(int array[]) {
		Array = array;
	}

	// Добавляем элемент в конец массива
	public void addElement(int x) {
		int[] newArray = new int[Array.length + 1];
		System.arraycopy(getArray(), 0, newArray, 0, Array.length);
		newArray[Array.length] = x;
		setArray(Array = newArray);
	}

	// Удаляем элемент в массиве по индексу
	public void deleteElement(int x) {
		int[] newArray = new int[Array.length - 1];
		System.arraycopy(getArray(), 0, newArray, 0, x);
		System.arraycopy(getArray(), x + 1, newArray, x, newArray.length - x);
		setArray(Array = newArray);
	}

}
