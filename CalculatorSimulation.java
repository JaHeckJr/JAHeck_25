/* Joshua HecK
  Software Engineering
  Homework Assingment 1
  The following program simulates a calculator
 */
package Programs;
import java.util.Scanner;

public class CalculatorSimulation {
	//Declaration of names for user Input and operators
	private double UserNum1;
	private double UserNum2;
	private String operations;
	
	public CalculatorSimulation (double UserNum1, double UserNum2, String operations) {
		this.UserNum1 = UserNum1;
		this.UserNum2 = UserNum2;
		this.operations = operations;
	}
	
	
	// Method used to find calculations
	public double Calculations() throws Exception {
		double FinalResult = 0;
		
		switch (operations) {
		case "+":
			FinalResult = UserNum1 + UserNum2;
			break;
			
		case "-":
			FinalResult = UserNum1 - UserNum2;
			break;
			
		case "*":
			FinalResult = UserNum1 * UserNum2;
			break;
			
		case "/":
			FinalResult = UserNum1 / UserNum2;
			
			if (UserNum2 == 0) {
				throw new Exception("Error: Operator inputed is invalid");
			}
			break;
			
		default:
			
			throw new Exception ("Error: Operator inputed is invalid");
		}
		
		// try and catch exception in case user inputs invalid operator
		return FinalResult;
	}
	


  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	
	// Display menu for user
	while (true) {
		try {
			System.out.println("Enter one of the following operators listed below");
			System.out.println();
			System.out.println("+");
			System.out.println("-");
			System.out.println("*");
			System.out.println("/");
			System.out.println("Type in the letter 'L' to leave program");
			
			String operations = input.nextLine();
			
			if (operations.equalsIgnoreCase("L")) {
				System.out.println();
				System.out.println("Program exited: Have a good day!");
				break;
			}
			
			// scanner reading user input
			System.out.println("Enter two numbers for calculations");
			double UserNum1 = input.nextDouble();
			double UserNum2 = input.nextDouble();
			input.nextLine();
			
			
			
			CalculatorSimulation math = new CalculatorSimulation(UserNum1, UserNum2, operations);
			double FinalResult = math.Calculations();
			
			// Results of calculations are printed below
			System.out.println("Result is: " + FinalResult);
		} catch (Exception e) {
			
			// try and catch exception are used in case user inputs incorrect operator or numbers
			System.out.println("Invalid operator inputed");
		}
	}
	
	input.close();
	}
}








