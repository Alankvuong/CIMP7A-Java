/**
 * Assignment 3
 * 
 * Read an integer from standard input, and the input read will be between -2^20 to 2^20.
 * This is important because the program does not have to worry about overflow, as a Java 
 * int uses 32-bits. After reading the integer, output the number read and its value tripled.
 * 
 * Sample Run...
 * 50
 * The number 50 tripled is 150
 * 
 * @input integer n from Standard Input System.in
 * @logic take input n and multiply it by 3. The output statement will be n * 3
 * @output: "The number n tripled is n*3\n" Where n is integer just read"
 * @author Alan Vuong
 */

public class TripleInteger {
    /**
     * input integer n triple it, does all work
     * @param args
     */
    public static void main(String[] args) {
        int n; // integer to be read

                                        //use default standard input stream create formatted input stream
        java.util.Scanner input = new java.util.Scanner(System.in);

        n = input.nextInt();
        System.out.println("The number " + n + " tripled is " + n*3); // output
        //println will terminate the line with a newline character

        input.close();  // closes the input scanner
    } // end main
}   // end class TripleInteger