package Day_1;

import java.util.Scanner;

class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        String rollNo = sc.nextLine();

        System.out.print("Enter Section: ");
        String section = sc.nextLine();

        System.out.print("Enter Branch: ");
        String branch = sc.nextLine();

        System.out.println("\nName: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Section: " + section);
        System.out.println("Branch: " + branch);
    }
}
