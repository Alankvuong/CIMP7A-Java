/**
 * Assignment 9 (Distance.java)
 * 
 * This program will prompt the user to enter two points, corresponding to 
 * (x1, y1) and (x2, y2) coordinate as doubles. Then, the distance between 
 * the two points will be displayed with precision of two decimal places.
 * Use the distance formula.
 *  
 * Sample Run (first point is 2, 2; second point is 5,2; x2=5 and y2=2):
 *
 * Enter two points: 2 2 5 2
 * The distance between the two points is 3.00
 * 
 * @input 4 doubles from Standard Input System.in
 * @logic Calculate distance between the coordinates using the Distance
 * Formula --> distance = squareRoot( (x2-x1)^2 + (y2-y1)^2) );
 * @output The distance between the two points.
 * @author Alan Vuong
 */

import java.util.Scanner;
import java.lang.Math;

public class Distance {
    public static void main(String[] args) {
        double x1, x2, y1, y2;    
        double distance;

        Scanner input = new Scanner(System.in); // Uses scanner for user input

        System.out.print("Enter two points: ");
        x1 = input.nextDouble();        // Gets first input
        y1 = input.nextDouble();        // Gets second input
        x2 = input.nextDouble();        // Gets third input
        y2 = input.nextDouble();        // Gets 4th input

        distance = Math.sqrt(Math.pow((x2-x1),2) + (Math.pow((y2-y1),2)));  /// Calculation to find distance between two points

        System.out.printf("The distance between the two points is %,.2f\n", distance);      // Prints formatted distance with two decimal precision.


        input.close();  // closes input scanner


    }
}
