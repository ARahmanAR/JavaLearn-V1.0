package Lectures;

public class Unary {
    public static void main(String[] args) {
        int a = 10;
        int b = -a;
        int c = -b;
        System.out.println(b);
        System.out.println(c);
        System.out.println("PostIncrement  with ++");
        System.out.println(c++); // c = c + 1
        System.out.println(c);
        System.out.println("PreIncrement after with ++");
        int d = c;
        System.out.println(++d);
        System.out.println(d);

        System.out.println("PostDecrement with --");
        System.out.println(d--);
        System.out.println(d);
        System.out.println("PreDecrement with --");
        System.out.println(--d);
        System.out.println(d);

    }
}
