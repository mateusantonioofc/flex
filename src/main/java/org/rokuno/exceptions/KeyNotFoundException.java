package org.rokuno.exceptions;

public class KeyNotFoundException extends RuntimeException{

    public KeyNotFoundException(String message) {
        super(message);
    }

    public KeyNotFoundException() {
    }
    
}
