/**
 * @author Himal Shrestha
 * CSC 229
 * Data Strutures & Algorithims
 * assignment 7
 *
 * This class demonstrates a simple implementation of the linear search algorithm.
 */
public class LinearSearch {

    /**
     * Performs linear search to find the index of a specified element in the array.
     *
     * @param arr The array to search through.
     * @param x The target element to search for.
     * @return The index of the target element if found; otherwise, -1.
     */
    public static int search(int arr[], int x) {
        int n = arr.length; // Store the length of the array in 'n' for easy access.
        for (int i = 0; i < n; i++) { // Loop through the array from the first to the last element.
            if (arr[i] == x) { // Check if the current element matches the target ('x').
                return i; // Return the current index if the element is found.
            }
        }
        return -1; // Return -1 if the element is not found in the array.
    }

    /**
     * Main method to test the linear search function.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 7, 5}; // Define and initialize an example array.
        int x = 7; // The target element we want to find in the array.

        int result = search(arr, x); // Perform the search and store the result.

        // Check the result and print appropriate message.
        if (result == -1) {
            System.out.println("Element not found in the array."); // Print if the element was not found.
        } else {
            System.out.println("Element found at index: " + result); // Print the index if the element was found.
        }
    }
}

// Todo 01: - complete the implementation of linear search and test your code
//         - provide asymptotic analysis of the developed solution