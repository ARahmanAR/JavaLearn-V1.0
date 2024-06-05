package Challenges;

import java.util.Scanner;

class Grading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Grading System\n");
        System.out.print("Please Enter Your Percentage: ");
        float percentage = input.nextFloat();

        if(percentage >= 90){
            System.out.println("Great,You have got A");
        }
        else if(percentage >= 75){
            System.out.println("Good, You have got B");
        }
        else if(percentage >= 60){
            System.out.println("You have got C");
        }
        else if (percentage >= 30){
            System.out.println("You have got D, You seriously need to work hard");
        }
        else {
            System.out.println("You have got F, You have failed");
        }
    }
}
