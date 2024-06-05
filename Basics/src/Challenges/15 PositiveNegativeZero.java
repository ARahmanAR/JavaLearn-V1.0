package Challenges;

import java.util.Scanner;

class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Number Checker");
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if(number > 0){
            System.out.println("The number is positive");
        }
        else if(number == 0){
            System.out.println("The number is zero");
        }
        else{
            System.out.println("The number is negative");
        }
    }

}
