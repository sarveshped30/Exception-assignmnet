package com.bridgelabz.exceptionhandling;

import java.util.regex.Pattern;

public class Validator {
    /* Creating and initializing pattern for EmailId */
    private static final String EMAIL_PATTERN = "^[a-z0-9]+([._-][a-z0-9]+)+@([a-z])+[.][a-z]{3}+[.][a-z]{2,3}$";

    /* Validating email with pattern */
    public boolean validateEmail(String emailId) {
        boolean result = Pattern.matches(EMAIL_PATTERN , emailId);
        return result;
    }
}
