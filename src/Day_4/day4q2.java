package Day_4;

import java.util.*;

abstract class Student{
    long rollno;
    long regno;
    void getinput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        rollno = sc.nextLong();
        System.out.print("Enter Registration No: ");
        regno = sc.nextLong();
    }
    abstract void course();
}

class Kiitian extends Student{
    void course() {
        System.out.println("Course: B.Tech (Computer Science & Engineering)");
    }
    void display() {
        System.out.println("\nStudent Details");
        System.out.println("Roll No: " + rollno);
        System.out.println("Registration No: " + regno);
        course();
    }
}

class prog_4_2 {
    public static void main(String[] args) {
        Kiitian k = new Kiitian();
        k.getinput();
        k.display();
    }
}
