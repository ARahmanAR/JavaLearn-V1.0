package Challenges;

import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        double base = Input.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = Input.nextDouble();

        double area = 0.5 * base * height;
        System.out.println("\n");
        System.out.println("The area of the triangle with base " + base + " and height " + height + " is: " + area);

    }
}
