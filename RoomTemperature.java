package Programs;
/*Joshua Heck
 Software Engineering
 Homework 1
 Program determines the temperature of a room from morning till noon based 
 off of user input
 * 
 */
import java.util.Random;
import java.util.Scanner;

public class RoomTemperature {
	private int MorningTemp;
	private int NoonTemp;

	// The Constuctor, like every other program, is used initialize variables
	public RoomTemperature () {
		MorningTemp = 20;
		NoonTemp = 0;
	}
	
	
	public void FindTemperature () {  // Method Finds Temperature
		Random mismatch = new Random();
		
		//Part of the program generates a random number
		for (int Hour = 1; Hour <= 4; Hour++) {
			int ChangeofTemp = mismatch.nextInt(5) - 2;
			int NewTemp = MorningTemp + ChangeofTemp;
			System.out.println("For hour " + Hour + ", the new temperature is " + NewTemp);
			MorningTemp = NewTemp; // Morning Temperature is consistently updated
		}
		
	
	NoonTemp = MorningTemp + mismatch.nextInt(5);
	System.out.println("The noon temperature is: " + NoonTemp + " Celsius");
		
	}

	public static void main(String[] args) {
		try {
			Scanner scnr = new Scanner (System.in);
			System.out.println("Hello There! Please enter the room's initial temperature in degree Celsius");
			int StartTemp = scnr.nextInt();
			
			RoomTemperature RT = new RoomTemperature();
			RT.MorningTemp = StartTemp;
			RT.FindTemperature();
			
			// scanner is closed
			scnr.close();
			
			
		} catch (Exception e) { // try and catch exception for program to correct user error
			
			System.out.println("Invalid input, please restart program to try again");
		}

	}

}
