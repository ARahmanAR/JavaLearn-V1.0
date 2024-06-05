package Lectures;

import java.util.Scanner;

public class LearningIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isMale ;
        System.out.print("Are you male: ");
        isMale = scanner.nextBoolean();
        String name = "John";
        String name2 = "Jane";
        System.out.println("Good Morning");

        if (isMale) {
            System.out.println("Hello, Mr. " + name);
        } else if (!isMale) {
            System.out.println("Hello, Mr. " + name2);
        } else {
            System.out.println("Hello, Ms. " + name2);

        }
    }
}
