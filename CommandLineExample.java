class CommandLineExample {

    // Parameterized method
    void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}

public class Main {
    public static void main(String[] args) {

        // Command line arguments
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        CommandLineExample c = new CommandLineExample();
        c.add(x, y);
    }
}
