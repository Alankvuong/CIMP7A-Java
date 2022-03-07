/**
 * Assignment 10 (Exercise 2_15.java)
 * 
 * This program will prompt the user to enter three points, corresponding to 
 * (x1, y1), (x2, y2), (x3, y3) triangle coordinates as doubles. Then, the 
 * area of the triangle will be displayed with two deicmal places. Calculate 
 * each side of the triangle using the distance formula.
 *  
 * Sample Run
 * Enter three points for a triangle: 1.5 -3.4 4.6 5 9.5 -3.4 
 * The area of the triangle is 33.60
 * 
 * @input 4 doubles from Standard Input System.in
 * @logic Calculate area of the triangle using formula area = ( side1 + side2 + side3)/ 2;
 * @output The are of the triangle made from the coordinates
 * @author Alan Vuong
 */

import java.util.Scanner;
import java.lang.Math;

public class Exercise2_15 {
    public static void main(String[] args) {
        double x1, x2, x3, y1, y2, y3;          // Store all the coordinate points
        double area;                            // Stores the area of the triangle 
        double side1, side2, side3;             // Stores the length of the sides of the triangle
        double s;

        Scanner input = new Scanner(System.in); // Uses scanner for user input

        System.out.print("Enter three points for a triangle: ");
        x1 = input.nextDouble();        // Gets first input
        y1 = input.nextDouble();        // Gets second input
        x2 = input.nextDouble();        // Gets third input
        y2 = input.nextDouble();        // Gets 4th input
        x3 = input.nextDouble();        // Gets 5th input
        y3 = input.nextDouble();        // Gets 6th input

        side1 = distance(x2, y2, x1, y1);           // Calculates side1
        side2 = distance(x3, y3, x2, y2);           // Calculates side2
        side3 = distance(x3, y3, x1, y1);           // Calculates side3

        s = (side1 + side2 + side3) / 2;
        area = Math.sqrt(s * (s-side1) * (s-side2) * (s-side3));        // Calculates area of triangle

        System.out.printf("The area of the triangle is %,.2f\n", area);        // Prints area

        input.close();  // closes input scanner

    }

    public static double distance(double x1, double y1, double x2, double y2) {     // Function to calculate distance of each side of triangle
        return Math.sqrt( (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1) );
    }
}


