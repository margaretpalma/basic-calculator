package com.pluralsight;

import java.util.Scanner;.java.util.Scanner;  //importing the scanner class from java package, to read input from the keyboard

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in)  //scanner reads from the keyboard

        System.out.println("Enter the first number: ");  //asking for first number
        double firstNumber = scanner.nextDouble();     //asking for two floating point numbers so you use a double

        System.out.println("Enter the second number: "); //asking for second number
        double secondNumber = scanner.nextDouble();

        System.out.println("Choose one: Addition, Subtraction, Multiplication, or Division? ");
        String operation = scanner.next()  //string operation is whatever you type goes into a variable named operation
                //String because the words are strings not numbers

        double result = firstNumber * secondNumber;


    }
}
