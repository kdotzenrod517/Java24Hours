package com.java24hours;

public class Virus {
	
	static int virusCount = 0;
	
	public Virus() {
		virusCount++;
	}
	
	static int getVirusCount(){
		return virusCount;
	}
	
}
