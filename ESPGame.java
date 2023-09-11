/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: A game that will allow the user to try and guess the color that the program has chosen randomly.
 * Due: 09/11/2023
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: LEVI KELLEY
*/

import java.util.Random;
import java.util.Scanner;

public class ESPGame 
{
	
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in)
				;
		final String RED_COLOR = "Red", BLUE_COLOR = "Blue", GREEN_COLOR = "Green", // assign strings
					 ORANGE_COLOR = "Orange", YELLOW_COLOR = "Yellow",				// color values
					 PURPLE_COLOR = "Purple", GOLD_COLOR = "Gold"; 		            // for game
		
		int numberColor;
		int round = 1;
		int correctGuesses = 0;
		
		System.out.println("Enter your name: "); // gather user information
		String userName = keyboard.nextLine();
		
		System.out.println("Enter your MC M#: "); // gather user information
		String userMCNumber = keyboard.nextLine();
		
		System.out.println("Describe yourself: "); // gather user information
		String userDescription = keyboard.nextLine();
		
		System.out.println("Due date: "); // gather user information 
		String dueDate = keyboard.nextLine();
		
		System.out.println("CMSC203 Assignment 1: Test your ESP skills!");
		System.out.println("Round " + round);
		
		for (int i = 0; i < 10; i++)
		{
			Random randomNumbers = new Random(); // generate random number to choose color
			numberColor = randomNumbers.nextInt(7);
			
			++round;
			String secretColor = "";
			String userGuess = "";
			
			
			if (numberColor == 0)
				secretColor = RED_COLOR;
			else if (numberColor == 1)
				secretColor = BLUE_COLOR;
			else if (numberColor == 2)
				secretColor = GREEN_COLOR;
			else if (numberColor == 3)
				secretColor = ORANGE_COLOR;
			else if (numberColor == 4)
				secretColor = YELLOW_COLOR;
			else if (numberColor == 5)
				secretColor = PURPLE_COLOR;
			else if (numberColor == 6)
				secretColor = GOLD_COLOR;
			
			System.out.println();
			System.out.println("I am thinking of a color.");
			System.out.println("Is it Red, Blue, Green, Orange, Yellow, Purple, or Gold?");
			System.out.println("Enter your guess:");
			
			userGuess = keyboard.nextLine();
			while(!userGuess.equalsIgnoreCase(RED_COLOR) && !userGuess.equalsIgnoreCase(BLUE_COLOR) && !userGuess.equalsIgnoreCase(GREEN_COLOR) && 
					!userGuess.equalsIgnoreCase(ORANGE_COLOR) && !userGuess.equalsIgnoreCase(YELLOW_COLOR) && !userGuess.equalsIgnoreCase(PURPLE_COLOR) && !userGuess.equalsIgnoreCase(GOLD_COLOR)
					|| !userGuess.matches("[a-zA-Z_]+")) //input validation to accept only guesses from the pre-chosen colors
			{
				System.out.println("Invalid input, please enter only one of the color choices.");
				System.out.println("Re-enter your guess.");
				System.out.println("Is it Red, Blue, Green, Orange, Yellow, Purple, or Gold?");
						
				userGuess = keyboard.nextLine();
			}	
			
			if (userGuess.equalsIgnoreCase(secretColor))
				correctGuesses++;
			
			System.out.println();
			System.out.println("I was thinking of " + secretColor);
			
			if (round < 11)
			{
			System.out.println("Round " + round);
			}
			else if (round >= 11)
				System.out.println("Game Over");
			System.out.println();
		
		}
		
		System.out.println("You guessed " + correctGuesses + " out of " + round + " colors correctly.");
		System.out.println("User Name: " + userName);
		System.out.println("User Description: " + userDescription);
		System.out.println("User MC M#: " + userMCNumber);
		System.out.println("Due Date: " + dueDate);
		keyboard.close();
	
	}
}



