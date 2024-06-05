package Challenges;

import java.util.Scanner;

class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd-Even Checker");
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if(num % 2 == 0){
            System.out.println("You number is even");
        }
        else {
            System.out.println("You number is odd");
        }
    }
}
