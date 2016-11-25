package taskFromEugene2;

public class Student {

	private String surname;
	private String name;
	private String patronymic;
	private int groupNumber;
	private int[] studentMarks = new int[5];

	public Student(String surname, String name, String patronymic, int groupNumber, int[] studentMarks) {
		setSurname(surname);
		setName(name);
		setPatronymic(patronymic);
		setGroupNumber(groupNumber);
		setStudentMarks(studentMarks);
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}

	public int[] getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(int[] studentsMarks) {
		this.studentMarks = studentsMarks;
	}

}
