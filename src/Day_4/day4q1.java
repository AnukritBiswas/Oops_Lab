package Day_4;

import java.util.Scanner;

class Account{
    static int nextAccNo = 1000;
    int accNo;
    String name;
    double balance;

    Account(String name, double balance){
        this.accNo = ++nextAccNo;
        this.name = name;
        this.balance = balance;
    }

    void checkBalance(){
        System.out.println(name+ " | Balance: Rs "+balance);
    }

    void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: Rs "+amount);
    }

    void withdraw(double amount){
        System.out.println("Withdrawal rules depend on account type.");
    }
}

class StandardAccount extends Account{
    StandardAccount(String name, double balance){
        super(name,balance);
    }

    @Override
    void withdraw(double amount){
        if (amount <= 100000){
            balance -=amount;
            System.out.println("Withdrawn Rs "+amount+" (No Penalty).");
        } else if (amount <= 500000) {
            double penalty = amount * 0.0005;
            balance -= (amount + penalty);
            System.out.println("Withdrawn Rs "+amount+" with penalty Rs "+penalty);
        } else {
            System.out.println("Limit exceeded for Standard Account");
        }
    }
}

class PremiumAccount extends Account{
    PremiumAccount(String name, double balance){
        super(name,balance);
    }

    @Override
    void withdraw(double amount){
        if (amount <= 1000000){
            balance -= amount;
            System.out.println("Withdrawn Rs "+amount+" successfully.");
        } else {
            System.out.println("Limit exceeded for Premium Account");
        }
    }
}

class BankDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter starting balance: ");
        double balance = sc.nextDouble();
        System.out.print("Choose account type (1 = Standard, 2 = Premium)");
        int choice = sc.nextInt();

        Account acc;
        if (choice == 1){
            acc = new StandardAccount(name, balance);
        } else {
            acc = new PremiumAccount(name, balance);
        }

        int option;
        do{
            System.out.println("\n--- Banking Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter option: ");
            option = sc.nextInt();

            switch (option){
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double dep = sc.nextDouble();
                    acc.deposit(dep);
                    break;
                case 2:
                    System.out.print("Enter withdraw amount: ");
                    double wd = sc.nextDouble();
                    acc.withdraw(wd);
                    break;
                case 3:
                    acc.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for banking");
                    break;
                default:
                    System.out.println("Invaid Option!");
            }
        } while (option != 4);
        sc.close();
    }
}