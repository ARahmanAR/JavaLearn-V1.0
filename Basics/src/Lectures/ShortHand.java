package Lectures;

import java.util.Scanner;

public class ShortHand {
    public static void main(String[] args) {
        int a = 5;
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        a += x1; // a = a + x1 -> 5 + 10 = 15
        System.out.println(a);
        int x2 = sc.nextInt();
        a += x2; // a = a + x2 -> 15 + 20 = 35
        System.out.println(a);
        int x3 = sc.nextInt();
        a += x3; // a = a + x3 -> 35 + 30 = 65
        System.out.println(a);
        int x4 = sc.nextInt();
        a += x4; // a = a + x4 -> 65 + 40 = 105
        System.out.println(a);
        int x5 = sc.nextInt();
        a -= x5; // a = a - x5 -> 105 - 50 = 55
        System.out.println(a);
        int x6 = sc.nextInt();
        a *= x6; // a = a * x6 -> 55 * 60 = 3300
        System.out.println(a);
        int x7 = sc.nextInt();
        a /= x7; // a = a / x7 -> 3300 / 70 = 47
        System.out.println(a);
        int x8 = sc.nextInt();
        a %= x8; // a = a % x8 -> 47 % 80 = 47
        System.out.println(a);

    }
}
