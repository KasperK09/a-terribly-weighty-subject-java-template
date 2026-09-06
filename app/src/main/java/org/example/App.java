package org.example;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    System.out.println("Welcome to the Ounce Conversion Program!\n");
    System.out.println("How many ounces do you have?");

    Scanner console = new Scanner(System.in);

    //this breaks the program when you enter anything other than an integer so change it if a floating point value is needed
    int ounces = console.nextInt();

    Converter converter = new Converter();

    System.out.println("Thank you, converting ounces to pounds...");

    System.out.println(ounces + " oz is equivalent to " + converter.toPoundsAndOunces(ounces));
    System.out.println(ounces + " oz is equivalent to " + converter.toPounds(ounces));

    System.out.println("Thank you for using the OCP!");

    console.close();
  }
}
