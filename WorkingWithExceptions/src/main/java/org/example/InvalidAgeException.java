package org.example;

public class InvalidAgeException extends Exception{
    InvalidAgeException(){
        super();
    }

    InvalidAgeException(String message){
        super(message);
    }

    InvalidAgeException(Exception e){
        super(e);
    }
}
