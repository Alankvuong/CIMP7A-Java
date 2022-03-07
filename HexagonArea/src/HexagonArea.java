/**
 * Assignment 13 (HexagonArea.java)
 * 
 * This program will prompt the user to enter the side of a hexagon and display
 * its area.
 *  
 * Sample Run:
 * Enter the side: 2.345
 * The area of the hexagon is 14.29
 * 
 * @input a double from Standard Input System.in for the side length of a hexagon
 * @logic Calculate the area of a hexagon using formula. Hexagon has 6 sides of same length.
 *              Area = ( 6 * s2) / ( 4 * tan( π / 6 ) )
 * @output The area of a hexagon
 * @author Alan Vuong
 */

import java.util.Scanner;

public class HexagonArea {
    public static void main(String[] args) {
        double lengthSide;      // stores the length of the side
        int numSides = 6;       // number of sides in a hex
        double area;            // Final area of hexagon

        Scanner input = new Scanner(System.in); // Uses scanner for user input
        
        System.out.print("Enter the side: ");
        
        lengthSide = input.nextDouble();
        area = ((numSides * Math.pow(lengthSide, 2)) / (4 * Math.tan(Math.PI / numSides)));     // calculation for area
        
        System.out.printf("The area of the hexagon is %,.2f\n", area);

        input.close();  // closes input scanner
    
    }
}
