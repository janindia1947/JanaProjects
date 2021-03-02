package org.jana;

public class SchoolInherited extends SchoolSuper {
	String address = "1234 Washington DC";
	SchoolInherited(String address){
		this.address = address;
	}
	
	
	//Method
	public String studentMajor(String majorName) {
		System.out.println("\n Major Name : " );
		return majorName;
	}
	
	public int studentGPA(int gPa) {
		System.out.println("\n GPA : " );
		return gPa;
	}
	
	//Overriding the Super Class Method
    //Phone Number for International Students out side USA
	public String PhoneNumber(int countryCode , String subscriberNumber) {
		System.out.println("\n International Phone Number : " );		
	        return Integer.toString(countryCode) + " " + subscriberNumber;
	}
	
	//Address - using Constructor variable
	public String Fulladdress(String address) {
		System.out.println("\n Address : " );
		return address;
	}
	
}


//Notes : 
// Definitions: A class that is derived from another class is called a subclass
// Sub class is also called as a derived class, extended class, or child class. 
// The class from which the subclass is derived is called a superclass. It is also called as a base/parent class

//Method Overloading : Within the same class , same method is defined multiple times but with different parameters 
//Method Overriding  : Sub class having the same method as Super Class is called Method Overloading  
