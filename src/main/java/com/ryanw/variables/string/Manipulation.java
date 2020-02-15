package com.ryanw.variables.string;

public class Manipulation {
  public static void main(String[] args) {
      String name = "Aaron";
      String fullName = "Ryan Wire";
      String uselessChars = "         helloooo     ";
      
      
      System.out.println(uselessChars.trim());

      System.out.println(name.substring(1));
      System.out.println(name.substring(2, 3));

      System.out.println(fullName.indexOf(" "));
      
      System.out.println(fullName.substring(fullName.indexOf(" ") + 1));

      String chico = fullName.replace("Ryan", "Chico");

      System.out.println(chico);
      
      if (fullName.endsWith("Wire")) {
        System.out.println("There is a wire");
      }

      if (fullName.startsWith("Ryan")) {
        System.out.println("There is a ryan");
      }
      
      if (fullName.contains("an Wi")) {
        System.out.println("has the text");
      }
  }
}
