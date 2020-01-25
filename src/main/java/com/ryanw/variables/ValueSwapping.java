package com.ryanw.variables;

public class ValueSwapping {
    public static void main(String[] args) {
        int a = 15;
        int b = 37;
        int c = a;
        a = b;
        b = c;

        System.out.println("a equals " + a);
        System.out.println("b equals " + b);

    }
}
