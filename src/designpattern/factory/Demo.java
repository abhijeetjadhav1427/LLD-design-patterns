package designpattern.factory;

public class Demo {
	public static void main(String[] args) {
		Course hld = CourseFactory.getCourse("HLD");
		Course lld = CourseFactory.getCourse("LLD");
		
		System.out.println(lld.getModules());
		System.out.println(hld.getModules());
	}
}
