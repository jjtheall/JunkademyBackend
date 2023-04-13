package com.csc492;

public class AuthenticationBean {

    private String message;

    public AuthenticationBean(String message) {
        this.message = message;
    }

    //constructors, getters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message1) {
        message = message1;
    }

}
