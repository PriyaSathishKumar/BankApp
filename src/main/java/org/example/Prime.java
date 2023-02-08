package org.example;

//Write the Program to find prime nos from 0 to 100
/**Assign the range value in numRange and then declare count variable for next value
 *  Start a for loop to execute till the range.
 *  store the temporary value.then check the condition it divide only 1 and the same value
 * then it print only prime nos. */
//Declare class
public class Prime {
    //Declare Main Method
    public static void main(String[] args) {
        //Assigning the range
        int numRange = 100, count;
        //Create a loop for execute till the range
        for (int i = 1; i <= numRange; i++) {
            //assigning temporary value
            count = 0;
            //Create a Loop and check the Prime no.
            for (int j = 2; j <= i / 2; j++) {
                //These statements are used to check whether i and j gives remainder as 0  or not.
                // If the remainder comes as zero, count gets incremented by one
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
         //checks whether count is equal to zero or not. If zero, then prints the value of i.
            if (count == 0)
                System.out.println(i);
        }
    }
}
