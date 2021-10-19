package schoollProject;

public class Person {
     private String mationallIdentity;
     private String name;
     private String surname;
     private String birtYear;
     private String gender;
     private String username;
     private int password;
	public Person() {
		super();
	}
	public Person(String mationallIdentity, String name, String surname, String birtYear, String gender,
			String username, int password) {
		super();
		this.mationallIdentity = mationallIdentity;
		this.name = name;
		this.surname = surname;
		this.birtYear = birtYear;
		this.gender = gender;
		this.username = username;
		this.password = password;
	}
	public String getMationallIdentity() {
		return mationallIdentity;
	}
	public void setMationallIdentity(String mationallIdentity) {
		this.mationallIdentity = mationallIdentity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getBirtYear() {
		return birtYear;
	}
	public void setBirtYear(String birtYear) {
		this.birtYear = birtYear;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
}
