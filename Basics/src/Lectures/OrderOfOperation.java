package Lectures;

public class OrderOfOperation {
    public static void main(String[] args) {
        System.out.println(8 - 3 * 3); // 3 * 3 = 9, 8 - 9 = -1 -> Multiplication first
        System.out.println(9/3/3); // 9 / 3 = 3, 3 / 3 = 1 -> Left to right
        System.out.println(8*5/2*2); // 8 * 5 = 40, 40 / 2 = 20, 20 * 2 = 40 -> Left to right
        System.out.println(8*(5/2)*2); // 5 / 2 = 2, 8 * 2 = 16, 16 * 2 = 32 -> Parentheses first
    }
}
