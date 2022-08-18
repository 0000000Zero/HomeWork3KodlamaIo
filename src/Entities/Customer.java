package Entities;

public class Customer 
{
	private int sId;
	private String nationalityId;
	private String firstName;
	private String lastName;
	private int birthDay;
	
	public Customer () {
		
	}
	public Customer(int sId, String nationalityId, String firstName, String lastName, int birthDay) {
		super();
		this.sId = sId;
		this.nationalityId = nationalityId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDay = birthDay;
	}
	
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}
	

}
