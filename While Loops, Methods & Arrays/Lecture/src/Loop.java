import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
//        int number = 1; // -> initialization of the variable number
//        while(number <= 2000){ // -> condition to check if the number is less than or equal to 10
//            System.out.println(number);
//            number = number + 1; // -> updating condition to check if the number is less than or equal to 10
//        }

//        int count  = 500;
//        while(count >=200){
//            System.out.println(count);
//            count = count - 1;
//        }

        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while(i < 5){
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println("You entered: " + number);
            i++;
        }
    }
}
