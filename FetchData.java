package org.jana;

public class FetchData{

	public static void main(String args[]) {
		String cityName="Philadelphia";

		//Call the Static method to get ZipCode
		System.out.println("ZipCode for " + cityName + " is : " + AnyData.getZipCode("Philadelphia"));

		//Array Reading using index number
		System.out.println("\n Print Array Values calling the Static Method by Index "); 
		String[] dataDetails = AnyData.getStudentDetails();
		System.out.println(dataDetails[0]);
		System.out.println(dataDetails[1]);
		System.out.println(dataDetails[2]);

		//Array Reading using For Loop
		System.out.println("\n Print Array Values calling the Static Method by using For Loop ");		
		//Get the length of the array
		int arrayLength = dataDetails.length;
		for(int i=0; i<=arrayLength-1; i++) {
			System.out.println(dataDetails[i]);
		}

	}
}
