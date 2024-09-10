package Junit.Easy;

public class Easy {
    /**
     * Test String Utility:
     * Write a JUnit test to check if the StringUtils.capitalize()
     * method correctly capitalizes the first letter of a given string
     * (e.g., "hello" → "Hello").
     */

        public static String capitalize(String input) {
            if (input == null || input.isEmpty()) {
                return input;
            }
            return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
        }


    /**
     * Calculator Addition: Write a JUnit test for a
     * simple calculator class method add(int a, int b)
     * that returns the sum of two integers.
     */
        public static int add(int a, int b) {
            return a + b;
        }


    // Check Even Number
        public static boolean isEven(int number) {
            return number % 2 == 0;
        }


    // Reverse a String
        public static String reverse(String input) {
            if (input == null) {
                return null;
            }
            return new StringBuilder(input).reverse().toString();
        }


    // Multiply Two Numbers
    public static int multiply(int a, int b) {
        return a * b;
    }





}
