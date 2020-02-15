package com.ryanw.projects;

import java.util.Arrays;
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
            System.out.print("enter command: ");
            String input = scanner.nextLine();
            String[] breakdown = input.split(" ");
            System.out.println(Arrays.toString(breakdown));

            if (breakdown[0].equalsIgnoreCase("deposit")) {
                //int deposit = scanner.nextInt();
                int deposit = Integer.parseInt(breakdown[1]);
                cash = cash + deposit;
                System.out.println("Your deposit of " + deposit + " has been accepted");
            } else if (breakdown[0].equalsIgnoreCase("withdraw")) {
                //int withdraw = scanner.nextInt();
                int withdraw = Integer.parseInt(breakdown[1]);
                if (cash >= withdraw) {
                    cash = cash - withdraw;
                    System.out.println("You withdrew " + withdraw);
                } else {
                    System.out.println("Insufficient Funds");
                }

            } else if (breakdown[0].equalsIgnoreCase("Total")) {
                System.out.println("Your Total is " + cash);

            } else if (breakdown[0].equalsIgnoreCase("exit")) {
                break;
            }
        }
        System.out.println("closing");
    }
}

