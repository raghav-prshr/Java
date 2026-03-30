import java.util.Scanner;

public class day01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in) ;
        
        System.out.print("Enter First Number: ");
        int a = scn.nextInt();

        System.out.print("Enter Second Number: ");
        int b = scn.nextInt();

        System.out.println("Sum: " + (a + b));
        System.out.println("Product: " + (a * b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Division: " + (a / b));
        System.out.println("Float Division: " + ((float) a / b));
        scn.close();
    }
}