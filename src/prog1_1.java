class EvenOddCount {
    public static void main(String[] args) {
        if (args.length != 10) {
            System.out.println("Please enter exactly 10 numbers.");
            return;
        }

        int evenCount = 0;
        int oddCount = 0;
        // Loop through command line arguments
        for (int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Number of Even numbers: " + evenCount);
        System.out.println("Number of Odd numbers: " + oddCount);
    }
}
