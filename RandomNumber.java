package Programs;
import java.util.Scanner;
import java.util.Random;


public class RandomNumber {
	// variable declaration for the integer, number, and random.
	private int number;
	private Random mismatch;
	
	public RandomNumber (int number) {
		this.number = number;
		mismatch = new Random();
	}
	
	// returns increment of next number
	public int getNumberGenerator() {
		return mismatch.nextInt(number) + 1;
	}

	
	public static void main(String[] args) {
		// Scanner reading user input
		Scanner reading = new Scanner(System.in);
		int number = 0;
		while (number <= 0) {
			System.out.println("Hello there! Please enter a positive integer to be read into the program");
			
			try {
				number = reading.nextInt();
				if (number <= 0) {
			throw new IllegalArgumentException ("Input is not valid. Please try again, enter a positive number this time.");
				} 
				
			} catch (Exception e) {
					System.out.println(""); // try and catch exception in case user inputs incorret number
					reading.nextLine();
				}
			}
		
			// Object to call random number generation, as well as the result for the program
			RandomNumber gen = new RandomNumber(number);
			int CompletelyRandom = gen.getNumberGenerator();
			System.out.println("A random number between 1 and the user input " + number + " is: " + CompletelyRandom);
			
		}
	}
	


