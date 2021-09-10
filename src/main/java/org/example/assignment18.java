/*
 *  UCF COP3330 Fall 2021 Assignment 18 Solution
 *  Copyright 2021 Nicholas Smarsh
 */

package org.example;
import java.util.Objects;
import java.util.Scanner;

public class assignment18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double C = 0, F = 0;

        //ask for temp type
        System.out.println("Type C to convert from Fahrenheit to Celsius\nType F to convert from Celsius to Fahrenheit");
        String tempChoice = scan.nextLine();

        //ask for temp in f or c (depends on initial choice)
        boolean choice = Objects.equals(tempChoice, "c") || Objects.equals(tempChoice, "C");
        String tempQuestion = choice ? "Please enter temp in Fahrenheit" : "Please enter temp in Celsius";
        System.out.println(tempQuestion);

        if (choice) {
             F = scan.nextInt();
        }
        if (Objects.equals(tempChoice,"f") || Objects.equals(tempChoice,"F")) {
             C = scan.nextInt();
        }

        double tempFormula = choice ? (F - 32) * 5 / 9 : (C * 9 / 5) + 32;

        //print out the new temp
        String output = choice ? "The temp in Celsius is " + tempFormula : "The temp in Fahrenheit is " + tempFormula;
        System.out.println(output);
    }
}
