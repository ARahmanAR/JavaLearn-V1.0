package Challenges;

import java.util.Scanner;

class FloatMultiplication {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = Input.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = Input.nextDouble();


        double mul = num1 * num2;
        System.out.println("\n");
        System.out.println("The multiplication of " + num1 + " and " + num2 + " is: " + mul);

    }
}
