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

		Student student1 = new Student("pupkin", "vasya", "petrovich", 125, new int[] { 5, 3, 2, 4, 5 });
		Student student2 = new Student("pechkin", "vova", "vladimirovich", 113, new int[] { 3, 5, 5, 5, 5 });
		Student student3 = new Student("hrush", "petya", "ozimovich", 113, new int[] { 2, 2, 2, 2, 2 });
		Student student4 = new Student("vermishel", "milena", "anatolievna", 125, new int[] { 4, 3, 4, 4, 4 });
		Student student5 = new Student("sergeev", "sergey", "sergeevich", 125, new int[] { 5, 4, 2, 5, 5 });

		Student[] students = { student1, student2, student3, student4, student5 };
		System.out.println("Фимилия, имя, отчество, номер группы, стипендия");
		bubbleSorStudents(students);
		printStudents(students);

	}

	private static void printStudents(Student[] students) {
		for (int i = 0; i < students.length; ++i) {
			Student student = students[i];
			String studentInString = studentsToString(student);
			int res = students[i].result(student.getStudentMarks());
			System.out.printf("%s%n", studentInString + res + " %");
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
}
