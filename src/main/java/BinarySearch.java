
/**
 * This class implements the binary search algorithm iteratively.
 * It searches for a specific element (key) in a sorted array.
 *
 * @author Himal Shrestha
 * CSC 229
 * Data Structures & Algorithms
 * Assignment 7
 */
public class BinarySearch {

    /**
     * Searches for a specific element (key) within a sorted array and returns its index.
     * This method uses an iterative approach to binary search.
     *
     * @param sortedArray The array to be searched that must be sorted in ascending order.
     * @param key The element to search for in the array.
     * @param low The starting index of the range within the array to be searched.
     * @param high The ending index of the range within the array to be searched.
     * @return The index of the key if found; otherwise, returns Integer.MAX_VALUE.
     */
    public static int runBinarySearchIteratively(int[] sortedArray, int key, int low, int high) {
        while (low <= high) { // Continues searching while the search range is valid.
            int mid = low + ((high - low) / 2); // Calculates the middle index of the search range.
            if (sortedArray[mid] < key) { // If the key is greater than the mid element, narrows the search to the right half.
                low = mid + 1;
            } else if (sortedArray[mid] > key) { // If the key is less than the mid element, narrows the search to the left half.
                high = mid - 1;
            } else { // Found the key.
                return mid; // Returns the index of the key.
            }
        }
        return Integer.MAX_VALUE; // Key not found, returns a sentinel value.
    }

    /**
     * Main method to test the binary search function with an example.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int[] sortedArray = {2, 4, 6, 8, 10, 12, 14, 16}; // Example of a sorted array.
        int key = 10; // The target element to find in the array.
        // Calls runBinarySearchIteratively with the sorted array, key, and the search range.
        int index = runBinarySearchIteratively(sortedArray, key, 0, sortedArray.length - 1);

        // Checks if the key was found and prints the result.
        if (index != Integer.MAX_VALUE) {
            System.out.println("Element found at index: " + index); // Key found, prints index.
        } else {
            System.out.println("Element not found in the array."); // Key not found, prints message.
        }
    }
}

    //ToDo 2: Call the above method and test the algorithm  
    // provide time and space analysis 


