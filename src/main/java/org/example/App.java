package org.example;

import java.util.Scanner;

/*
 *   UCF COP 3330 Fall 2021 Assignment 15 Solution
 *   Copyright 2021 Donovan Reynolds
 */
public class App 
{
    public static void main( String[] args )
    {
        final String password = "C_is_#one";

        String input = inputOutput("What is the password?");

        if (input.equals(password))
        {
            System.out.println("Welcome!");
        }
        else
        {
            System.out.println("I don't know you.");
        }
    }
    public static String inputOutput(String textToSay)
    {
        Scanner input = new Scanner(System.in);
        System.out.println(textToSay);
        return input.nextLine();
    }

    public static int stringToInt(String text)
    {
        return Integer.parseInt(text);
    }

    public static double stringToDouble (String text)
    {
        return Double.parseDouble(text);
    }
}
