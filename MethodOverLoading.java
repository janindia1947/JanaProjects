package org.jana;

public class MethodOverLoading {
	
	//Method-1
	public void accountBalance(int accountNumber){
		System.out.println("First Method called. Balance for the Account Number " + accountNumber + " is : 100.00 $");
	}
	
	//Overloaded Method-1
	public double[] accountBalance(int accountNumber, int depositAmount) {
		double depositDetails[] = {accountNumber,depositAmount};
		System.out.println("\n Overloaded Method-1 is called.");
		return depositDetails ;
	}

	//Overloaded Method-2
	public String accountBalance(int accountNumber, int depositAmount , String customerName) {
		System.out.println("\n Overloaded Method-2 is called.");
		String accountDetails = "Customer " + customerName + " bearing the Account Number " + 
		          Integer.toString(accountNumber)+ " Deposited : " + Integer.toString(depositAmount) + " $";
		return accountDetails;
	}	
	

}
