package Challenges;

import java.util.Scanner;

class BitwiseXOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise XOR operation\n");
        System.out.print("Please Enter The First Number: ");
        int firstNumber = input.nextInt();
        System.out.print("Now, Enter The Other Number: ");
        int secondNumber = input.nextInt();

        int result = firstNumber ^ secondNumber;
        System.out.println("The Result Of Bitwise XOR Operation Is: " + result);
    }
}
