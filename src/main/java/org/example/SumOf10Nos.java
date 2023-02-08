package org.example;

//Write a program to find the Sum of 10 numbers

/**
 * Declare a array variable and asssign the Values in it.
 * declare the variable sum and check the condition till the array length
 * sum the values of array by increment by 1 in the for loop
 * once its complete the loop it will Print the value
 */
public class SumOf10Nos {
    public static void main(String[] args) {
        //Declare a array variable and asssign the Values in it
        int[] number = {8, 5, 4, 6, 3, 9, 2, 3, 44, 6};
        int sum = 0;
        //Create a loop to execute till the last element in an Array
        for (int i = 0; i < number.length; i++) {
        //adding the elements in an Array
            sum += number[i];
        }
        //Printing the sum of all elements in an Array
        System.out.println("The sum of 10 no is" + sum);
    }
}
