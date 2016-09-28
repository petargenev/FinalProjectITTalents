package models;

import exceptions.InvalidInputException;

public class User {
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String password;
	
	
	public User(String firstName, String lastName, String email, String phoneNumber, String password) throws InvalidInputException {
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
		setPhoneNumber(phoneNumber);
		setPassword(password);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phoneNumber="
				+ phoneNumber + ", password=" + password + "]";

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) throws InvalidInputException {
		if (firstName != null && !firstName.isEmpty()){
			this.firstName = firstName;
		}else{
			throw new InvalidInputException();
		}
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) throws InvalidInputException {
		if (lastName != null && !lastName.isEmpty()){
			this.lastName = lastName;
		}else{
			throw new InvalidInputException();
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws InvalidInputException {
		if (email != null && !email.isEmpty()){
			this.email = email;
		}else{
			throw new InvalidInputException();
		}
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) throws InvalidInputException {
		if (phoneNumber != null && !phoneNumber.isEmpty()){
			this.phoneNumber = phoneNumber;
		}else{
			throw new InvalidInputException();
		}
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) throws InvalidInputException {
		if (password != null && !password.isEmpty()){
			this.password = password;
		}else{
			throw new InvalidInputException();
		}
	}

}
