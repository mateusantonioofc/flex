package org.rokuno.exceptions;

public class NullValueException extends RuntimeException{

    public NullValueException() {
    }

    public NullValueException(String message) {
        super(message);
    }
    
}
