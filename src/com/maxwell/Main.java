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



    }
}
