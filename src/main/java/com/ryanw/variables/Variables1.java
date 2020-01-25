package com.ryanw.variables;

import java.util.Arrays;

public class Variables1 {
    public static void main(String[] args) {
        int n = 25;
        String w = "Hey";
        boolean b = false;
        double a = 7.01;
        char[] charArray = w.toCharArray();
        char ch = 'D';
        System.out.println("integer:\t" + n);
        System.out.println("string:\t\t" + w);
        System.out.println("boolean:\t" + b);
        System.out.println("double:\t\t" + a);
        System.out.println("char:\t\t" + ch);
        System.out.println("char array:\t" + Arrays.toString(charArray));

    }
}
