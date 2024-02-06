package org.example;

public class EmptyStringException extends Exception{
    //No args
    public EmptyStringException(){

        super();
    }
    //Message
    public EmptyStringException(String message){

        super(message);
    }
    //Exception
    public EmptyStringException(Exception e){

        super(e);
    }
}
