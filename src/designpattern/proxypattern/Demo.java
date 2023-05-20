package designpattern.proxypattern;

public class Demo {
	public static void main(String[] args) throws Exception {
		Employee employee = new EmployeeProxy();
		employee.createEmployee("ADMIN", 1);
		employee.deleteEmployee("l", 1);
		employee.getEmployee(1);
	}
}
