package org.jana;

public class CallOverLoadMethods {

	public static void main(String args[]) {
		MethodOverLoading mOL = new MethodOverLoading();

		
		//Call first Method
		System.out.println("###################################################################################"); 
		mOL.accountBalance(123);
		
		
		//Call Overloaded Method-1
		System.out.println("\n###################################################################################");
		double[] accountDetails = mOL.accountBalance(123, 500);
		System.out.println(" Balance on the Account Number : " + accountDetails[0] + 
				 " is : " + accountDetails[1]);
		
		//Call Overloaded Method-2
		System.out.println("\n###################################################################################");		
		String overLoadedMethod2 = mOL.accountBalance(1947, 3000, "Amitabh Bacchan");
		System.out.println("\n" + overLoadedMethod2);
		System.out.println("\n###################################################################################");
	}


}
