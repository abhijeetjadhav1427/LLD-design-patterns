package designpattern.adapter;

public class Demo {
	public static void main(String[] args) {
		StudentClient client = new StudentClient();
		
		System.out.println(client.getStudents());
	}
}
