/* Joshua Heck
Software Engineering
Binary Search
*/
import java.util.Scanner;

public class ClassWork {

    public static int binarySearch(int[] numbers, int numbersSize, int key) {
        int mid = 0;
    //Middle index in the array is initialized

        int low = 0;
//Low index of the array is initialized

        int high = numbersSize - 1;
//High index of the following array is initialized


        while (high >= low) {    // While loop keeps going if there are still elements and indexes in the array that have not been searched
       mid = (high + low) / 2; // Summation of high and low index divided by 2 is used to calculate the middle
        if (numbers[mid] < key) { // If statement is used in case the middle element/index is less than the key value being determined
                low = mid + 1;  // *Low index of the array is set to one below the middle index
            } else if (numbers[mid] > key) {  // Else-if statement is used in case the middle element/index is higher than the key value being determined
                high = mid - 1; // HIgh index of the array is set to one below the middle index

            } else { // else statement
                return mid; // return Middle index/element is returned in case Binary search tree can not find the appropiate index
            }
        }

        return -1;  // To indicate the key value was not found, return -1
    }
    

    public static void main(String[] args) {
        int[] numbers = { 2, 4, 7, 10, 11, 32, 45, 87 }; // Array of numbers is initialized
        int NUMBERS_SIZE = 8; // Size of the array is declared
        int i = 0; // Variable I is declared for loop
        int key = 0; // Key initalize key value
        int keyIndex = 0; // Key Index is initailzed

        System.out.print("NUMBERS: ");
        for (i = 0; i < NUMBERS_SIZE; ++i) { // for loop to loop through the array to print each statement
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.print("Hello! Enter a value: "); //Prompts the user to enter a value 
        key = input.nextInt(); // Value get from the user 
      
        input.close();
        

        keyIndex = binarySearch(numbers, NUMBERS_SIZE, key); // BinarySearch function is called to find the index of the value

        if (keyIndex == -1) {
            System.out.println(key + " was not found."); // Print statement for if the key value was not found 
        } 
        else {
            System.out.println("Found " + key + " at index " + keyIndex + "."); // Print statement for if the key value was not found
        }
        
    }
}

