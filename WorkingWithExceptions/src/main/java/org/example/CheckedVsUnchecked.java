package org.example;

public class CheckedVsUnchecked {
    public static void validateString(String checkMe) throws EmptyStringException{
        if(checkMe.isEmpty()){
            throw new EmptyStringException("Give me something to validate");
        }
    }
}
