package Day_5;

import java.util.Scanner;
interface Salary {
    void earnings();
    void deductions();
    void bonus();
}

abstract class Manager implements Salary {
    double basic;
    Manager(double basic) {
        this.basic = basic;
    }
    public void earnings() {
        double da = 0.8 * basic;
        double hra = 0.15 * basic;
        double earnings = basic + da + hra;
        System.out.println("Earnings - " + earnings);
    }
    public void deductions() {
        double deduction = 0.12 * basic;
        System.out.println("Deduction - " + deduction);
    }
}

class Substaff extends Manager {
    Substaff(double basic) {
        super(basic);
    }
    public void bonus() {
        double bonus = 0.5 * basic;
        System.out.println("Bonus - " + bonus);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();
        Substaff s = new Substaff(basicSalary);
        s.earnings();
        s.deductions();
        s.bonus();
        sc.close();
    }
}
