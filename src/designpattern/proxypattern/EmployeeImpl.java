package designpattern.proxypattern;

public class EmployeeImpl implements Employee {

	@Override
	public void createEmployee(String client, int id) {
		// TODO Auto-generated method stub
		System.out.println("Created employee with " + id);
	}

	@Override
	public void deleteEmployee(String client, int id) {
		// TODO Auto-generated method stub
		System.out.println("Deleted employee with " + id);
	}

	@Override
	public void getEmployee(int id) {
		// TODO Auto-generated method stub
		System.out.println("get employee -> " + id);
	}

}
