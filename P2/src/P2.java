/**
 * Assignment 4
 * 
 * Reads two integers from standard input, and the input read will be between -2^20 to 2^20.
 * The program does not have to worry about overflow.
 * 
 * After reading the integers, the program will output the two numbers inputted, along with its sum, quotient, and product.
 *  
 * Sample Run...
 * 13 3
 * 13 + 3 = 16
 * 13 / 3 = 4.333333333333333
 * 13 * 3 = 39
 * 
 * @input integer n from Standard Input System.in
 * @logic take input n and multiply it by 3. The output statement will be n * 3
 * @output: "# Space + Space # Space = Space # Newline" "# Space / Space # Space = Space #.#* Newline" "# Space * Space # Space = Space # Newline" where # is default output for an integer and #.#" is default output for a double."
 * 
 * @author Alan Vuong
 */

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        int numOne; // first integer to be read
        int numTwo; // second integer to be read
        int sum, product; // sum/product storage variable
        double quotient; // quotient storage variables

        Scanner input = new Scanner(System.in);

        // Reading in inputs using scanner
        numOne = input.nextInt();   // first num input
        numTwo = input.nextInt();   // second num input

        // Calculations 
        sum = numOne + numTwo;      // sum of two numbers
        quotient = (double)numOne / numTwo;     // quotient of two numbers
        product = numOne * numTwo;  // product of two numbers

        // Outputs for sum, quotient, and product
        System.out.println(numOne + " + " + numTwo + " = " + sum);      
        System.out.println(numOne + " / " + numTwo + " = " +  quotient);
        System.out.println(numOne + " * " + numTwo + " = " +  product);

        input.close();    // closes input scanner 
    } // end main
} // end class P2
