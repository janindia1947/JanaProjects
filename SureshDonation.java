package org.jana;

public class SureshDonation {

	//Home work Enhance the class by adding more constructors
	int donation = 10;
	String name = "";
	String reason = "No Reason";

	public SureshDonation(int donation) {
		//setting in class variable
		this.donation = donation;

	}

	//parameterized constructor
	public SureshDonation(int donation, String name) {
		//setting in class variable
		this.donation = donation;
		this.name = name;
	}

	public SureshDonation(int donation, String name, String reason) {
		//setting in class variable
		this.donation = donation;
		this.name = name;
		this.reason = reason;

	}

	public void printDonation() {
		System.out.println(name + ": donating $" + donation + " Reason is "+ reason);
	}
}