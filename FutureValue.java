/*
    Maddison Chin
    CMP129-80235
    Week 2, Lab Assignment 3, Problem 3
    15 September 2026
*/

import java.util.Scanner;

public class FutureValue {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //declare variables

        //create title
        System.out.println("Future Value");
        System.out.println("_______________");

        //prompt user to enter present value
        System.out.print("Enter the account's present value: ");
        double P = input.nextDouble();

        //prompt user to enter monthly interest
        System.out.print("Enter the monthly interest rate: ");
        double i = input.nextDouble();
        i = i/100;

        //prompt user to enter months money will be in the account
        System.out.print("Enter the number of months the money will be left in the account: ");
        double t = input.nextDouble();

        //call on futureValue method
        double result = futureValue(P, i, t);

        //display future value to user
        System.out.printf("Future Value: $%.2f", result);

    }   //end of main

    public static double futureValue(double P, double i, double t){
        
        //calculate future value of the account
        double F = P * Math.pow((1+i), t);
        return F;


    }   //end of futureValue method
}   //end of class
