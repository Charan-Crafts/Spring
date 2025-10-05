package com.spring;

public class FirstBean {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "FirstBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
