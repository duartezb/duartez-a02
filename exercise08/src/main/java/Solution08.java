/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Billy Duartez
 */

/*
Program evenly divide pizzas. Prompts for the number of people, the number of pizzas, and the number of slices per pizza.
Ensure that the number of pieces comes out even.
Displays the number of pieces of pizza each person should get.
If there are leftovers, show the number of leftover pieces.
 */

import java.util.Scanner;

public class Solution08 {
    public static void main(String[] args) {
        //scanner
        Scanner in =new Scanner(System.in);

        //ask how many ppl
        System.out.print("How many people? ");
        int ppl =in.nextInt();

        //ask how many pizzas
        System.out.print("How many pizzas do you have? ");
        int pizzas=in.nextInt();

        //ask how many slices per pizza
        System.out.print("How many slices of pizza? ");
        int slices=in.nextInt();

        //calc total of slices
        int total = pizzas * slices;

        //display total
        System.out.println(ppl+" people with "+pizzas+" pizzas ("+total+" slices)");

        //calc quotient
        int quot=total/ppl;

        //display portions each person gets
        System.out.println("Each person gets "+quot+" pieces of pizza");

        //calc remainder
        int rem = total % ppl;

        //display msg of remaining slices
        System.out.println("There are "+rem +" leftover pieces");
    }

}