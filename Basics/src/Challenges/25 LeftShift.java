package Challenges;

import java.util.Scanner;

class LeftShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Left Shift Program");
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int result = num << 1;
        System.out.println("Result: " + result);

    }
}
