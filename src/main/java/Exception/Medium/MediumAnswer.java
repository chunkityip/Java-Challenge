package Exception.Medium;

import Exception.CustomException.CustomExceptionWithCauseAnswer;
import Exception.CustomException.InvalidAgeExceptionAnswer;
import org.apache.catalina.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Scanner;

public class MediumAnswer {

    /**
     * Custom Exception (Simple):
     * Create a custom exception called InvalidAgeException.
     * Write a program that throws this exception when a user enters an invalid age (e.g., negative age or age over 150).
     */
    public void ageInput(int age) throws InvalidAgeExceptionAnswer {
        if (age < 0 || age > 150) {
            throw new InvalidAgeExceptionAnswer("Invalid age: " + age);
        }
        System.out.println("Age is valid: " + age);
    }

    /**
     * Handling Multiple Exceptions:
     * Write a program that reads from a file, divides two integers, and then parses an integer from a string.
     * Use a single try block to handle all potential exceptions.
     */
    public void readsFile(String filePath , String numberStr) {
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            int num1 = 10;
            int num2 = 0;
            System.out.println(num1 / num2);

            int number = Integer.parseInt(numberStr);
            System.out.println("Converted number: " + number);


        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + numberStr);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
    }

    /**
     * Exception Chaining:
     * Create a custom exception class called UserServiceException that extends Exception.
     * This class should have a constructor that takes a message and a cause.
     *
     * Create another custom exception class called DatabaseException that extends Exception.
     * This class should also have a constructor that takes a message and a cause.
     *
     * Implement a UserService class that contains a method getUserById(int id):
     *
     * This method should call the findById(int id) method of a UserRepository class to fetch a user.
     * If a SQLException occurs while fetching the user, it should catch this exception and
     * throw a UserServiceException, chaining the original SQLException to it.
     * Implement a UserRepository class with a method findById(int id):
     *
     * This method should simulate a database access operation and throw a SQLException if an error occurs.
     * Ensure that any caught SQLException in this method is wrapped and rethrown to maintain the original exception as the cause.
     */
    // Custom Exception for Service Layer
    public class UserServiceException extends Exception {
        public UserServiceException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    // Service Layer
    public class UserService {
        private UserRepository userRepository = new UserRepository();

        public User getUserById(int id) throws UserServiceException {
            try {
                return userRepository.findById(id);
            } catch (SQLException e) {
                throw new UserServiceException("Failed to fetch user by id from database", e);
            }
        }
    }

    // Custom Exception for Repository Layer
    public class DatabaseException extends Exception {
        public DatabaseException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    // Repository Layer
    public class UserRepository {
        public User findById(int id) throws SQLException {
            try {
                // Code to access the database and find the user
                throw new SQLException("Database connection error");
            } catch (SQLException e) {
                throw new SQLException("Error while accessing database", e); // Exception Chaining
            }
        }
    }


    /**
     * Custom Exception with Cause:
     * Create a custom exception that accepts a cause (another exception) and demonstrate
     * how to pass the original exception as the cause for the new one.
     */
    public void exceptionWithCause() throws CustomExceptionWithCauseAnswer {
        try {
            int number = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            throw new CustomExceptionWithCauseAnswer("Failed to convert string to number", e);
        }
    }

    /**
     * Custom Exception with Cause
     *
     * Create a custom exception call UserServiceException and DatabaseException
     *
     * Implement the Repository Layer with throw:
     * 1. SQLException with "Database connection error"
     * 2. DatabaseException (Exception Chaining) with "Error retrieving user with ID: "
     *
     * Implement the Service Layer method call getUserById:
     * 1. using findById() on userRepository
     * 2. UserServiceException (Exception Chaining) with "Failed to fetch user by ID: "
     */
    public class UserServiceException extends Exception {
        public UserServiceException(String message, Throwable cause) {
            super(message, cause); // Preserves the cause
        }
    }

    public class DatabaseException extends Exception {
        public DatabaseException(String message, Throwable cause) {
            super(message, cause); // Preserves the cause
        }
    }


    public class UserRepository {
        public User findById(int id) throws SQLException {
            try {
                // Simulate a database access issue
                throw new SQLException("Database connection error");
            } catch (SQLException e) {
                throw new DatabaseException("Error retrieving user with ID: " + id, e); // Chaining SQLException
            }
        }
    }

    public class UserService {
        private UserRepository userRepository = new UserRepository();

        public User getUserById(int id) throws UserServiceException {
            try {
                return userRepository.findById(id);
            } catch (DatabaseException e) {
                throw new UserServiceException("Failed to fetch user by ID: " + id, e); // Chaining DatabaseException
            }
        }
    }

}
