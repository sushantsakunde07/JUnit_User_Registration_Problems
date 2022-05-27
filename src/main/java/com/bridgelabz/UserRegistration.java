package com.bridgelabz;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public boolean firstName(String firstName){
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}+$");
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    public boolean lastName(String lastName){
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}+$");
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }
}