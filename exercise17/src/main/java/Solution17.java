/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Billy Duartez
 */

/* Program that prompts for your weight, gender, total alcohol consumed (in ounces),
and the amount of time since your last drink. Calculate your blood alcohol content (BAC) using this formula*/

import java.util.*;


public class Solution17 {
    public static void main(String[] args) {

        //variables
        int a;
        int w;
        int h;
        int g;
        float r;
        double bac;

        //scanner
        Scanner in = new Scanner(System.in);

        //get gender
        System.out.print("Enter a 1 if you are male or a 2 if you are female: ");
        g = in.nextInt();

        //get ounces
        System.out.print("How many ounces of alcohol did you have ? ");
        a = in.nextInt();

        //get weight
        System.out.print("What is your weight, in pounds? ");
        w = in.nextInt();

        //get hours since last drink
        System.out.print("How many hours has it been since your last drink? ");
        h = in.nextInt();

        in.close();

        //if else statement
        if (g == 1) {
            r = (float) 0.73;
        }
        else{
            r = (float) 0.66;
        }

        //calc BAC
        bac = (a * 5.14 / w * r) - (0.015 * h);

        //display BAC
        System.out.printf("\nYour BAC is %.6f \n", bac);

        //second if else for sobriety
        if (bac < 0.08) {
            System.out.println("It is legal for you to drive.");
        }
        else{
            System.out.println("It is not legal for you to drive.");
        }
    }
}