package Challenges;

import java.util.Scanner;

class BitwiseAnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Showcasing Bitwise AND operation\n");
        System.out.print("Please Enter The First Number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Now, Enter The Other Number: ");
        int secondNumber = scanner.nextInt();

        int result = firstNumber & secondNumber;
        System.out.println("The Result Of Bitwise AND Operation Is: " + result);
    }
}
