package java_ort_vitaha;

public class Rhombus {

	public static void main(String[] args) {
		final char s = '*';
		final char empty = ' ';
		int length = 9;
		if (length % 2 != 0) {
			length++;
		}
		for (int i = 0; i <= length; i++) {
			for (int j = 0; j <= length; j++) {
				if (j == (length / 2) 
						|| i == (length / 2) + j 
						|| i == (length / 2) - j 
						|| j == (length / 2) + i
						|| j == length / 2 - i + length 
						|| i == (length / 2)) {
					System.out.print(s);
				} else {
					System.out.print(empty);
				}
			}
			System.out.println();
		}
	}
}
