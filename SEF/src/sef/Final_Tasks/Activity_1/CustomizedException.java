package sef.Final_Tasks.Activity_1;

public class CustomizedException extends Exception{
    @Override
    public String getMessage() {
        return "No numbers allowed in Persons name and/or surname";
    }
}
