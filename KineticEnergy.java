/*
    Maddison Chin
    CMP129-80235
    Week 2, Lab Assignment 3, Problem 1
    15 September 2026
*/

import java.util.Scanner;

public class KineticEnergy {
    public static void main(String[] args){

        //declare variables
        double m;
        double v;
        
        Scanner input = new Scanner(System.in);

        //prompt user to enter value for mass
        System.out.print("Enter value for mass (in kilograms): ");
        m = input.nextDouble();

        //prompt user to enter value for velocity
        System.out.print("Enter value for velocity (in meters per second): ");
        v = input.nextDouble();
        
        //call on kineticEnergy method
        double result = kineticEnergy(m, v);
        
        //display kinetic energy to user
        System.out.printf("\nYour object's Kinetic Energy is %.2f", result);

    }   //end of main method


    public static double kineticEnergy(double m, double v){

        //declare variables
        double KE;

        //calculate object's kinetic energy
        KE = (0.5)*(m)*Math.pow((v), 2);
        return KE;

    }   //end of kineticEnegy
}   //end of class
