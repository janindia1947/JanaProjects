package org.jana;

public class StringExamples {


	public static void main(String args[]) {

		//#int a= 10;

		String message = "error updated";

		if(message.equals("Sucessfully updated")) {
			System.out.println("pass");
		}else {
			System.out.println("failed");
		}




		String s = "a,b,c"; 

		String s1 = new String("tendulkar");

		int count = s.length();

		String name = s.concat(s1);

		System.out.println(s.endsWith("t"));

		System.out.println("empty "+ s.isEmpty());
	}
}	