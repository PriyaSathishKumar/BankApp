package org.example;
//import lombak.*;
//@allArgsConstructor


public class Sample {
        public static void main(String[] args) {
        /*System.out.println("Program for Printing Even nos From 0 to 100");
        for (int i = 0; i <=100 ; i++) {
        if(i%2==0)
          System.out.println(i);
      }*/
        /*System.out.println("Program for Printing Multiples of 6 From 0 to 100");
        for (int i = 0; i <=100 ; i++) {
        if(i%6==0)
        System.out.println(i);
        }*/
            double[] a = {9, 11, 22, 33, 44, 55, 66, 77, 88, 99};
            double avg = 0.0;
            double min = 0;
            double max = 0;
            double average = avg(a);
            double minVal = minfunc(a, min);
            double maxVal = maxfunc(a, max);
        }


    public static double maxfunc(double[] a,double max) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
            System.out.println("Maximum Value is" + max);
        return max;
}

    public static double minfunc(double[] a,double min) {
            min=a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
                System.out.println("Minimum Value is" + min);
        return min;
        }

    public static double avg(double[] a) {
            double avg=0.0;
            System.out.println("Program For Finding Average");
            for (int i = 0; i <= 9; i++) {
                avg += a[i];
            }
            System.out.println("The Sum is  " + avg);
            System.out.println("The average of above no is  " + avg / 10);
             return avg;
        }
    }


