// Java program to demonstrate if-else-if ladder
package com.conditions;

import java.util.Random;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Initializing local variable number
        long number = new Random().nextLong();

        if ((Object)number instanceof Float) {
            System.out.println("Number is float type");
        } else if (number > 100) {
            System.out.println("Number is greater then 100");
        } else if (number < 0) {
            System.out.println("Number is smaller then 0");
        } else {
            System.out.println("If-else-if finished");
        }
        
        // Printing value of a number to console
        System.out.println("Value of a number: " + number);
    }
}