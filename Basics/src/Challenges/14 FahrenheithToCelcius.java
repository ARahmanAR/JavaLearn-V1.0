package Challenges;

import java.util.Scanner;

class FahrenheithToCelcius {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheith: ");
        double fahrenheith = Input.nextDouble();

        double celcius = (fahrenheith - 32) * 5/9;
        System.out.println("\n");
        System.out.println("The temperature in Celcius is: " + celcius);
    }
}
