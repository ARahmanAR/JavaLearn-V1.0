public class Parameter {
    public static void main(String[] args) {
        int num = sumTwoNumbers(4,7); // arguments -> actual values
        System.out.println(num);
        int num2 = sumTwoNumbers(10, 20);
        System.out.println(num2);
        int num3 = sumTwoNumbers(100, 200);
        System.out.println(num3);
    }

    public static int sumTwoNumbers(int first, int second){ // parameters -> definition of the values
        System.out.println("First number: " + first);
        System.out.println("Second number: " + second);
        return first + second;

    }
}
