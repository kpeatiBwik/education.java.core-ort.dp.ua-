package taskFromEugene6;

import java.util.ArrayList;
import java.util.Scanner;

public class UseUserLibrary {
	private static ArrayList<UserLibrary> userLibraryList = new ArrayList<UserLibrary>();
	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			menu();
		}
	}

	public static UserLibrary enterNewUserLibrary() {
		System.out.println("Введите имя пользователя библиотеки: ");
		String name = s.nextLine();
		System.out.println("Введите фамилию пользователя библиотеки: ");
		String surname = s.nextLine();
		System.out.println("Введите отчество пользователя библиотеки: ");
		String patronymic = s.nextLine();
		System.out.println("Введите номер читательского билета пользователя библиотеки: ");
		String ticketNumber = s.nextLine();
		System.out.println("Выберите факультет пользователя библиотеки: ");
		System.out.println("1. Факультет физики");
		System.out.println("2. Факультет химии");
		System.out.println("3. Факультет истории");
		System.out.println("4. Факультет математики");
		String faculty = s.nextLine();
		Faculty resultFaculty;
		switch (faculty) {
		case "1":
			resultFaculty = Faculty.PHYSICS;
			break;
		case "2":
			resultFaculty = Faculty.CHEMISTRY;
			break;
		case "3":
			resultFaculty = Faculty.HISTORY;
			break;
		case "4":
			resultFaculty = Faculty.MATHS;
			break;
		default:
			resultFaculty = Faculty.PHYSICS; // чтобы компилятор не ругался :)
			break;
		}
		System.out.println("Введите дату рождения пользователя библиотеки в формате DD.MM.YYYY: ");
		String birthday = s.nextLine();
		System.out.println("Введите номер телефона пользователя библиотеки: ");
		long phoneNumber = s.nextLong();

		UserLibrary newUser = new UserLibrary(name, surname, patronymic, ticketNumber, resultFaculty, birthday,
				phoneNumber);
		s.nextLine();
		return newUser;
	}

	private static void printUsersLibrary(ArrayList<UserLibrary> userLibraryList) {
		for (UserLibrary userLibrary : userLibraryList) {
			String resultUserLibrary = usersLibraryToString(userLibrary);
			System.out.print(resultUserLibrary);
		}
	}

	private static String usersLibraryToString(UserLibrary userLibrary) {
		StringBuilder sb = new StringBuilder();
		sb.append(userLibrary.getName()).append(" ").append(userLibrary.getSurname()).append(" ")
				.append(userLibrary.getPatronymic()).append(" ").append(userLibrary.getTicketNumber()).append(" ")
				.append(userLibrary.getFaculty()).append(" ").append(userLibrary.getBirthday()).append(" ")
				.append(userLibrary.getPhoneNumber()).append("\n");
		return sb.toString();
	}

	private static void menu() {
		System.out.println("Выберите пункт меню:");
		System.out.println("1. Добавить нового пользователя библиотеки");
		System.out.println("2. Вывести на экран массив пользователей");
		System.out.println("3. Выполнить поиск с параметрами");
		System.out.println("4. Завершить выполнение программы");
		String menu1 = s.nextLine();
		switch (menu1) {
		case "1":
			userLibraryList.add(enterNewUserLibrary());
			break;
		case "2":
			printUsersLibrary(userLibraryList);
			break;
		case "3":
			System.out.println("1. Искать по фамилии");
			System.out.println("2. Искать по факультету");
			System.out.println("3. Вернуться в прошлое меню");
			System.out.println("4. Завершить выполнение программы");
			String menu2 = s.nextLine();
			ArrayList<UserLibrary> resultFind = new ArrayList<UserLibrary>();
			switch (menu2) {
			case "1":
				System.out.println("Введи фамилию:");
				String findSurname = s.nextLine();
				resultFind = findUserLibrary(findSurname, 1);
				if (resultFind != null) {
					printUsersLibrary(resultFind);
				} else {
					System.out.println("Пользователь с такой фамилией не найден");
				}
				break;
			case "2":
				System.out.println("Выбери факультет:");
				int i = 1;
				for (Faculty faculty : Faculty.values()) {
					System.out.println(i + ". " + faculty);
					i++;
				}
				int chooseFaculty = s.nextInt();
				switch (chooseFaculty) {
				case 1:
					resultFind = findUserLibrary(Faculty.PHYSICS.toString(), 2);
					break;
				case 2:
					resultFind = findUserLibrary(Faculty.CHEMISTRY.toString(), 2);
					break;
				case 3:
					resultFind = findUserLibrary(Faculty.HISTORY.toString(), 2);
					break;
				case 4:
					resultFind = findUserLibrary(Faculty.MATHS.toString(), 2);
					break;
				}
				if (resultFind != null) {
					printUsersLibrary(resultFind);
				} else {
					System.out.println("В этом факультете нету пользователей");
				}
			case "3":
				menu();
				break;
			case "4":
				exit();
				break;

			default:
				break;
			}
		case "4":
			exit();
			break;

		default:
			break;
		}
	}

	private static ArrayList<UserLibrary> findUserLibrary(String findValue, int сhoosingSearchOption) {
		ArrayList<UserLibrary> userLibraryListNew = new ArrayList<UserLibrary>();
		for (UserLibrary userLibrary : userLibraryList) {
			switch (сhoosingSearchOption) {
			case 1:
				if (userLibrary.getSurname().toUpperCase().equals(findValue.toUpperCase())) {
					userLibraryListNew.add(userLibrary);
				}
				break;
			case 2:
				if (userLibrary.getFaculty().toString().equals(findValue)) {
					userLibraryListNew.add(userLibrary);
				}
				break;
			}
		}
		return userLibraryListNew;
	}

	private static void exit() {
		System.out.println("Всего доброго!");
		System.exit(0);
	}
}
