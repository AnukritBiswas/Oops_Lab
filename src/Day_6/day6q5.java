package Day_6;

interface Greeting {
    void sayHello();
}

class TestGreeting {
    public static void main(String[] args) {

        Greeting g = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello! Welcome to Java Programming.");
            }
        };

        g.sayHello();
    }
}
