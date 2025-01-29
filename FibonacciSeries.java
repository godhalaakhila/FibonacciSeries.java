public class FibonacciSeries {

    public static void main(String[] args) {
        // Define the number of terms (you can change this value to generate more or fewer terms)
        int n = 10;  // For example, generating the first 10 terms of the Fibonacci series
        
        // Initialize the first two terms of the Fibonacci series
        int firstTerm = 0;
        int secondTerm = 1;

        // Print the Fibonacci series
        System.out.println("Fibonacci Series up to " + n + " terms:");

        // Loop to generate and print the Fibonacci series
        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");  // Print the current term

            // Calculate the next term in the series
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;  // Update the first term to the second term
            secondTerm = nextTerm;   // Update the second term to the next term
        }
    }
}
