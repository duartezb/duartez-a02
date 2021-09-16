/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Billy Duartez
 */

/* Program that determines how many years you have left until retirement and the year you can retire */

import java.util.*;
import java.lang.*;

public class Solution06
{
    public static void main(String[] args)
    {
        //create scanner
        Scanner in = new Scanner(System.in);

        int current_year = Calendar.getInstance().get(Calendar.YEAR);

        //get age
        System.out.print("What is your current age? ");
        int age = in.nextInt();

        //get retirement age
        System.out.print("At what age would you like to retire? ");
        int retire_age = in.nextInt();

        //years left for retirement
        int years_left = retire_age - age;
        System.out.println("You have " + years_left + " years left until you can retire.");

        //output retirement year
        //get system time via coding
        int retire_year = current_year + years_left;
        System.out.println("It's " + current_year +", so you can retire in " + retire_year + ".");

    }

}