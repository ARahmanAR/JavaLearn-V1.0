import java.util.Scanner;

public class Return {
    public static void main(String[] args) {

        greet();
        int num1 = readNumber() + 10;
        int num2 = readNumber() + 20;
        double sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }
public static int readNumber(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    // int number = scanner.nextInt();
    // return number;                     //-> this is also correct
    return scanner.nextInt();
}

public static void greet(){
        System.out.println("Welcome to calculator\n");
}

}
