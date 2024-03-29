/**
 * This class is designed to solve a specific problem: calculating the sum of all prime numbers up to a given limit.
 *
 * @author Himal Shrestha
 * CSC 229
 * Data Structures & Algorithms
 * Assignment 7
 */
public class Problem01
{

    /**
     * Calculates the sum of all prime numbers between 1 and a given number (inclusive).
     *
     * @param n The upper limit for calculating the sum of prime numbers.
     * @return The sum of all prime numbers between 1 and n.
     */
    public static long getSumOfPrimes(int n) {
        long sum = 0; // Initialize sum of primes.
        for (int i = 2; i <= n; i++) { // Iterate from 2 to n.
            if (isPrime(i)) { // Check if the current number is prime.
                sum += i; // Add prime number to sum.
            }
        }
        return sum; // Return the total sum of prime numbers.
    }

    /**
     * Checks if a number is prime.
     *
     * @param number The number to check.
     * @return true if the number is prime; false otherwise.
     */
    private static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) { // Check divisibility from 2 to sqrt(number).
            if (number % i == 0) { // If divisible, number is not prime.
                return false; // Return false, number is not prime.
            }
        }
        return true; // Return true, number is prime.
    }

    /**
     * Main method to test the getSumOfPrimes function and print time and space complexity.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int n = 10; // Example: Calculate sum of primes up to 10.
        System.out.println("Sum of prime numbers up to " + n + ": " + getSumOfPrimes(n)); // Display the sum of primes up to n.

        // Print time and space complexity.
        System.out.println("Time Complexity: O(n*sqrt(n)) - For each number up to n, checks divisibility up to its square root.");
        System.out.println("Space Complexity: O(1) - Uses a constant amount of additional space.");
    }
}
// Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
//          Test your solution
//          Analyze its space and time

 