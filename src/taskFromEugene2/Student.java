package taskFromEugene2;

public class Student {

	private String surname;
	private String name;
	private String patronymic;
	private int groupNumber;
	private int[] studentMarks = new int[5];
	private int result;
	private int result2;
	private int result3;
	private int result4;
	private int result5;

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

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public int result(int[] result) {
		for (int i = 0; i < result.length; i++) {
			if (result[i] == 5) {
				this.result5++;
			} else if (result[i] == 4) {
				this.result4++;
			} else if (result[i] == 3) {
				this.result3++;
			} else if (result[i] == 2) {
				this.result2++;
			}
			if (this.result2 >= 2) {
				return this.result = -1;
			} else if (result5 == result.length) {
				this.result = 100;
			} else if (result5 > result3 && result5 > result2 || result4 > result2 && result4 > result3) {
				this.result = 50;
			} else if (result4 == result.length) {
				this.result = 25;
			}

		}
		return this.result;
	}
}
