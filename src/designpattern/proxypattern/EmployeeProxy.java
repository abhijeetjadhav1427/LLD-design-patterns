package designpattern.proxypattern;

public class EmployeeProxy implements Employee {
	private Employee employee;

	public EmployeeProxy() {
		employee = new EmployeeImpl();
	}

	@Override
	public void createEmployee(String client, int id) throws Exception {
		// TODO Auto-generated method stub
		if (client.equals("ADMIN")) {
			this.employee.createEmployee(client, id);
			return;
		}
		throw new Exception("Access Denied");
	}

	@Override
	public void deleteEmployee(String client, int id) throws Exception {
		// TODO Auto-generated method stub
		if (client.equals("ADMIN")) {
			this.employee.deleteEmployee(client, id);
			return;
		}
		throw new Exception("Access Denied");
	}

	@Override
	public void getEmployee(int id) {
		// TODO Auto-generated method stub
		this.employee.getEmployee(id);
	}

}
