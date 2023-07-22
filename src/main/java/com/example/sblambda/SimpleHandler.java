package com.example.sblambda;

import java.io.Serializable;

public class SimpleHandler {

    public Output handleRequest(Input input) {
        return new Output(input.getMessage().toUpperCase());
    }
    
}

class Input implements Serializable {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}

class Output implements Serializable {
    private String message;

    Output() {}

    Output(String message) {
        this.setMessage(message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}