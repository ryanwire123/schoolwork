package com.ryanw.logic;

public class ElseIf {
  public static void main(String[] args) {
    // checkTheElse(10);
    switchNotation(1);
  }

  public static void switchNotation(int arg) {
    // switch case break
    switch (arg) {
    case 1:
      System.out.println("you passed in 1");
      break;
    default:
      System.out.println("you did not pass in 1");
      break;
    }
  }

  public static void checkTheElse(int arg) {
    if (arg < 10) {
      System.out.println("lt 10");

    } else if (arg > 10) {
      System.out.println("bigger than 10");
    } else if (arg == 10) {
      System.out.println("is 10");
    }

  }
}
