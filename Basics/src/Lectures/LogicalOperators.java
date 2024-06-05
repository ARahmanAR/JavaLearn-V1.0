package Lectures;

import java.util.Scanner;

class LogicalOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Ticketing System");
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Are you a student? (yes/no)");
        String student = scanner.next();
        System.out.println("Are you female? (yes/no");
        String female = scanner.next();

        if (age >= 18 && student.equals("yes")) {
            System.out.println("You got 25% student discount");
        }

        else if (age >= 18 && student.equals("no") && female.equals("yes")) {
            System.out.println("You got 20% discount");
        }
        else if (age>= 18 && student.equals("yes") && female.equals("yes")) {
            System.out.println("You got 45% discount");
        }

        else if (age >= 18 && student.equals("no")) {
            System.out.println("You are not eligible for student discount");
        }
        else {
            System.out.println("You are not eligible for student discount");
        }

    }
}
