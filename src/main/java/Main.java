/**
 * This class demonstrates the use of several algorithms including linear search,
 * sum of prime numbers calculation, bubble sort, and binary search.
 * It serves as the entry point to run and test these algorithms.
 *
 * @author Himal Shrestha
 * CSC 229
 * Data Structures & Algorithms
 * Assignment 07
 */
public class Main {

    // Main method - entry point of the program
    public static void main(String[] args) {
        // Initialize an array for demonstration of LinearSearch
        int[] arr = {3, 4, 1, 7, 5};
        // Target element to find using LinearSearch
        int x = 7;
        // Print a header for the LinearSearch section
        System.out.println("Linear Search:");
        // Perform a linear search and store the result
        int linearSearchResult = LinearSearch.search(arr, x);
        // Check if the result indicates the element was found
        if (linearSearchResult != -1) {
            // Print the index of the found element
            System.out.println("Element found at index: " + linearSearchResult);
        } else {
            // Print a message indicating the element was not found
            System.out.println("Element not found.");
        }
        // Print time and space complexity for LinearSearch
        System.out.println("Time Complexity: O(n) - Linearly searches through the array once.");
        System.out.println("Space Complexity: O(1) - Uses a constant amount of additional space.");

        // Print a header for the sum of prime numbers section
        System.out.println("\nSum of Prime Numbers:");
        // Define the upper limit for sum of prime numbers calculation
        int n = 10;
        // Calculate and print the sum of prime numbers up to n
        System.out.println("Sum of prime numbers up to " + n + ": " + Problem01.getSumOfPrimes(n));
        // Print time and space complexity for sum of prime numbers calculation
        System.out.println("Time Complexity: O(n*sqrt(n)) - For each number up to n, checks divisibility up to its square root.");
        System.out.println("Space Complexity: O(1) - Uses a constant amount of additional space.");

        // Print a header for the BubbleSort section
        System.out.println("\nBubble Sort:");
        // Initialize an array for demonstration of BubbleSort
        int[] bubbleSortArr = {64, 34, 25, 12, 22, 11, 90};
        // Print the array before sorting
        System.out.println("Before sorting: ");
        for (int value : bubbleSortArr) System.out.print(value + " ");
        // Perform bubble sort on the array
        BubbleSort.bubbleSort(bubbleSortArr, bubbleSortArr.length);
        // Print the array after sorting
        System.out.println("\nAfter sorting: ");
        for (int value : bubbleSortArr) System.out.print(value + " ");
        // Print time and space complexity for BubbleSort
        System.out.println("\nTime Complexity: O(n^2) - Quadratic time complexity due to nested loops.");
        System.out.println("Space Complexity: O(1) - Uses a constant amount of additional space.");

        // Print a header for the BinarySearch section
        System.out.println("\n\nBinary Search:");
        // Initialize a sorted array for demonstration of BinarySearch
        int[] sortedArray = {2, 4, 6, 8, 10, 12, 14, 16};
        // Target element to find using BinarySearch
        int key = 10;
        // Perform a binary search and store the result
        int binarySearchResult = BinarySearch.runBinarySearchIteratively(sortedArray, key, 0, sortedArray.length - 1);
        // Check if the result indicates the element was found
        if (binarySearchResult != Integer.MAX_VALUE) {
            // Print the index of the found element
            System.out.println("Element found at index: " + binarySearchResult);
        } else {
            // Print a message indicating the element was not found
            System.out.println("Element not found.");
        }
        // Print time and space complexity for BinarySearch
        System.out.println("Time Complexity: O(log n) - Divides the search space in half at each step.");
        System.out.println("Space Complexity: O(1) - Uses a constant amount of additional space.");
    }
}
