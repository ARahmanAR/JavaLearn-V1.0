package Lectures;

import java.util.Scanner;

public class RelationsionalOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Drivig License Portal");
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible for driving license");
        } else {
            System.out.println("You are not eligible for driving license");
        }
    }
}
