package Day_4;

import java.util.Scanner;

class Student1 {
    int id;
    Student1(int id) {
        this.id = id;
    }
    public boolean equals(Object obj) {
        Student1 other = (Student1) obj;
        return this.id == other.id;
    }
}

class prog_4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID for Student 1: ");
        Student1 s1 = new Student1(sc.nextInt());
        System.out.print("Enter ID for Student 2: ");
        Student1 s2 = new Student1(sc.nextInt());
        if (s1.equals(s2))
            System.out.println("Result: The students are equal.");
        else
            System.out.println("Result: The students are different.");
        sc.close();
    }
}
