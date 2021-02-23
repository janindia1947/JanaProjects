package org.jana;

public class StringBufferExample {

     //Variables should not be capapitalized.
	//Method to get the personal Details
	public String getPersonalDetails(String sal, String fname, String lname, String street, String city, int zipcode) {
		//StringBuffer is mutable.
		//String Buffer saves variables.
		StringBuffer sb = new StringBuffer(sal);
		sb.append(" ");
		sb.append(fname);
		sb.append(" ");
		sb.append(lname);
		sb.append("\n");
		sb.append(street);
		sb.append("\n");
		sb.append(city);
		sb.append("\n");
		sb.append(zipcode);
		
		//sb is String Buffer. But when returning the value as String so i used sb.toString method
		return sb.toString();
		
	}

}
