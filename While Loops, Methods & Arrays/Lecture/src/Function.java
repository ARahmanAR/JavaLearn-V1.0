public class Function {
    public static void main(String[] args) {
        greeting();
        printFirstPattern();
//        System.out.println("\n");
//        printSecondPattern();
//        printThirdPattern();
    }

    
    public static void greeting(){
        System.out.println("Good Afternoon!");


    }

    public static void printFirstPattern(){
        int rows = 0;
        while(rows < 5){
            System.out.print("*");
            int i = 0;
            while(i < rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();

            rows++;
        }
    }
    public static void printSecondPattern(){
        System.out.println("* * * * *");
        System.out.println("* * * *");
        System.out.println("* * *");
        System.out.println("* *");
        System.out.println("*");
    }
    public static void printThirdPattern(){
        System.out.println("        *");
        System.out.println("      * *");
        System.out.println("    * * *");
        System.out.println("  * * * *");
        System.out.println("* * * * *");
    }
}
