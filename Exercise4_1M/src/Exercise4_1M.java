/**
 * Assignment 16 (Excercise4_1.java)
 * 
 * This program will prompt the user to enter multiple intgers until 0 is entered.
 * The program will then output the number of positives, negatives, and the total 
 * number of numbers input, and the average.
 *  
 * Sample Run:
 * Enter an integer, the input ends if it is 0: 1
 * 2
 * -1
 * 9
 * 0
 * The number of positives is 3
 * The number of negatives is 1
 * The total is 11
 * Average is 2.75
 * 
 * @input multiple ints from Standard Input System.in 
 * @logic Store the number of integers that were entered, and calculate the average.
 * @output The the number of positives, negatives, and the total number of numbers input, and the average.
 * @author Alan Vuong
 */

import java.util.Scanner;

public class Exercise4_1M {
    public static void main(String[] args) {
        int numInput;
        int numCounter = 0;
        int positiveCounter = 0;
        int negativeCounter = 0;
        long sum = 0;
        double average;
    
        Scanner input = new Scanner(System.in); // Uses scanner for user input
        System.out.print("Enter an integer, the input ends if it is 0: ");

        // loop runs while input is not 0
        while((numInput = input.nextInt()) != 0) {
            if (numInput != 0) {
                numCounter++;           // increases the counter
            }
            if (numInput < 0) {
                negativeCounter++;      // Increases negative counter
            }
            else if(numInput > 0) {
                positiveCounter++;      // Increases positive counter
            }

            sum += numInput;       // Adds all the inputted numbers
        }

        
        if (numCounter != 0) {
            System.out.println("The number of positives is " + positiveCounter);
            System.out.println("The number of negatives is " + negativeCounter);
            System.out.println("The total is " + sum);
            
            average = sum / (double)numCounter;     // Gets the average
            System.out.printf("Average is %,.2f\n", average);
        }
        else {
            System.out.println("No numbers were entered except 0");
        }
        input.close();
    }
}
