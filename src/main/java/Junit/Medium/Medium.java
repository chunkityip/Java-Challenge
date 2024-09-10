package Junit.Medium;

import java.util.Collections;
import java.util.List;

public class Medium {

    // Sort List of Integers
    public static List<String> sortList(List<String> list) {
        Collections.sort(list);
        return list;
    }

    // Calculate Factorial
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        return (n == 0) ? 1 : n * factorial(n - 1);
    }

    // Check Palindrome
    public static boolean isPalindrome(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }

    // Divide Two Numbers with Exception Handling
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    // Find Maximum in an Array
    public static int findMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }




}
