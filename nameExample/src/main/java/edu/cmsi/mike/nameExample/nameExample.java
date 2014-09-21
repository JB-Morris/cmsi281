package edu.lmu.cmsi.mike.nameExample

public class Name {
	private String firstName;
	private String lastName;



	public Name(String firstName, String lastName) {
		if(firstName == null || lastName == null || firstName.length() == 0 || lastname.length() == 0) {
			throw new IllegaglArgumentException("First and Last name can't be empty");

		}
		this.firstName = this.verfyCapitalization(firstName);
		this.lastname = this.verfyCapitalization(lastName);
	}


	private String verfyCapitalization(String s) {
		if (!Character.isUpperCase(s.charAt(0))){
			s = character.toUpperCase(s.charAt(0)) + s.substring(1);
		}
	}
	public string getFn() {
		return this.firstName;
	}
	public string getLn() {
		return this.lastname;
	}
}