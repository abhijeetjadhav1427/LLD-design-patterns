package designpattern.adapter;

public class CollegeStudent implements Student {
	private String name;
	private String surname;
	private String eamil;

	public CollegeStudent(String name, String surname, String eamil) {
		super();
		this.name = name;
		this.surname = surname;
		this.eamil = eamil;
	}

	@Override
	public String getNmae() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public String getSurname() {
		// TODO Auto-generated method stub
		return this.surname;
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return this.eamil;
	}

	@Override
	public String toString() {
		return "CollegeStudent [name=" + name + ", surname=" + surname + ", eamil=" + eamil + "]";
	}

}
