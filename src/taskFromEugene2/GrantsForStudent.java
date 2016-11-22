package taskFromEugene2;

/*2.
Составить программу для начисления стипендии студентам по результатам экзаменационной сессии. Информация о результатах сессии включает в себя:
– фамилию;
– имя;
– отчество;
– номер группы;
– экзаменационные оценки.
Количество экзаменационных оценок не менее 3 и не более 5. Стипендия начисляется студентам, сдавшим все экзамены в сессию, 
по следующим правилам. Студенты, сдавшие все экзамены на "отлично" получают надбавку равную 100%; студенты, 
сдавшие экзамены на "хорошо" и "отлично" – 50%; а студенты, сдавшие экзамены на "хорошо", – 25%. Стипендия не начисляется 
студентам, имеющим в сессию более двух удовлетворительных оценок.
Список студентов каждой группы, получивших стипендию, вывести на экран, упорядочив его по алфавиту.*/

public class GrantsForStudent {

	public static void main(String[] args) {

		Student student1 = new Student("пупкин", "vasya", "petrovich", 125, new int[] { 4, 4, 4, 4, 4 });
		Student student2 = new Student("печкин", "vova", "vladimirovich", 113, new int[] { 4, 5, 4, 3, 4 });
		Student student3 = new Student("хрущь", "petya", "ozimovich", 113, new int[] { 2, 2, 2, 2, 2 });
		Student student4 = new Student("вермишель", "milena", "anatolievna", 125, new int[] { 5, 5, 5, 5, 5 });
		Student student5 = new Student("сергеев", "sergey", "sergeevich", 125, new int[] { 5, 5, 5, 4, 4 });

		Student[] students = { student1, student2, student3, student4, student5 };
		System.out.println("Фимилия, имя, отчество, номер группы, стипендия");
		bubbleSorStudents(students);
		printStudents(students);

	}

	private static void printStudents(Student[] students) {
		for (int i = 0; i < students.length; ++i) {
			Student student = students[i];
			String studentInString = studentsToString(student);
			String res = increasedScholarships(student.getStudentMarks());
			System.out.printf("%s%n", studentInString + res);
		}

	}

	private static void bubbleSorStudents(Student[] students) {
		for (int i = students.length - 1; i > 0; --i) {
			for (int j = 0; j < i; ++j) {
				if (students[j].getSurname().charAt(0) > students[j + 1].getSurname().charAt(0)) {

					Student temp = students[j];
					students[j] = students[j + 1];
					students[j + 1] = temp;
				}
			}
		}
	}

	private static String studentsToString(Student student) {
		StringBuilder sb = new StringBuilder();
		sb.append(student.getSurname()).append(" ").append(student.getName()).append(" ")
				.append(student.getPatronymic()).append(" ").append(student.getGroupNumber()).append(" - ");
		return sb.toString();
	}

	/**
	 * Этот метод начисляет стипендию студентам по результатам экзаменационной
	 * сессии
	 * 
	 * @param оценки
	 *            студента по результатам сессии
	 * @return надбавка к стипендии
	 */
	private static String increasedScholarships(int[] result) {
		String finalResult = "";
		int result2 = 0;
		int result3 = 0;
		int result4 = 0;
		int result5 = 0;
		for (int i = 0; i < result.length; i++) {
			if (result[i] == 5) {
				result5++;
			} else if (result[i] == 4) {
				result4++;
			} else if (result[i] == 3) {
				result3++;
			} else if (result[i] == 2) {
				result2++;
			}
		}
		if (result4 == result.length) {
			finalResult = "с надбавкой 25 %";
		} else if (result5 == result.length) {
			finalResult = "с надбавкой 100 %";
		} else if (result2 == 0 && result3 == 0) {
			finalResult = "с надбавкой 50 %";
		} else {
			return finalResult = "не получает стипендию";
		}
		return finalResult;
	}
}
