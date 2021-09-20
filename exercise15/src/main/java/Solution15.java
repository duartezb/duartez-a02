/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Billy Duartez
 */

/*Simple program that validates user login credentials. The program must prompt the user for a username and password
The program should compare the password given by the user to a known password. If the password matches, the program
 should display 'Welcome!' If it does not match, the program should display 'I don’t know you.' */
import java.util.*;

public class Solution15 {
    public static void main(String[] args) {

        //create scanner
        Scanner in = new Scanner(System.in);

        //get password
        System.out.print("What is the password? ");
        String pass = in.next();

        //if else statement
        if(pass.equals("abc$123")){
            System.out.print("Welcome!");
        }

        else{
        System.out.print("I don't know you.");
        }
    }
}