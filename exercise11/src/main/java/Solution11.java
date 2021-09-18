/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Billy Duartez
 */

/*Program that convert euros to U.S. dollars. Prompts for the amount of money in euros you have,
and prompt for the current exchange rate of the euro. Prints out the new amount in U.S. dollars.*/

import java.util.Scanner;

    public class Solution11 {

        public static void main(String[] args) {

            //scanner
            Scanner input = new Scanner(System.in);

            //ask amount of euros
            System.out.print("How many euros are you exchanging? ");
            int c_frame = input.nextInt();

            //ask exchange rate
            System.out.print("What is the exchange rate? ");
            double rate = input.nextDouble();

            //calc dollar
            //euros * exchange rate = dollars

            double c_to = Math.ceil(c_frame * rate * 100)/ 100;

            //output msg
            System.out.println(c_frame +" euros at an exchange rate of "+ rate +" is " + String.format("%.2f",c_to)+" U.S. dollars.");


        }
    }