/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Billy Duartez
 */

/*Program to compute the value of an investment compounded over time. The program should ask for the starting amount,
the number of years to invest, the interest rate, and the number of periods per year to compound.*/

import java.util.Scanner;

public class Solution13 {

    public static void main(String[] args) {

        //scanner named input
        Scanner input = new Scanner(System.in);

        double prin;
        double rate;
        double rateInt;
        double total;

        //principal
        System.out.print("What is the principal amount? ");
        prin = input.nextDouble();

        //rate of interest
        System.out.print("What is the rate? ");
        rateInt = input.nextDouble();

        rate = (rateInt / 100);

        //num of years
        System.out.print("What is the amount of years? ");
        int years = input.nextInt();


        //num of times per year
        System.out.print("What is the number of times the interest is compounded per year? ");
        int numPerYear = input.nextInt();

        //calc interest

        total = prin * Math.pow(( 1 + (rate/numPerYear)),(numPerYear * years));
        total = Math.round(total * 100.0)/ 100.0;

        //output msg
        System.out.printf("$%.2f", prin);
        System.out.print(" invested at "+rateInt+"% for "+years+" years compounded "+numPerYear+" times per year is ");
        System.out.printf("$%.2f", total);





    }
}