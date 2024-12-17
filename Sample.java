public class Sample {
    public static void main(String[] args) {
        int n = 20; // Number of Fibonacci numbers to generate
        long[] fibonacci = new long[n];

        // Initialize the first two numbers
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        // Generate the Fibonacci series
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        // Print the Fibonacci series
        System.out.println("The first 20 numbers in the Fibonacci series are:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}
