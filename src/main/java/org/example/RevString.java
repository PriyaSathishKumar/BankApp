package org.example;

import java.util.Scanner;

/**Write a program to reverse a String
* Get input from user and reverse the string using the indexing of the array*/
public class RevString {
    public static void main(String[] args) {
        //Declare the variable as empty String
        String newName="";
        //Declare the character
        char ch;
        //Getting input from the user
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String ");
        String name=s.nextLine();
        //Printing the original string
        System.out.println("The original String is  "+name);
        //Execute a for loop to the length of the string
        for (int i = 0; i < name.length(); i++) {
            //Assigning each character to the ch variable
            ch=name.charAt(i);
            //add the character into string
            newName=ch+newName;
        }
        //Printing the reverse String
        System.out.println("The Reverse String is  "+newName);

    }
}
