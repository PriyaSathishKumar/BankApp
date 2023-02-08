package org.example;
/**Write a program to reverse the number
* Declare and assigning the value to the number
* While loop for the till number is greater than 0
*  using modulus operator to get remainder and store the value
* to divide the number go into the while loop for check till the last number
* */
public class RevNumber {
    public static void main(String[] args) {
        //Declare and assigning the value to the number variable
        int number=12345;
        //Declare and assigning the value to the temporary variable
        int temp=0;
        //Declare and assigning the value to the reversenum variable
        int reverseNum=0;
        //execute while loop till the number greater than 0
        while(number>0)
        {
            //getting remainder using Modulus operator
            temp=number%10;
            //Multiply by 10 with the value of temp
            reverseNum=reverseNum*10+temp;
            //to check nest to the last digit using Divider operator
            number=number/10;
        }
        //When the loop exit it will print reverse number
        System.out.println("The Reverse no is"+reverseNum);
    }
}
