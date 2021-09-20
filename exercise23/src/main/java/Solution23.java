/*
 *  UCF COP3330 Fall 2021 Assignment x Solution
 *  Copyright 2021 Billy Duartez
 */
/*Program that walks the user through troubleshooting issues with a car.
Use the following decision tree to build the system*/

import java.util.Scanner;

public class Solution23 {

    public static void main(String[] args) {

        //scanner
        Scanner input = new Scanner(System.in);

        //prompt message
        System.out.print("Is the car silent when you turn the key? ");
        String ans1 = input.nextLine();

        if (ans1.equals("Y")||ans1.equals("y")){
            System.out.print("Are the battery terminals corroded? ");
            String ans2 = input.nextLine();
            if ( ans2.equals("Y")||ans2.equals("y")){
                System.out.print("Clean the terminals and try starting again.");
            }
             else{
                System.out.print("Replace cables and try again.");
            }
        }

        else{
            System.out.print("Does the car make a clicking noise? ");
            String ans3 = input.nextLine();
            if (ans3.equals("Y")||ans3.equals("y")){
                System.out.print("Replace the battery.");
            }
        else{
                System.out.print("Does the car crank up but fail to start? ");
                String ans4 = input.nextLine();
                if ( ans4.equals("Y")||ans4.equals("y")){
                    System.out.print("Check the spark plug connections.");
                }
                else{
                    System.out.print("Does the engine start and then die? ");
                    String ans5 = input.nextLine();
                    if ( ans5.equals("Y")||ans5.equals("y")){
                        System.out.print("Does it have fuel injection? ");
                        String ans6 = input.nextLine();
                        if ( ans6.equals("Y")||ans6.equals("y")){
                            System.out.print("Get in for service. ");
                        }
                        else{
                            System.out.print("Check to ensure the choke is opening and closing");
                        }
                    }
                    else{
                        System.out.print("Get it in for service.");
                    }
                }

            }
        }
    }
}