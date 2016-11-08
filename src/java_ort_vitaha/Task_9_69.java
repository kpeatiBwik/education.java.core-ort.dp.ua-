package java_ort_vitaha;

/*9.69. Дан текст. Определить, сколько в нем предложений.*/
public class Task_9_69 {

	public static void main(String[] args) {
		String s = "The String class represents character strings. All string literals in Java programs, \n"
				+ "such as \"abc\", are implemented as instances of this class. Strings are constant; \n"
				+ "their values cannot be changed after they are created. String buffers support mutable strings. \n"
				+ "Because String objects are immutable they can be shared.";
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '.') {
				result++;
			}
		}
		System.out.println("В тексте " + result + " предложений, с учетом того что нету сокращений");

	}

}
