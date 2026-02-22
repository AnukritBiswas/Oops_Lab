package Day_6;

class Bank {

    private String bankName = "National Bank";

    static class InterestCalculator {

        public static double calculateSimpleInterest(double p, double r, double t) {
            return (p * r * t) / 100;
        }

        void display() {
            // Cannot access bankName directly
            // System.out.println(bankName); // Compile-time error
            System.out.println("Static nested class cannot access non-static members directly.");
        }
    }

    public static void main(String[] args) {
        double si = Bank.InterestCalculator.calculateSimpleInterest(1000, 5, 2);
        System.out.println("Simple Interest: " + si);

        InterestCalculator ic = new InterestCalculator();
        ic.display();
    }
}
