package Challenges;

import java.util.Scanner;

class Perimeter {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("please, enter all the sides of the rectangle in cm: ");
        double side1 = Input.nextDouble();
        double side2 = Input.nextDouble();
        double side3 = Input.nextDouble();
        double side4 = Input.nextDouble();

        double perimeter = side1 + side2 + side3 + side4;
        System.out.println("\n");
        System.out.println("The perimeter of the rectangle is: " + perimeter + " cm");

    }
}
