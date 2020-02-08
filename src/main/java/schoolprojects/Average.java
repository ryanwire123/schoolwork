package schoolprojects;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        // read first arg x
        int x = Integer.parseInt(args[0]);

        // input
        Scanner in = new Scanner(System.in);

        // make containers for values
        String[] names = new String[x];
        int[][] numbers = new int[x][3];

        // loop x times
        for (int i = 0; i < x; i++) {
            // read line
            String n = in.nextLine();

            // break line into string array
            String[] input = n.split(" ");

            // save name
            names[i] = input[0];

            // save numbers
            numbers[i][0] = Integer.parseInt(input[1]);
            numbers[i][1] = Integer.parseInt(input[2]);
            numbers[i][2] = Integer.parseInt(input[3]);
        }

        System.out.println();

        for (int i = 0; i < x; i++) {
            // average number
            float avg = (numbers[i][0] + numbers[i][1] + numbers[i][2]) / 3;

            // output string
            System.out.printf("%s %d %d %d %.2f", names[i], numbers[i][0], numbers[i][1], numbers[i][2], avg);
            System.out.println();
        }
    }
}

