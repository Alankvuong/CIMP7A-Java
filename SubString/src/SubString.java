/**
 * Assignment 14 (SubString.java)
 * 
 * This program will prompt the user to enter two strings and checks to see if 
 * the second string is a substring of the first string.
 *  
 * Sample Run:
 * Enter string s1: ABCD
 * Enter string s2: BC
 * BC is a substring of ABCD
 * 
 * @input two strings from Standard Input System.in 
 * @logic Compare whether the second string is a substring of the first h/
 * @output Whether or not the second string is a substring of the first stringOH 
 * @author Alan Vuong
 */

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        String stringOne;       // Stores first string
        String stringTwo;       // Stores second string

        Scanner input = new Scanner(System.in); // Uses scanner for user input
        System.out.print("Enter string s1: ");
        stringOne = input.nextLine();
        System.out.print("Enter string s2: ");
        stringTwo = input.nextLine();

        if(stringOne.contains(stringTwo)) {
            System.out.println(stringTwo + " is a substring of " + stringOne);
        }
        else {
            System.out.println(stringTwo + " is not a substring of " + stringOne);
        }

        input.close();  // closes input scanner
    }
}
