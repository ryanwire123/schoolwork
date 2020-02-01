package com.ryanw.logic;

public class SimpleIf {
    public static void main(String[] args) {
        int a = 27;

        // >
        // <
        // <=
        // >=
        // ==
        if (a < 50) {
            // System.out.println("we made it");

        } else {
            // System.out.println("someone fucked up");
        }

        String chico = "chico";
        String nameToCheck = "ChIcO";
        String lowerCaseNameToCheck = nameToCheck.toLowerCase();

        if (lowerCaseNameToCheck.equals(nameToCheck)) {
            System.out.println("this is my son");
            System.out.println(chico + " = " + nameToCheck.toLowerCase());


        } else {
            System.out.println("this is not my son");
        }
    }
}
