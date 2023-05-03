package designpattern.adapter;

import java.util.ArrayList;
import java.util.List;

public class StudentClient {
	public List<Student> getStudents() {
		List<Student> list = new ArrayList<Student>();

		CollegeStudent collegeStudent = new CollegeStudent("a", "b", "ab@gmail.com");
		SchoolStudent schoolStudent = new SchoolStudent("x", "y", "xy@gmail.com");

		list.add(collegeStudent);
		list.add(new SchoolStudentAdapter(schoolStudent));

		return list;
	}
}
