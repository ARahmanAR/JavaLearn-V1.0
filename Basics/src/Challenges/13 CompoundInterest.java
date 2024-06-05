package Challenges;

import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount BDT: ");
        double principal = sc.nextDouble();
        System.out.print("Enter the rate of interest BDT: ");
        double rate = sc.nextDouble();
        System.out.print("Enter the time period: ");
        double time = sc.nextDouble();


        double compoundInterest = principal * Math.pow((1 + rate / 100),time);

        System.out.println("\n");

        System.out.println("The compound interest of the principal amount " + principal + " BDT with rate of interest " + rate + " BDT and time period " + time + " years is: " + compoundInterest + " BDT");
    }
}
