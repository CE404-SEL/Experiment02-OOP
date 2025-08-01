package edu.sharif.selab.services;

import edu.sharif.selab.models.EmailMessage;
import edu.sharif.selab.models.SmsMessage;
import edu.sharif.selab.models.TelegramMessage;

import java.util.regex.Pattern;

public class Validator{

    public static boolean validateEmailAddress(String email) {
        // Regular expression pattern for validating email addresses
        String emailRegex = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$";

        // Compile the pattern into a regex Pattern object
        Pattern pattern = Pattern.compile(emailRegex);

        // Check if the email string matches the regex pattern
        return pattern.matcher(email).matches();
    }

    
    public static boolean validatePhoneNumber(String phoneNumber) {
        // Check if the phone number is exactly 11 characters long
        if (phoneNumber.length() != 11) {
            return false; // Phone number length is not valid
        }

        // Check if the phone number contains only numeric digits
        for (char digit : phoneNumber.toCharArray()) {
            if (!Character.isDigit(digit)) {
                return false; // Phone number contains non-numeric characters
            }
        }

        // If all checks pass, return true (valid phone number)
        return true;
    }
}
