import java.util.Scanner;

/**
 * SumsElements
 */
public class SumsElements {

    // Main method
    public static void main(String[] args) {
        // Run input module
        Scanner userInput = new Scanner(System.in);
        // Declare empty two dimensional array
        double[][] twoDimensionalArray = new double[3][4];
        // Declare total
        double arrayTotal = 0;
        // for loop to access first row
        for(int i = 0; i < twoDimensionalArray.length; i++){
            System.out.println("Please enter an integer");
            // For loop to access columns
            for(int j = 0; j < twoDimensionalArray[i].length; j++){
                // Enter values for rows and columns
                twoDimensionalArray[i][j] = userInput.nextDouble();
            }

        }
        // for loop to access rows
        for(int i = 0; i < twoDimensionalArray.length; i++){
            // Calculating the total of all columns
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                arrayTotal += twoDimensionalArray[i][j];
            }
        }
        // Display the total
        System.out.println("The sum of the two-dimensional array is " + arrayTotal);
        // Close scanner
        userInput.close();
    }
}