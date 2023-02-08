package org.example;

import java.util.Scanner;

//Write a program to check whether the year is Leap year or not

/**Getting the input from user
 * Check the condition using logical operator that year should divide by 400 or
 * divide by 4 not divide by 100
 * if condition is true it will print It is a leap year
 * condition is false  it will print The year is not leap year
 */
public class LeapYear {
    public static void main(String[] args) {
        //Declare the variable year
        int yr;
        //Getting the input from user
        System.out.println("Enter the year");
        Scanner s = new Scanner(System.in);
        //assigning the input to the yr Variable
        yr = s.nextInt();
        //Check the condition using logical operator that year should divide by 400 or divide by 4 not divide by 100
        if ((yr % 400 == 0) || ((yr % 4 == 0) && (yr % 100 != 0))) {
            //if condition is true it will print It is a leap year
            System.out.println("The year is Leap year");
        }
        //condition is false  it will print The year is not leap year
        else {
            System.out.println("The year is not a Leap year");
        }

    }
}
