package com.ryanw.variables;

public class ValueSwapping2 {
    public static void main(String[] args) {
        int a = 15;
        int b = 37;
        b = a - b;
        a = a - b;
        b = b + a;


        System.out.println("a equals " + a);
        System.out.println("b equals " + b);

    }
}
