/**
 * Assignment 15 (IntegerCount.java)
 * 
 * This program will prompt the user to enter multiple intgers until 0 is entered.
 * The program will then output the number of integers read.
 *  
 * Sample Run:
 * Enter an integer, the input ends if it is 0: 2
 * 3
 * -100
 * 1000
 * 99
 * 0
 * The number of integers is 5
 * 
 * @input multiple ints from Standard Input System.in 
 * @logic Store the number of integers that were entered
 * @output The number of intgers that were entered before 0 
 * @author Alan Vuong
 */

import java.util.Scanner;

public class IntegerCount {
    public static void main(String[] args) {
        int numInput;
        int numCounter = 0;

        Scanner input = new Scanner(System.in); // Uses scanner for user input

        System.out.print("Enter an integer, the input ends if it is 0: ");

        // loop runs while input is not 0
        while((numInput = input.nextInt()) != 0) {
            if (numInput != 0) {
                numCounter++;       // increases the counter
            }
        }

        if (numCounter != 0) {
            System.out.println("The number of integers is " + numCounter);
        }
        else {
            System.out.println("No numbers were entered except 0");
        }
        input.close();  // closes input scanner
    }
}
