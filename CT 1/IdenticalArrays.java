import java.util.Arrays;
import java.util.Scanner;

/**
 * IdenticalArrays
 */
public class IdenticalArrays {
    // Main method that runs the function
    public static void main(String[] args) {
        // Module implemented
        Scanner userInput = new Scanner(System.in);
        // Specify length of array
        int lengthOfArray = 4;
        
        // Initialize empty arrays
        int[] arrayOne = new int[lengthOfArray];
        int[] arrayTwo = new int[lengthOfArray];
        // For loop to store user input in first array
        for(int i = 0; i < lengthOfArray; i++) {
            System.out.println("Please enter an integer");
            // Adds entered value to array
            arrayOne[i] = userInput.nextInt();
            
        }
        // For loop for second array
        for(int j = 0; j < lengthOfArray; j++){
            System.out.println("Please enter an integer for the second Array");
            // Adds entered value to array
            arrayTwo[j] = userInput.nextInt();
            
        }
        // Closes scanner
        userInput.close();
        // boolean variable to compare the 2 arrays
        boolean compareArrays = Arrays.equals(arrayOne, arrayTwo);
        // If the values of the arrays are identical display that they are
        if (compareArrays) {
            System.out.println("The two arrays are identical");
            // Else display that they are not identical
        }else {
            System.out.println("The two arrays are not identical");
        }

        
    }
    
}