/**
 * Assignment 6 (Exercise2_1.java)
 * 
 * This program will prompt the user to enter an integer, which will be read
 * using standard input, which is used as the measurement for celsius. Then 
 * the program will convert the entered celcius temperature to Farenheit and
 * output it to the user.
 *  
 * Sample Run
 * Enter a temperature in Celcius: 45.5
 * The temperature is 113.90 in Fahrenheit.
 * 
 * @input a double celsius from Standard Input System.in
 * @logic Take the inputted celsius and use the conversion equation (9.0/5)*c + 32
 * to convert to Farenheit.
 * @output: "The converted Celsius value to Farenheit."
 * 
 * @author Alan Vuong
 */

import java.util.Scanner;

public class Exercise2_1 {
    public static void main(String[] args) {
        double celsius, fahrenheit;     // variables used for input and storage.

        Scanner input = new Scanner(System.in);     // Uses scanner for user input
        
        System.out.print("Enter a temperature in Celsius: ");       // prompts user to enter input
        celsius = input.nextDouble();       // Accepts double for celsius
        fahrenheit = (9.0/5) * celsius + 32;    // Calculation for fahrenheit
        
        System.out.printf("The temperature is %,.2f in Fahrenheit.\n", fahrenheit); // Output of fahrenheiht

        input.close();  // closes input scanner
    }
}
