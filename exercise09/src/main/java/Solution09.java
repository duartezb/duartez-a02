/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Billy Duartez
 */

/*Calculate gallons of paint needed to paint the ceiling of a room. Prompt for the length and width, and assume one gallon covers 350 square feet.
Display the number of gallons needed to paint the ceiling as a whole number.*/

import java.util.Scanner;

public class Solution09 {
    public static void main(String[] args) {
        //import scanner named "input"
        Scanner input = new Scanner(System.in);

        //get length
        System.out.print("What is the length? ");
        double length = input.nextDouble();

        //get width
        System.out.print("What is the width? ");
        double width = input.nextDouble();


        //calc area
        double area = length * width;

        //round gals to the nearest whole num
        double gals = Math.ceil(area / 350);

        //output msg
        System.out.print("You will need to purchase " + gals + " gallons of paint to cover "+area+ " square feet.");
    }
}
