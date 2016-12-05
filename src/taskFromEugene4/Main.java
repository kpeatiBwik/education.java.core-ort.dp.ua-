package taskFromEugene4;

public class Main {

	public static void main(String[] args) {

		VitahaString vitahaString = new VitahaString();
		char[] arrayChar1 = { 'c', 'a', ' ', 'f', 'g' };
		vitahaString.setMasschars(arrayChar1);
		System.out.println(vitahaString.createString(vitahaString.getMasschars()));
		System.out.println(vitahaString.getLenght(arrayChar1));
	}

}
