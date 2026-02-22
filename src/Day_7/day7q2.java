package Day_7;

import java.util.Scanner;

class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught by try-catch-finally block");
        }
        finally {
            System.out.println("Finally block executed");
        }
        sc.close();
    }
}
