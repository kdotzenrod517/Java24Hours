package com.java24hours;

public class Commodity {

	public static void main(String[] args){
		
		String command = "BUY";
		int balance = 550;
		int quantity = 42;
		
		String gender = "female";
		
		switch (command) {
			case "BUY":
				quantity += 5;
				balance -= 20;
				break;
			case "SELL":
				quantity -= 5;
				balance += 15;	
		}
		
		System.out.println("Balance: " + balance + "\n"
				+ "Quantity: " + quantity);
		
		System.out.println( (gender.equals("female")) ? "Mrs." : "Mr." );
		
	}
}
