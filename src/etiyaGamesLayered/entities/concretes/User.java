package etiyaGamesLayered.entities.concretes;

import etiyaGamesLayered.entities.abstracts.Entity;

public class User implements Entity {
	private String firstName;
	private String lastName;
	private int birthYear;
	private String identityNumber;
	private String gender;

	public User() {
		super();
	};

	public User(String firstName, String lastName, int birthYear, String identityNumber,String gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		this.identityNumber = identityNumber;
		this.gender = gender;
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

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
