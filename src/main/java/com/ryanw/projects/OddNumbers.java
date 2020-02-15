package com.ryanw.projects;

// Print out all of the odd numbers between 1 and N
public class OddNumbers {
    public static void main(String[] args) {
        int n = 69;
        for(int i = 1; i <= n; i += 2) {
          System.out.println(i);
        }
        
        for(int i = 1; i <= n; i++) {
          if (i % 2 != 0) {
            System.out.println(i);
          }
        }

        
    }
}

