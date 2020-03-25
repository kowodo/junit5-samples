package com.tutorialspoint;

public class HelloWorld {
    public String message;

    public void getMessage() {
        System.out.println("  " + message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void init() {
        System.out.println("init function in HelloWorld");
    }

    public void myDestroy() {
        System.out.println("myDestroy function in HelloWorld");
    }
}
