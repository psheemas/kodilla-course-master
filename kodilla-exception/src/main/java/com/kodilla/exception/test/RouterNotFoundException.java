package com.kodilla.exception.test;

public class RouterNotFoundException extends Exception{
    public RouterNotFoundException(final String message){
        super(message);
    }
}
