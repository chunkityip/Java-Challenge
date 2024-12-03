package Exception.Easy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Easy {
    /**
     * Simple Arithmetic Exception:
     * Create a program that takes two integers as input and performs division.
     * Handle the case where division by zero occurs.
     */

    public void division(int num1 , int num2) {
        try {
            System.out.println(num1 / num2);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed");
        }
    }

    /**
     * NullPointerException Handling:
     * Write a program that attempts to call a method on a null object
     * reference and handle the resulting NullPointerException
     */
    public void nullPointerHandling(String object) {
        try {
            System.out.println(object + " is good");
        } catch (NullPointerException e) {
            System.out.println(object + " is not good");
        }
    }

    /**
     * Array Index Out of Bounds:
     * Create a program that attempts to access an invalid index in an array,
     * then handle the resulting exception.
     */
    public void handArray(int[] num) {
        try {
            System.out.println(num[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }
    }


    /**
     * File Not Found Exception:
     * Write a program that tries to read from a file that doesn't exist.
     * Catch and handle the FileNotFoundException.
     */
    public void readFile() {

    }



    /**
     * Number Format Exception:
     * Create a program that reads a string input and tries to convert it to an integer.
     * Handle the NumberFormatException when invalid input is provided.
     */
    public void numberInput(String object) {

    }

}


