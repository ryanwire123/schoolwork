package com.ryanw.variables;

public class IntsAndStrings {
    public static void main(String[] args) {
        int a = 25;
        int b = 28;
        String c = "30";
        System.out.println(a + b);
        System.out.println(a + c);
        System.out.println(b + Integer.parseInt(c));
    }
}
