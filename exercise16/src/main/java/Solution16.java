/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Billy Duartez
 */

/*Program asks the user for their age and compare it to the legal driving age of sixteen.
If the user is sixteen or older, then the program should display 'You are old enough to legally drive.' If the user is
 under sixteen, the program should display 'You are not old enough to legally drive.'*/

import java.util.*;

public class Solution16 {
    public static void main(String[] args) {

        //create scanner
        Scanner in = new Scanner(System.in);

        //get age
        System.out.print("What is your age? ");
        int age = in.nextInt();

        //if else statement
        if(age < 16){
            System.out.print("You are not old enough to legally drive. ");
        }

        else{
            System.out.print("You are old enough to legally drive. ");
        }
    }
}