package taskFromEugene10;

import java.time.LocalDate;
import java.util.ArrayList;

public class CreateForeignPassport {

	private static ArrayList<ForeignPassport> foreignPassports = new ArrayList<ForeignPassport>();

	public static void main(String[] args) {

		final Integer FIVE_YEARS = 5;
		final Integer TEN_YEARS = 10;
		final Integer TWENTIES = 20;

		ForeignPassport foreignPassport1 = new ForeignPassport(PassportSerie.AE, 123, "vitaha", "shat", 1970, 10, 10,
				"Dnepr", "xxx", 123456123, VisaType.ten_years, LocalDate.now(), TEN_YEARS);
		foreignPassports.add(foreignPassport1);
		printUsersLibrary(foreignPassports);

	}

	private static void printUsersLibrary(ArrayList<ForeignPassport> foreignPassports) {
		for (ForeignPassport userLibrary : foreignPassports) {
			String foreignPassport = foreignPassportsToString(userLibrary);
			System.out.print(foreignPassport);
		}
	}

	private static String foreignPassportsToString(ForeignPassport foreignPassport) {
		StringBuilder sb = new StringBuilder();
		sb.append(foreignPassport.get_name()).append(" ").append(foreignPassport.get_visa()).append("\n");
		return sb.toString();
	}

}

/*
 * append(foreignPassport.get_surName()).append(" ")
 * .append(foreignPassport.get_city()).append(" ").append(foreignPassport.
 * get_passportSerie()).append(" ")
 * .append(foreignPassport.get_foreignPassportNumber()).append(" ")
 * .append(foreignPassport.get_dateOfIssue()).append(" ").append(foreignPassport
 * .get_birthday())
 */