package designpattern.adapter;

public class SchoolStudentAdapter implements Student{
	private SchoolStudent student;
	 
	public SchoolStudentAdapter(SchoolStudent student) {
		super();
		this.student = student;
	}

	@Override
	public String getNmae() {
		// TODO Auto-generated method stub
		return this.student.getFirstName();
	}

	@Override
	public String getSurname() {
		// TODO Auto-generated method stub
		return this.student.getLastName();
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return this.student.getEmailAddress();
	}

	@Override
	public String toString() {
		return "SchoolStudentAdapter [student=" + student + "]";
	}

}
