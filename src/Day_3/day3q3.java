package Day_3;

import java.util.Scanner;

class Account {
    String acc_no;
    double balance;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        acc_no = sc.nextLine();
        System.out.print("Enter balance: ");
        balance = sc.nextDouble();
    }

    void disp() {
        System.out.println("Account No: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    String aadhar_no;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter Aadhar number: ");
        aadhar_no = sc.nextLine();
        super.input();
    }

    @Override
    void disp() {
        System.out.println("Name: " + name);
        System.out.println("Aadhar No: " + aadhar_no);
        super.disp();
        System.out.println("-------------------");
    }
}

class Details {
    public static void main(String[] args) {
        Person[] persons = new Person[3];

        System.out.println("Enter details of three persons:");
        for(int i = 0; i < 3; i++) {
            System.out.println("Person " + (i+1) + ":");
            persons[i] = new Person();
            persons[i].input();
        }

        System.out.println("\nDetails of three persons:");
        for(int i = 0; i < 3; i++) {
            persons[i].disp();
        }
    }
}
