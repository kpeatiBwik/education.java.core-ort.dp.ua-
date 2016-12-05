package taskFromEugene4;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		char[] arrayChar1 = { 'c', 'a', ' ', 'f', 'g' };
		char[] arrayChar2 = { 'z', 'w', ' ', 's', 'x' };
		ArrayList<String> stringMass = new ArrayList<>();
		VitahaString vitahaString = new VitahaString();
		VitahaString vitahaString1 = new VitahaString(arrayChar1);
		VitahaString vitahaString2 = new VitahaString(arrayChar2);
		stringMass.add(vitahaString1.createString(vitahaString1.getMasschars()));
		stringMass.add(vitahaString2.createString(vitahaString2.getMasschars()));
		System.out.println(stringMass);
		System.out.println(vitahaString.stringPlusString(stringMass));
	}

}
