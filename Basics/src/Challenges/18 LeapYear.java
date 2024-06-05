package Challenges;

import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Number Leap Year Program");
        System.out.print("Enter a year: ");
        int year = input.nextInt();


        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println(year + " is a leap year.");
        }
//        else if(year % 100 ==0){
//            System.out.println(year + " is not a leap year."); // This is not needed because if year is divisible by 400 then it is already a leap year.
//        }
//        else if(year % 4 == 0 && year % 100 != 0){           // This is not needed because if year is divisible by 400 then it is already a leap year.
//            System.out.println(year + " is a leap year.");
//        }
        else{
            System.out.println(year + " is not a leap year.");
        }
    }
}
