/**
 * Assignment 18 (ReverseNumber.java)
 * 
 * This program will prompt the user to enter a positive integer, then multiply the number by 2, and find the reverse of the result using the method --> public static long reverse(long i).
 *  
 * Sample Run:
 * Enter a positive integer: 540
 * 540 doubled is 1,080 and then reversed is 801
 * 
 * @input singular int from Standard Input System.in 
 * @logic Multiply the input by 2 and find the reverse of the result
 * @output The reverse of the calculated number
 * @author Alan Vuong
 */

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        long num;
        long calculatedNumber;       // The number after multiplied by 2
        long reverseNumber;         // calculated number reversed

        Scanner input = new Scanner(System.in); // Uses scanner for user input

        System.out.print("Enter a positive integer: ");
        num = input.nextInt();

        calculatedNumber = num * 2;
        reverseNumber = reverse(calculatedNumber);

        System.out.printf( "%,d doubled is %,d and then reversed is %,d\n", num, calculatedNumber, reverseNumber);
 
        input.close();
    }

    public static long reverse(long calculatedNumber) {
        long reverseNumber = 0;
        long digit;
        
        // find the reverse number
        while(calculatedNumber > 0) {
            digit = calculatedNumber % 10;
            reverseNumber = reverseNumber * 10 + digit;
            calculatedNumber /= 10;
        }

        return reverseNumber;
    }
}
