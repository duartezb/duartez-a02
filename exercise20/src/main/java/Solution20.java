/*
 *  UCF COP3330 Fall 2021 Assignment x Solution
 *  Copyright 2021 Billy Duartez
 */
/* Tax calculator that handles multiple states and multiple counties within each state.
The program prompts the user for the order amount and the state where the order will be shipped.*/

import java.util.*;
class Solution20{

    public static void main(String[] args) {
        //create scanner
        Scanner in = new Scanner(System.in);

        //variables
        int amt;
        double tAmount = 0.0;
        double tax = 0.0;

        //get order amount
        System.out.print("What is order amount? ");
        amt = in.nextInt();

        //get state
        System.out.print("What state do you live in? ");
        String state = in.next();

        //special cases for Wisconsin state and Illinois
        if(state.equals("Wisconsin")){

            //get county
            System.out.print("What county do you live in? ");
            String county = in.next();

            //special case for Eau Claire and Dunn county

            if(county.equals("EauClaire")){

                //tax Eau Claire
                tax = (amt * 5.005)/100;
                tAmount = tax + amt;
            }
            else if (county.equals("Dunn")){

                //tax for Dunn
                tax = (amt*5.004)/100;
                tAmount = tax + amt;
            }
            else{
                tax = 0.0;
                tAmount = amt;
            }

        }
        else if(state.equals("Illinois")){
            //tax for Illinois
            tax = (amt * 8.0 )/100;
            tAmount = tax + amt;
        }
        else{
            tax = 0.0;
            tAmount = amt;
        }

        //round to nearest cent
        tax = Math.round(tax * 100.0)/ 100.0;
        tAmount = Math.round(tAmount * 100.0)/ 100.0;

        //output tax (if applicable) and total amount
        System.out.println("The tax is  $"+String.format("%.2f",tax));
        System.out.println("The total is  $"+String.format("%.2f",tAmount));
    }
}