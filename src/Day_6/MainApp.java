package Day_6;

import java.util.Scanner;
import Day_6.Marketing.sales;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the employee id and employee name");
        int id = sc.nextInt();
        String name = sc.next();

        System.out.println("Enter the basic salary");
        double basic = sc.nextDouble();

        sales s = new sales(id, name, basic);

        System.out.println("The emp id of the employee is " + s.getEmpId());
        System.out.println("The total earning is " + s.totalEarning());
    }
}
