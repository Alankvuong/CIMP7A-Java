/**
 * Assignment 17 (Pentagonal.java)
 * 
 * This program will prompt the user to enter a single integer and print out
 * the first N pentagonal numbers. All numbers will be printed with a space 
 * then the number. The formula to obtain pentagonal numbers is 
 * P_n = ( 3 * n2 - n )/2
 *  
 * Sample Run:
 * Enter an integer: 2
 * The pentagonal numbers are: 1 5
 * 
 * @input One integer from Standard Input System.in 
 * @logic Calculate the pentagonal numbers of each n up to the given input
 * @output The pentagonal numbers
 * @author Alan Vuong
 */

 
import java.util.Scanner;

public class Pentagonal {
    public static void main(String[] args) throws Exception {
        int numInput;
        int pentagonalNumber;

        Scanner input = new Scanner(System.in); // Uses scanner for user input
        System.out.print("Enter an integer: ");
        numInput = input.nextInt();

        // Find pentagonal numbers
        
        System.out.print("The pentagonal numbers are: ");
        for(int i=1; i <= numInput; i++) {
            pentagonalNumber = (3 * (i*i) - i) / 2;

            if(i < numInput) {
                System.out.print(pentagonalNumber + " ");
            }
            else {
                System.out.println(pentagonalNumber);
            }
        }
        input.close();
        
    }
}
