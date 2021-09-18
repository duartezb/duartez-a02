/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Billy Duartez
 */
/* Program is a simple self-checkout system. Prompts the prices and quantities of three items. Calculates the subtotal of the items.
Then calculate the tax using a tax rate of 5.5%. Print out the line items with the quantity and total, and then print out the subtotal, tax amount, and total.*/

import java.util.Scanner;

public class Solution10 {
    public static void main(String[] args) {

        //prompt intro message
        Scanner input = new Scanner(System.in);

        //variables
        float item1, qty1, item2, qty2, item3, qty3, sub, tax, total;

        //enter item 1 and quantity
        System.out.print("Enter the price of item 1: $");
        item1 = (float) input.nextDouble();
        System.out.print("Enter the quantity of item 1: ");
        qty1 = (float) input.nextDouble();

        //enter item 2 and quantity
        System.out.print("Enter the price of item 2: $");
        item2 = (float) input.nextDouble();
        System.out.print("Enter the quantity of item 2: ");
        qty2 = (float) input.nextDouble();

        //enter item 3 and quantity
        System.out.print("Enter the price of item 3: $");
        item3 = (float) input.nextDouble();
        System.out.print("Enter the quantity of item 3: ");
        qty3 = (float) input.nextDouble();

        sub = (item1 * qty1) + (item2 * qty2) + (item3 * qty3);

        //calc subtotal
        System.out.println("Subtotal: $" + String.format("%.2f",sub));

        tax = (float) (sub * (.055));
        //calc taxes
        System.out.println("Taxes: $" + String.format("%.2f", tax));

        total = sub + tax;
        //print out total amount of all items altogether
        System.out.println("Total: $" + String.format("%.2f",total));
    }
}