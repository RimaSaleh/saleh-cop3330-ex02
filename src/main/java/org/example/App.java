/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rima Saleh
 */

package org.example;

//import statement for scanner
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        //scanner used to read data inputted
        Scanner scanner = new Scanner(System.in);

        //print statement asking for string to be inputted
        System.out.println("What is the input string? ");

        //string will be inputted and stored as "message"
        String message = scanner.nextLine();

        //the length of string will be counted and stored as "stringLength"
        int stringLength = message.length();

        //output displaying string count
        System.out.format("%s has %d characters", message, stringLength);


    }
}