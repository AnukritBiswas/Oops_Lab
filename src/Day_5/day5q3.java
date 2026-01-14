package Day_5;

import java.util.Scanner;

interface Employee
{
    void getDetails(int empid, String ename);
}

interface Manager1 extends Employee
{
    void getDeptDetails(int deptid, String deptname);
}

class Head implements Manager1
{
    int empid, deptid;
    String ename, deptname;

    public void getDetails(int empid, String ename)
    {
        this.empid = empid;
        this.ename = ename;
    }

    public void getDeptDetails(int deptid, String deptname)
    {
        this.deptid = deptid;
        this.deptname = deptname;
    }

    void display()
    {
        System.out.println("Employee id - " + empid);
        System.out.println("Employee name - " + ename);
        System.out.println("Department id - " + deptid);
        System.out.println("Department name - " + deptname);
    }
}

class day5q3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Head h = new Head();

        System.out.print("Enter employee id - ");
        int empid = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter employee name - ");
        String ename = sc.nextLine();

        System.out.print("Enter department id - ");
        int deptid = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter department name - ");
        String deptname = sc.nextLine();

        h.getDetails(empid, ename);
        h.getDeptDetails(deptid, deptname);
        h.display();
    }
}
