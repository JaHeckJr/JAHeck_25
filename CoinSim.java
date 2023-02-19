package Programs;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.Random;
/*Joshua Heck
 Software Engineering
 Homework Submission
 Program simulates the amount of times a coin lands on head or tails dependent upon user input.
 */

  public class CoinSim {
	public static void main(String[] args) {
	
		CoinFlips coin = new CoinFlips();
		coin.begin();

		}

	}

	// Decalaration of Sides of the Coins along with random import

	class CoinFlips {
		private int NumOfFlips;
		private int Heads;
		private int Tails;
		private Random mismatch;
		private Scanner read;
		
		// Constuctor used to declare name of user input
		public CoinFlips() {
			read = new Scanner(System.in);
			mismatch = new Random();
		}
		
		public void begin () {
			NumOfFlips = getNumOfFlips();
			CoinFlipping();
			ResultStatement();
		}
		
		
		// Number of Flips are gathered through user input and loops
		private int getNumOfFlips () {
			while (true) {
				System.out.println("Hello! Enter the amount of times for the coin to be flipped");
			
			try {
				int NumOfFlips = read.nextInt();
				
				if (NumOfFlips <= 0) {
					System.out.println("Incorrect input, please enter a valid, positive number. ");
				}
				
				
				else {
					return NumOfFlips;
				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid number, please enter a positive number");
				read.nextLine(); // try and catch exception in case user enters incorrect input
			}
		}

	}


	   private void CoinFlipping() {
		int coin = 0;
		while (coin < NumOfFlips) {
			int ResultsOfFlips = mismatch.nextInt(2); // Declaration of 2 integers from random import(0, 1)
			coin++;
		
		if (ResultsOfFlips == 0) {
			Tails++;
		}
		else {
			Heads++;
		}
		}
	}


	// Number of times coin lands on heads or tails
	private void ResultStatement() {
		System.out.println("Number of times coin landed on heads: " + Heads);
		System.out.println("Number of times coin landed on tails: " + Tails);
	}
	

	}
		
		
		
	


