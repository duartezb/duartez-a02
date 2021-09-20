/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Billy Duartez
 */

/**/

import java.util.Scanner;

public class Solution18 {
    public static void main(String[] args) {

        //create scanner
        Scanner in = new Scanner(System.in);


        //output message
        System.out.print("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.\n");
        String choice = in.nextLine();

        System.out.println("Your choice: " + choice);

        //if else statement
        if (choice.equals("F")||choice.equals("f")) {
            //calc celsius to Fahrenheit
            System.out.print("Please enter the temperature in Celsius: ");
            int c = in.nextInt();
            int f = (c * 9 / 5)+32;
            System.out.print("The temperature in Fahrenheit is "+ f);
        }
        else{
            //calc Fahrenheit to celsius
            System.out.print("Please enter the temperature in Fahrenheit: ");
            int f = in.nextInt();
            int c = (f-32) * 5 / 9 ;
            System.out.print("The temperature in Celsius is "+ c);
        }

    }
}