package Day_5;

interface Motor{
    int capacity = 5;
    void run();
    void consumer();
}

class WashingMachine implements Motor{
    public void run(){
        System.out.println("The Washing Machine is running");
    }
    public void consumer(){
        System.out.println("The Washing Machine is consuming electricity");
    }
}

class Prog{
    public static void main(String[] args){
        WashingMachine ob = new WashingMachine();
        ob.run();
        ob.consumer();
        System.out.println("Capacity of the motor is "+ob.capacity);
    }
}
