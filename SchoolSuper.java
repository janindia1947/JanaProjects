package org.jana;

public class SchoolSuper {


	//Method-1
	public String studentSchoolName(String schoolName) {
		System.out.println("\n School Name : ");
		return schoolName;
	}
	
	
	//Method-3
	public String studentPeronalDetails(String firstName, String lastName) {
		System.out.println("\n Full Name: ");
		String fullName = firstName + "  " + lastName;
		return fullName;
	}
	
	//Method-3
	public void studentSSN( ) {
		System.out.println("\nSocial Security Number :\n482822833");
	}

	//Method-4
	public String studentCountry(String countryName ) {
		System.out.println("\n Country : ");
		return countryName;
	}

	
	//Method-5 :  Phone Number for Domestic Students within USA
	public String phoneNumber(String phoneNumber) {
		System.out.println("\n USA Phone Number : " );
		return phoneNumber;
	}
	

}
