/**
 * Assignment 7 (Exercise2_6.java)
 * 
 * This program will prompt the user to enter an integer, which will be read
 * using standard input, and each digit will be added to get the sum.
 * The input data will not be negative or greater than or equal to 1000. It can be zero.
 *  
 * Sample Run (Input is 823):
 *
 * Enter an integer between 0 and 1000: 823
 * The sum of all digits in 823 is 13
 * 
 * @input an integer from 0 >= 1000 from Standard Input System.in
 * @logic Calculate the sum of the individual digits of the entered integer and output it to the user 
 * @output "The sum of the digits." 
 * @author Alan Vuong
 */

import java.util.Scanner;

public class Exercise2_6 {
    public static void main(String[] args) {
        int num;        // Stores number inputted
        int sum = 0;    // Stores final sum
        int tempNum;    // Stores copy of num to be outputted
        int digit;      // individual digits in inputted num
        
        Scanner input = new Scanner(System.in); // Uses scanner for user input

        System.out.print("Enter an integer between 0 and 1000: ");
        num = input.nextInt();          // Gets input from keyboard
        tempNum = num;                  // Copies value of num to tempNum var

        // while loop to add sum of digits
        while(num > 0) {
            digit = num % 10;   // Finds last digit of num
            sum = sum + digit;  // Adds digit to value of sum
            num = num / 10;     // Removes the last digit from the number
        }

    
        System.out.println("The sum of all digits in " + tempNum + " is " + sum);   // Final output statement

        input.close();  // closes input scanner
    }
}
