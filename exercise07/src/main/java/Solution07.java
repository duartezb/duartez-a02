/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Billy Duartez
 */

/*Program that calculates the area of a room. Prompt the user for the length and width of the room in feet.
Then display the area in both square feet and square meters.*/

import java.util.Scanner;

public class Solution07 {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        int length = in.nextInt();
        System.out.print("What is the width of the room in feet? ");
        int width = in.nextInt();
        System.out.println("You entered dimension of " + length + " by " + width + " feet");

        int area = length * width;
        double conversionFactor = area * 0.09290304;

        System.out.println("The area is");
        System.out.println(area + " square feet");
        System.out.printf("%.3f square meters", conversionFactor);
    }
}

