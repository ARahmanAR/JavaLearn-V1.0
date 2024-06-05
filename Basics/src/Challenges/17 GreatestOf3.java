package Challenges;

import java.util.Scanner;

class GreatestOf3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the World of Three\n");
        System.out.print("Please Enter Your First Number: ");
        int first  = input.nextInt();
        System.out.print("Now, Enter Your Second Number: ");
        int second = input.nextInt();
        System.out.print("Finally, Enter Your Third Number: ");
        int third;
        third = input.nextInt();


        if(first >= second && first >= third) {
            System.out.println(first + " is the Greatest Number");
        }
        //else if(second >= first && second >= third) -> This is also correct
         else if (second>= third){ // -> This is a new way of writing the same thing
            System.out.println(second + " is the Greatest Number");
        }
        else {
            System.out.println(third + " is the Greatest Number");
        }
    }
}
