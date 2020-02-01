package com.ryanw.logic;

public class CombiningBooleans {
    public static void main(String[] args) {
      doTheThing(1);
    }

    public static void doTheThing(int arg) {
      // && ||
    if ((arg == 1 || arg == 2) || arg > 10) {
      System.out.println("made it");

    } else {
      System.out.println("not where we want to be");
    }
  }
}
