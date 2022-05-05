/* Java exception assignment for user email registration
 * RFP assignment
 * Author: sarvesh pednekar  */

package com.bridgelabz.exceptionhandling;

import java.util.Scanner;

/* Creating custom exception class which extends Exception class */
class InvalidEmailIdException extends Exception{

    /* passing constructor message to parent class */
    public InvalidEmailIdException(String message) {
        super(message);
    }
}

/* Creating TestEmailIdException class which validates email and throws exception */
public class TestEmailIdException {

    /* Creating object of validator class */
    static Validator validator = new Validator();

    // Method to check email
    public static void validateEmail(String emailId) throws InvalidEmailIdException {
        if(validator.validateEmail(emailId)) {
            System.out.println("Valid email");
        } else {
            // throw an object of user defined exception
            throw new InvalidEmailIdException("Invalid emailId entered");
        }
    }

    public static void main(String[] args) {

        // Creating scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter emailId: ");
        String emailId = scanner.nextLine();

        try {
            // calling method
            validateEmail(emailId);
        }
        catch (InvalidEmailIdException ex) {
            // printing the message from InvalidEmailIdException object
            System.out.println("Exception occured: " + ex);
        }
    }
}