package com.ryanw.projects;

import java.util.Scanner;

// 1. Keep track of a running value
// 2. Be able to add money with a command like "deposit 50"
// 3. Be able to withdraw money with a command like "withdraw 25"
// 4. Be able to print out the total money with "total"
// 5. exit the program with "exit"
public class ATM {
    public static void main(String[] args) {
      double cash = 100.00;
      Scanner scanner = new Scanner(System.in);

      while (true) {
        String input = scanner.nextLine();
  
        String[] breakdown = input.split(" ");

        if (breakdown[0].equalsIgnoreCase("exit")) {
          break;
        } 
  
        System.out.println(breakdown[0]);
        System.out.println(breakdown[1]);

        
      }
      System.out.println("closing");
    }
}
