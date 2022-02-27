/**
 * Assignment 12 (Exercise3_33M.java)
 * 
 * This program will prompt the user to enter two details for two packages: 1) the
 * weights, 2) the price for the pacakages. Then the program will compare the cost
 * and determine which package has the better price. Read all data as doubles.
 *  
 * Sample Run:
 * Enter weight and price for package 1: 25 11.99
 * Enter weight and price for package 2: 50 24.59
 * Package 1 has a better price.
 * 
 * @input two doubles from Standard Input System.in for weight and price
 * @logic Compare and evaluate which package has better value
 * @output The package with the better price
 * @author Alan Vuong
 */

import java.util.Scanner;

public class Exercise3_33M {
    public static void main(String[] args) {
        double weight1, weight2;        // stores weight of packages
        double price1, price2;          // Stores price of pacakges
        double value1, value2;          // Stores the value of package 

        Scanner input = new Scanner(System.in);     // Uses scanner for input
        System.out.print("Enter weight and price for package 1: ");
        weight1 = input.nextDouble();
        price1 = input.nextDouble();

        System.out.print("Enter weight and price for package 2: ");
        weight2 = input.nextDouble();
        price2 = input.nextDouble();

        value1 = price1 / weight1;
        value2 = price2 / weight2;

        if (value1 < value2) {
            System.out.println("Package 1 has a better price.");
        } 
        else if (value1 > value2) {
            System.out.println("Package 2 has a better price.");
        }
        else {
            System.out.println("Packages have the same price.");
        }

        input.close();  // closes input scanner
    
    }
}
