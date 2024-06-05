package Challenges;

import java.util.Scanner;

class OddEvenBitwise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Odd Even Bitwise Program");
        System.out.print("Enter a number to check if it is odd or even: ");
        int num = scanner.nextInt();

        if((num & 1) == 1) {
            System.out.println(num + " is an odd number");
        } else {
            System.out.println(num + " is an even number");
        }
    }
}
