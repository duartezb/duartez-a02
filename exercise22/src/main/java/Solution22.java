/*
 *  UCF COP3330 Fall 2021 Assignment x Solution
 *  Copyright 2021 Billy Duartez
 */

/*Program that asks for three numbers. Check first to see that all numbers are different. If they’re not different,
then exit the program. Otherwise, display the largest number of the three.*/

import java.util.Scanner;

public class Solution22 {
    public static void main(String[] args) {

        //scanner
        Scanner in = new Scanner(System.in);

        //get numbers
        System.out.print("Enter first number: ");
        int a = in.nextInt();

        System.out.print("Enter second number: ");
        int b = in.nextInt();

        System.out.print("Enter third number: ");
        int c = in.nextInt();

        int largest;

        //if else statement
        //special statement if numbers equal each other exit program
        if (a == b || b == c || c==a)
        {
            return;
        }
        else if (a > b && a > c)
        {
            largest = a;
        }
        else if (b > a && b > c)
        {
            largest = b;
        }
        else {
            largest = c;
        }

        System.out.print("The largest number is "+largest);
    }
}
