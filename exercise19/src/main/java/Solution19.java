/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Billy Duartez
 */

/*Program to calculate the body mass index (BMI) for a person using the person’s height in inches and weight in pounds.
The program should prompt the user for weight and height*/

import java.util.Scanner;


public class Solution19 {
    public static void main(String[] args) {
        //create scanner
        Scanner in = new Scanner(System.in);

        //enter weight
        System.out.print("How much do you weight, in pounds? ");
        float weight = in.nextInt();

        //enter height
        System.out.print("What is your height, in inches? ");
        float height = in.nextInt();

        //calc BMI
        float bmi = (703*weight)/(height*height);

        //display BAC
        System.out.printf("Your BMI is %.1f\n", bmi);

        //overweight or not
        if(bmi < 18.5) {
            System.out.println("You are underweight. You should see your doctor.");
        }else if (bmi < 25) {
            System.out.println("You are within ideal weight range. ");
        }else if (bmi < 30) {
            System.out.println("You are overweight. You should see your doctor.");
        }else {
            System.out.println("You are obese and consult a doctor. ");
        }
    }
}