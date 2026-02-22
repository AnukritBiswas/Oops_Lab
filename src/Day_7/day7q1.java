package Day_7;

import java.util.Scanner;

class ArrayExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the numbers:");
        try {
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception in thread \"main\" " + e);
        }
        sc.close();
    }
}
