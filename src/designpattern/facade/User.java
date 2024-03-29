package designpattern.facade;

public class User {
	private String name;
	private String email;
	private long phoneNumber;

	public User(String name, String email, long phoneNumber) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

}
