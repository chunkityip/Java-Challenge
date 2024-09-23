package Exception.Medium;

import Exception.CustomException.CustomExceptionWithCauseAnswer;
import Exception.CustomException.InvalidAgeExceptionAnswer;
import org.apache.catalina.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Scanner;

public class Medium {
    /**
     * Custom Exception (Simple):
     * Create a custom exception called InvalidAgeException.
     * Write a program that throws this exception when a user enters an invalid age (e.g., negative age or age over 150).
     */






    /**
     * Handling Multiple Exceptions:
     * Write a program that reads from a file, divides two integers, and then parses an integer from a string.
     * Use a single try block to handle all potential exceptions.
     */






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





    /**
     * Custom Exception with Cause:
     * Create a custom exception that accepts a cause (another exception) and demonstrate
     * how to pass the original exception as the cause for the new one.
     */



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


}
