/**
 * Assignment 10 (Even.java)
 * 
 * This program will prompt the user to enter an integer and then output
 * whether or not the inputted number is even as a boolean.
 *  
 * Sample Run:
 *
 * Enter an integer: 3
 * Is 3 an even number? false
 * 
 * @input 1 integer from Standard Input System.in
 * @logic Use the % operator to determine if even or odd.
 * @output True or false depending on if even or odd
 * @author Alan Vuong
 */

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        int userNum;

        Scanner input = new Scanner(System.in); // Uses scanner for user input

        System.out.print("Enter an integer: ");     // Prompts user for int
        userNum = input.nextInt();

        System.out.print("Is " + userNum + " an even number? ");

        if (userNum % 2 == 0) {
            System.out.println("true");     // True if num mod 2 is 0
        }
        else {
            System.out.println("false");    // Othewise false
        }

        input.close();  // closes input scanner
    }
}
