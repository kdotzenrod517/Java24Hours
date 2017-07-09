package com.java24hours;

public class Nines {
	
	public static void main(String[] args){
		
		int limit = 5;
		int count = 1;
		
		for (int dex = 1; dex <= 200; dex++){
			int multiple = 9 * dex;
			System.out.print(multiple + " ");
			}
		System.out.println();
		
		do {
			System.out.println("Pork is not a verb");
			count++;
		} while (count < limit);
		
		int i, j;
		
		for (i = 0, j = 0; i * j < 1000; i++ ,j +=2){
			System.out.println(i + " * " + j + " = " + (i*j));
		}
		}
	
}

