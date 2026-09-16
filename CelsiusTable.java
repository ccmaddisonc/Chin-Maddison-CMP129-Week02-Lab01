/*
    Maddison Chin
    CMP129-80235
    Week 2, Lab Assignment 3, Problem 2
    15 September 2026
*/

import java.util.Scanner;

public class CelsiusTable {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);


        //prompt user to enter temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        double userFtemp = keyboard.nextDouble();

        //convert user fahrenheit temp
        double userCtemp = celsius(userFtemp);
        System.out.println("In Celsius that is about " + userCtemp +" degrees.\n");

        //create title of table
        System.out.println("    Fahrenheit  |   Celsius     ");
        System.out.println("_________________________________");

        //create for loop to make F to C table
        for(int f = 0; f<21; f++){
            double c = celsius(f);
            System.out.print("\n");
            System.out.printf(f + "                     %.2f", c);
        }

    }   //end of main

    public static double celsius(double fahrenheit){
        return (5.0/9.00)*(fahrenheit - 32);

    }   //end of celsius method
}   //end of class
