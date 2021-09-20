/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Billy Duartez
 */
/*Program that computes simple interest. Prompts for the principal amount, the rate as a percentage, and the time,
and display the amount accrued */

import java.util.Scanner;

import static java.lang.Math.floor;

public class Solution12 {

    public static void main(String[] args) {

        //scanner named input
        Scanner input = new Scanner(System.in);

        double prin;
        double rate;
        double rateInt;
        double total;

        //principal
        System.out.print("Enter the principal: ");
        prin = input.nextDouble();

        //rate of interest
        System.out.print("Enter the rate of interest: ");
        rateInt = input.nextDouble();

        rate = (rateInt / 100);

        //num of years
        System.out.print("Enter the amount of years: ");
        int years = input.nextInt();

        //calc interest

        total = (prin * ( 1 + (rate * years)));
        total = Math.round(total * 100.0)/ 100.0;

        //output msg
        System.out.print("After "+years+" years at "+rateInt+"%, ");
        System.out.printf("the investment will be worth $%.2f", total);


    }
}