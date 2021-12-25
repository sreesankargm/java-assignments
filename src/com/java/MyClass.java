package com.java;

public class MyClass {
    public MyClass() {
        System.out.println("This is the non-parameterized constructor");
    }

    public void printMessage() {
        System.out.println("This prints some message");
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        myClass.printMessage();
    }
}

