/**
 * Assignment 8 (Exercise2_6.java)
 * 
 * This program will read in an annual interest rate and the number of months the Certificate of Deposit(CD) will be held as a double. The program will then output the final amount of the initial investment after x number of months.
 *  
 * Sample Run (Input is 823):
 *
 * Enter an integer between 0 and 1000: 823
 * The sum of all digits in 823 is 13
 * 
 * @input Two doubles: One for the annual interest rate, and one for the number of months that CD will be held for.
 * @logic Given the initial investment and the interest rate, calculate the final amount of money after the inputted amount of months with interest
 * @output The initial investment amount after x months with an annual interest rate of y and the final amount z.
 * @author Alan Vuong
 */

import java.util.Scanner;
import java.lang.Math;

public class CertificateDeposit {
    public static void main(String[] args) {
        double initValue = 1000.00;
        double annualRate;      // The annual interest rate
        double certDeposit;     // How long the deposit will be held for
        double finalValue;      // (initialValue) * (1 + annualRate/1200)^months
                                // Compounding monthly: Divide annual rate by (12*100)
                                    // Final: (initValue) * Math.pow(1 + (annualRate/(12*100)), months)

        Scanner input = new Scanner(System.in); // Uses scanner for user input

        System.out.print("Enter annual rate: ");
        annualRate = input.nextDouble();            // user enters annual rate 

        System.out.print("Enter CD term in months: ");
        certDeposit = input.nextDouble();           // user enters term of deposit

        finalValue = initValue * Math.pow((1 + (annualRate/(12*100))), certDeposit);        // Calculates the final value

        System.out.printf("An initial investment of $%.2f after %.0f months at annual rate of %.2f%% is $%.2f\n", initValue, certDeposit, annualRate, finalValue);       // outputs using print formatting

        input.close();  // closes input scanner
    }
}