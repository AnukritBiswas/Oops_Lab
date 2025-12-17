package Day_1;

import java.util.Scanner;

class GradeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Grade: O");
        } else if (marks >= 80) {
            System.out.println("Grade: E");
        } else if (marks >= 70) {
            System.out.println("Grade: A");
        } else if (marks >= 60) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }
    }
}
