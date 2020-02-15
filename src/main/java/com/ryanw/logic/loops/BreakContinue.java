package com.ryanw.logic.loops;

public class BreakContinue {
    public static void main(String[] args) {
      int i = 10;
      while (true) {
        i--;
        System.out.println("countdown till termination " + i);
        
        if (i == 0) {
          // terminates the loop
          break;
        } else if (i % 2 == 0) {
          // starts the loop again 
          continue;
        }
        
        System.out.println("LOOPING");
      }
    }
}
