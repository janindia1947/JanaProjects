package org.jana;

public class SchoolMain {

	public static void main(String[] args) {

		String address;
		// TODO Auto-generated method stub
		//SchoolInherited objPhiSch = new SchoolInherited("456 NewYork");
		
		SchoolInherited objPhiSch = new SchoolInherited ();
		
		//School Name
		System.out.println(objPhiSch.studentSchoolName("Delhi Public School"));
		//Display Student's FullName:
		System.out.println(objPhiSch.studentPeronalDetails("Narendra", "Modi"));
		
		//Display Student's SSN
		objPhiSch.studentSSN();
		
		//Display Student's Major
		System.out.println(objPhiSch.studentMajor("Engineering"));
		
		//Display Student's GPA
		System.out.println(objPhiSch.studentGPA(4));

		//Country 
		System.out.println(objPhiSch.studentCountry("India"));
		
		//Phone Number
		System.out.println(objPhiSch.phoneNumber("5081234567"));
		

		//Phone Number - Overriding the super class method
		System.out.println(objPhiSch.PhoneNumber(91, "9440141128"));
		
		//Address without passing values gets value from constructor
		System.out.println(objPhiSch.Fulladdress());
		
	}

}
