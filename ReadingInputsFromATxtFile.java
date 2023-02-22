import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;


public class TriangleHomework {
   public static void main (String[] args) throws IOException {
      FileInputStream fileByteStream = null; // File input stream                  // Scanner object
      int fileNum1;                  // Data value from file
      int fileNum2;      
      int sum = 0;

      // Try to open file
      System.out.println("Opening file numFile.txt.");
      fileByteStream = new FileInputStream("Untitled.txt");
     Scanner inFS = new Scanner(fileByteStream);
      
      ReadingNumbers in = new ReadingNumbers();
      in.set(sum, sum);
      in.getNumbers();
      
      // File is open and valid if we got this far 
      // (otherwise exception thrown)
      // numFile.txt should contain two integers, else problems
      System.out.println("Reading two integers.");
      /*fileNum1 = inFS.nextInt();
      fileNum2 = inFS.nextInt(); */
      
      /*int i = 0;
      while (inFS.hasNextInt()) {
       	  i = inFS.nextInt();
       	  sum = i + sum;
       	  System.out.println(i);*/
      int i = 0;
      while (inFS.hasNextInt()) {
       	  i = inFS.nextInt();
       	  sum = i + sum;
       	  System.out.println(i);
       	  
         }
     
      System.out.println(sum);
 
      // Output values read from file
    /*  System.out.println("num1: " + fileNum1);
      System.out.println("num2: " + fileNum2);
      System.out.println("num1+num2: " + (fileNum1 + fileNum2)); */

      System.out.println("Closing file numFile.txt.");
    
   
  
	     FileOutputStream fileStream = null;
	     PrintWriter outFS = null;

	    
	     fileStream = new FileOutputStream("Output.txt");
	     outFS = new PrintWriter(fileStream);

	     
	     outFS.println("Hello, reading anwer from different file, sum is.....");
	     outFS.println(sum);

	    
	     outFS.close();
	     fileByteStream.close(); 
	  }
	}

	
class ReadingNumbers {
	private double i = 0;
	private double sum;
	
	public void set (int inFS, int sum) {
		this.i = inFS;
		this.sum = sum;
	}
     public void getNumbers () {
    	 
     Scanner inFS = null;
}

}


	 