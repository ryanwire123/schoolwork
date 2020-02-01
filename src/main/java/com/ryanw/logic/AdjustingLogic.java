package com.ryanw.logic;

public class AdjustingLogic {
  public static void main(String[] args) {
    doTheThing(55);
  }

  public static void doTheThing(int arg) {
    if (arg < 50) {
      System.out.println("we made it");

    } else {
      System.out.println("someone fucked up");
    }
  }
}
