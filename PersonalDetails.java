package org.jana;

public class PersonalDetails {

	public static void main(String[] args) {
		StringBufferExample   sbe = new StringBufferExample();
		String sal = "Mr.";
		String fname = "Donald";
		String lname = "Trump";
		String street = "1234 Pennsylavania Ave";
		String city = "Washingont DC"; 
		int zipcode=19872;

		// TODO Auto-generated method stub
		//Call the method and print the details
		System.out.println(sbe.getPersonalDetails(sal, fname, lname, street, city, zipcode));

	}		

}

