package org.jana;

public class ConstructorsExample {

	long phoneNumber=0;
	String address = "725 Chesterbrook , Washington DC";
	
	ConstructorsExample(int phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	ConstructorsExample(String address){
		this.address = address;
	}

	
	
	void printPhoneNumber(){
		System.out.println("INstance variable phone number " + this.phoneNumber);
	}
	
	
	void printAddress(){
		System.out.println("INstance variable address number " + this.address);
	}
	
	
	public static void main(String[] args) {
		ConstructorsExample myPhone = new ConstructorsExample(51647946);
		myPhone.printPhoneNumber();
		
		ConstructorsExample myAddr = new ConstructorsExample("White House, DC");
		myAddr.printAddress();

	}
	

}	

//Last brace and double click and ctrl+i

//Constructor with parameters .. can't call default constructor'