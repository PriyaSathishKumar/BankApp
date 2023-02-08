package org.example;

import java.util.Arrays;

//Write a program to reverse an array
/**
 * Declare and Defining the Array
 * */
public class RevArray{
    public static void main(String[] args) {
        //Declare and Defining the value of the Array
        int[] iArray = {11, 22, 33, 44, 55, 66, 77, 88, 99, 0};
        //Declare the temporary variable
        int[] tempNumber;
        //Assigning the array length to tempNmber variable
        tempNumber = new int[iArray.length];
        int tempPos=0;
        //Create and execute the loop for length of the Array
        for (int i = 0; i < iArray.length; i++) {
        //Print the original Array
            System.out.println(iArray[i]);
        }
        //Create a loop for reverse the Array its starting from the last position
        for (int j = iArray.length - 1; j >=0; j--) {
        //the last element of the array stored in tempNumber
            tempNumber[tempPos] = iArray[j];
        //increment the position
            tempPos++;
        }
        // Printing the reverse Array
             System.out.println("Reverse of Array is" + Arrays.toString(tempNumber));
    }
}

