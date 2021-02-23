package org.jana;

public class AnyData {
	
	//static method example-1
	public static int getZipCode(String cityName) {
		int zipCode = 0;
		String zipAndTemp;
		if(cityName=="Philadelphia") {
			zipCode=19444;
		}
		
		return zipCode;
	}
	
	//Static method using Array Variable
	public static String[] getStudentDetails() {
		//Instantiate the array Variable
		String[] studentDetails = new String[]{"1,Modi","2,Trump","3,Biden"};
		return studentDetails ;
	}
 
}
