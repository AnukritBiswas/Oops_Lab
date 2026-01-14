package Day_2;

import java.util.Scanner;

class MyClass {
    static int objectCount = 0;

    // Constructor increments count
    MyClass() {
        objectCount++;
    }

    static void displayObjectCount() {
        System.out.println("Number of objects created: " + objectCount);
    }
}

class ObjectCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of objects to create: ");
        int n = sc.nextInt();

        // Create objects
        for (int i = 0; i < n; i++) {
            new MyClass(); // perfectly fine now
        }

        // Display total
        MyClass.displayObjectCount();

        sc.close();
    }
}
