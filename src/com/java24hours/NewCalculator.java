package com.java24hours;

public class NewCalculator {

	public static void main(String[] arguments){
		float sum = 0;
		for (String argument : arguments){
			try {
				sum = sum + Float.parseFloat(argument);
			} catch (NumberFormatException e){
				System.out.println(argument + " is not a number.");
			}
			System.out.println("Those numbers add up to: " + sum);
	}
	
}
	
}
