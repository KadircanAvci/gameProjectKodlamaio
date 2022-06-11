package gameProjectKodlamaio.entites;

import gameProjectKodlamaio.abstracts.Entity;

public class Player implements Entity {
	
	private int id;
	private String firstName;
	private String lastName;
	private long identificationNumber;
	private int dateOfBirth;
	
	public Player(int id, String firstName, String lastName, long identificationNumber, int dateOfBirth) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identificationNumber = identificationNumber;
		this.dateOfBirth = dateOfBirth;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public long getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(long identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	
	
}
