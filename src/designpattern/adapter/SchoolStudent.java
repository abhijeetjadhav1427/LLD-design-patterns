package designpattern.adapter;

public class SchoolStudent {
	private String firstName;
	private String lastName;
	private String emailAddress;

	public SchoolStudent(String firstName, String lastName, String emailAddress) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	@Override
	public String toString() {
		return "SchoolStudent [firstName=" + firstName + ", lastName=" + lastName + ", emailAddress=" + emailAddress
				+ "]";
	}
}
