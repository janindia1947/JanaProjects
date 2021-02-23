package org.jana;


public class Donation {

	int donation = 10;
	String name = "";
	String reason = "No Reason";
	
	public Donation(int donation) {
		//setting in class variable
		this.donation = donation;
		
	}
	
	//parameterized constructor
	public Donation(int donation, String name) {
		//setting in class variable
		this.donation = donation;
		this.name = name;
	}
	
		public Donation(int donation, String name, String reason) {
			//setting in class variable
			this.donation = donation;
		}
}		