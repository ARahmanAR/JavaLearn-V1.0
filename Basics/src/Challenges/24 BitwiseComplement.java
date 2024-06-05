package Challenges;

import java.util.Scanner;

class BitwiseComplement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Bitwise Complement");
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int result = ~num;
        System.out.println("Bitwise Complement of " + num + " is " + result);
    }
}
