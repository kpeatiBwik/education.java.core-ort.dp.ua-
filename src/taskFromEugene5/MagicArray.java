package taskFromEugene5;

public class MagicArray {

	private int array[] = new int[0];

	// Для проверки
	public int[] getArray() {
		System.arraycopy(this.array, 0, array, 0, this.array.length);
		return array;
	}

	// Безопасная запись в приватное поле
	private void setArray(int array[]) {
		System.arraycopy(array, 0, this.array, 0, array.length);
	}

	// Добавляем элемент в конец массива
	public void addElement(int x) {
		int[] newArray = new int[array.length + 1];
		System.arraycopy(getArray(), 0, newArray, 0, array.length);
		newArray[array.length] = x;
		setArray(array = newArray);
	}

	// Удаляем элемент в массиве по индексу
	public void deleteElement(int x) {
		int[] newArray = new int[array.length - 1];
		System.arraycopy(getArray(), 0, newArray, 0, x);
		System.arraycopy(getArray(), x + 1, newArray, x, newArray.length - x);
		setArray(array = newArray);
	}

}
