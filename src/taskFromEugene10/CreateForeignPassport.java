package taskFromEugene10;

import java.util.ArrayList;

public class CreateForeignPassport {

	private static ArrayList<ForeignPassport> foreignPassports = new ArrayList<ForeignPassport>();

	public static void main(String[] args) {
		/**
		 * добавление загранки с визой
		 */
		// ForeignPassport foreignPassport1 = new ForeignPassport("AE", 123,
		// "xxx", "yyy", 1991, 10, 10, "Dnepr", "zzz",
		// 5868, Constants.TOURIST_VISA, Constants.TWENTIES);
		// ForeignPassport foreignPassport2 = new ForeignPassport("EE", 321,
		// "xxx", "yyy", 1991, 10, 10, "Kiev", "ggg",
		// 2454, Constants.WORK_VISA, Constants.TEN_YEARS);

		/**
		 * добавление загранки без виз
		 */
		ForeignPassport foreignPassport1 = new ForeignPassport("AE", 123, "xxx", "yyy", 1991, 10, 10, "Dnepr", "zzz",
				5868);
		ForeignPassport foreignPassport2 = new ForeignPassport("EE", 321, "xxx", "yyy", 1991, 10, 10, "Kiev", "ggg",
				2454);
		/**
		 * добавление визы
		 */
		foreignPassport1.setVisa(Constants.TOURIST_VISA, Constants.TEN_YEARS);
		foreignPassports.add(foreignPassport1);
		foreignPassports.add(foreignPassport2);
		printUsersLibrary(foreignPassports);
	}

	private static void printUsersLibrary(ArrayList<ForeignPassport> foreignPassports) {
		for (ForeignPassport userLibrary : foreignPassports) {
			String foreignPassport = foreignPassportsToString(userLibrary);
			System.out.print(foreignPassport + "\n");
		}
	}

	private static String foreignPassportsToString(ForeignPassport foreignPassport) {
		StringBuilder sb = new StringBuilder();
		sb.append("Серия паспорта страны: ").append(foreignPassport.getPassportSerie()).append("\nномер паспорта: ")
				.append(foreignPassport.getPassportNumber()).append("\nимя: ").append(foreignPassport.getName())
				.append("\nфамилия: ").append(foreignPassport.getSurName()).append("\nдата рождения: ")
				.append(foreignPassport.getBirthday()).append(foreignPassport.getPassportNumber())
				.append("\nгород проживания: ").append(foreignPassport.getCity()).append("\nкем выдан: ")
				.append(foreignPassport.getIssuedBy()).append("\nдата выдачи: ")
				.append(foreignPassport.getDateOfIssue()).append("\nномер загран паспорта: ")
				.append(foreignPassport.getForeignPassportNumber()).append("\n").append(foreignPassport.getVisas())
				.append("\n+++++++++++++++++++++++++++++++++++");
		return sb.toString();
	}
}