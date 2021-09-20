/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Billy Duartez
 */

/*Simple program to compute the tax on an order amount. The program should prompt for the order amount and the state.
If the state is WI then the order must be charged 5.5% tax. The program should display the subtotal, tax, and total
for Wisconsin residents but display just the total for non-residents.*/

import java.util.*;


public class Solution14 {
    public static void main(String[] args) {
        //create scanner
        Scanner in = new Scanner(System.in);

        //ask order amt
        System.out.print("What is the order amount? ");
        double amt = in.nextDouble();

        //ask state
        System.out.print("What is the state? ");
        String state = in.next();

        //special case WI
        if(state.equals("WI")){

            //calc tax
            double tax = amt * .055;
            double tot = amt + tax;
            tot = Math.round(tot * 100.0)/ 100.0;

            System.out.printf("The subtotal is $%.2f.", amt);
            System.out.printf("%nThe tax is $%.2f.", tax);
            System.out.printf("%nThe total is $%.2f.", tot);
            return;


        }

        //display total if any other state is chosen

        //round to nearest cent
        amt = Math.round(amt * 100.0)/ 100.0;

        System.out.printf("The total is $%.2f", amt);
    }
}