package org.example;

import java.util.Scanner;
import java.lang.String;
/**Write a program to check Whether given character is vowel or not
* Get a character from user
* Check the character is a,e,i,o,u And A,E,I,O,U*/

public class CheckVowel {
    public static void main(String[] args) {
//      Getting a Input as a Char from the user
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the letter ");
        //Declare ch variable
        char ch=s.next().charAt(0);
        //Check the char with Small letter and Capital letter a,e,i,o,u
        if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')||(ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U'))
        {
            //if condition is true it print the character is vowel
            System.out.println("The Character is Vowel");
        }
        else
        {
            //if condition false it print the character is not vowel
            System.out.println("The Character is not Vowel");
        }
    }
}
