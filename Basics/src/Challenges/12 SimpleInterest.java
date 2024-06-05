package Challenges;

import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the principal amount BDT: ");
        double principal = Input.nextDouble();
        System.out.print("Enter the rate of interest BDT: ");
        double rate = Input.nextDouble();
        System.out.print("Enter the time period: ");
        double time = Input.nextDouble();

        double interest = (principal * rate * time) / 100;
        System.out.println("\n");

        System.out.println("The simple interest of the principal amount " + principal + " BDT with rate of interest " + rate + " BDT and time period " + time + " years is: " + interest + " BDT");
    }
}
