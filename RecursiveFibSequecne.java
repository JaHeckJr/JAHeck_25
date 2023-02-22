/*Joshua Heck
 Classwork FibSequence
 Advanced Programming
 Program asks user to input an index number, than program gives user the FibSequence.
 Program utilizes a recursive method
 */


package Programs;
import java.util.Scanner;
public class ClassworkOctober {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Hello! please enter an index number in order to determine the fibonacci sequence");
		int index = scnr.nextInt();
		
		FibonacciSequence obj = new FibonacciSequence();
		obj.setResult(index);
	    obj.getResult(index);
	
	}

}

class FibonacciSequence {
	private int Result;
	private int index;
	public void setResult (int ActualIndex) {
		this.index = ActualIndex;
		
	}
		public static int LegitResult (int ActualIndex) {
			if (ActualIndex == 0) {
			return 0;
		}
			if (ActualIndex == 1) {
				return 1;
			}
			
			else {
				return LegitResult(ActualIndex - 1) + LegitResult(ActualIndex - 2);
			}
			
		}
	
		public void getResult (int Result) {
			System.out.println(LegitResult(Result));
		}
	
		}


	



	
