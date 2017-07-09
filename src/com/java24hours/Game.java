package com.java24hours;

public class Game {
	
	public static void main(String[] args){
		
		int total = 0;
		int score = 7;
		
		int playerScore = 12000;
		int playerLives = 3;
		int difficultyLevel = 10;
		
		char grade = 'A';
		
		if (score == 7){
			System.out.println("You scored a touchdown!");
		}
		
		if (score == 3){
			System.out.println("You scored a field goal!");
			
		}
		
		total = total + score;
		System.out.println("Total score: " + total);
		
		if (playerScore > 9999){
			playerLives++;
			System.out.println("\nExtra life!");
			difficultyLevel = difficultyLevel + 5;
		}
		
		
		switch (grade) {
			case 'A':
				System.out.println("\nYou got an A!");
				break;
			case 'B':
				System.out.println("\nYou got a B!");
				break;
			case 'C':
				System.out.println("\nYou got a C");
				break;
			default:
				System.out.println("\nFAIL");
		}
		
	}

}
