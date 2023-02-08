package org.example;

import java.util.Arrays;
import java.util.Scanner;

//Write a program to insert an element in an array
/**
 * Declare and assigning the values to the array
 * Allocate the new Storage space
 * Get the value from the user using Scanner function
 * Create a loop and execute the length of the array
 *Store the new number to the last positon of the Array
 *  Printing the New Array */

public class AddElementInArray {
    //Declare Main Method
    public static void main(String[] args) {
        //Declare the new number variable
        int newNumber;
        //Declare and assigning the values to the array
        int[] arr1={4,5,3,5,6,7,8,9,8};
        //Declare and Assign length of the Array to the Variable n
        int n= arr1.length;
        //Allocate the new Storage space
        int[] newArr=new int[n+1];
        //Get the value from the user using Scanner function
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Element to add");
        newNumber=s.nextInt();
        //Printing the Original Array using ToString function
          System.out.println("The original array is"+ Arrays.toString(arr1));
          //Create a loop and execute the length of the array
        for(int i = 0; i<n; i++) {
            newArr[i] = arr1[i];
        }
        //Store the new number to the last positon of the Array
        newArr[n] = newNumber;
        //Printing the New Array
        System.out.println("The New array is"+ Arrays.toString(newArr));
    }
}
