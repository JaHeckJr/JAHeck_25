/* Joshua Heck
 Advanced Programming Concepts
 Homework Submission5
 Program computes the sum of the digits given a following integer
 inputed by the user using a recursive method.
 */



package Programs;
import java.util.Scanner;
public class ActualHomework5 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Hello! Please enter an integer");
		long num = input.nextLong();
		
		Total obj = new Total ();
		obj.SetNumber(num);
		obj.getSum(num);

	}
	
}
	
	class Total {
	private long num;

	
	public void SetNumber (long number){
		this.num = number;
	}
	
	public static int SumofInteger (long number) {
		return SumofDigits(number, 0);
	}

	
	public static int SumofDigits(long number, int sum) {
		if (number == 0) 
			return sum;
		else
			return SumofDigits(number / 10, sum + (int)(number % 10));
	}
	

public void getSum (long TotalSum) {
	System.out.println("Sum of the integers inputed are " + SumofInteger(num));
}

}