package com.maxwell;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Input declaration
        Scanner userInput = new Scanner(System.in);

        // Welcome and purpose texts
        System.out.println("Welcome to the Java Conversion Calculator!");
        System.out.println("This program converts Freedom units to non-freedom units(feet to meters)");

        //Prompts and input
        System.out.print("Enter number for feet: ");
        double feet = userInput.nextDouble();
        double numberInMeters = convertFeetToMeters(feet);


    }

    public static double convertFeetToMeters(double numberInFeet){
        //Take numberInFeet / 3.2808

        double numberInMeters = numberInFeet / 3.2808;

        //Return
        return numberInMeters;
    }
}
