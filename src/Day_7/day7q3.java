package Day_7;

import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

class ExceptionDemo {
    void ProcessInput() throws NegativeNumberException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num < 0) {
            throw new NegativeNumberException("number should be positive");
        } else {
            System.out.println("Double value: " + (num * 2));
        }
    }

    public static void main(String[] args) {
        ExceptionDemo obj = new ExceptionDemo();
        try {
            obj.ProcessInput();
        } catch (NegativeNumberException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e);
        }
    }
}
