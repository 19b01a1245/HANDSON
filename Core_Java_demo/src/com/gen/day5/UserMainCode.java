package com.gen.day5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class UserMainCode {
    public static int validatePAN(String panNumber) {
        
        String regex = "^[A-Z]{3}[0-9]{4}[A-Z]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(panNumber);

        if (matcher.matches()) {
            return 1; // Valid PAN number
        } else {
            return 2; // Invalid PAN number
        }
    }


    public static void main(String[] args) {
        String panNumber1 = "ALD3245E";
        String panNumber2 = "OLE124F";

        int result1 = UserMainCode.validatePAN(panNumber1);
        int result2 = UserMainCode.validatePAN(panNumber2);

        if (result1 == 1) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

        if (result2 == 1) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
