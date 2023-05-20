package designpattern.proxypattern;

public interface Employee {
	public void createEmployee(String client, int id) throws Exception;
	public void deleteEmployee(String client, int id) throws Exception;
	public void getEmployee(int id);
}
