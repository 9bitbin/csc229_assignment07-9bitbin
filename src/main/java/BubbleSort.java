
/**
 * This class implements the bubble sort algorithm.
 * Bubble sort is a simple sorting algorithm that repeatedly steps through the list,
 * compares adjacent elements and swaps them if they are in the wrong order.
 * The pass through the list is repeated until the list is sorted.
 *
 * @author Himal Shrestha
 * CSC 229
 * Data Structures & Algorithms
 * Assignment 7
 */
public class BubbleSort {

    /**
     * Sorts an array using the bubble sort algorithm.
     *
     * @param a The array to be sorted.
     * @param size The number of elements in the array.
     */
    public static void bubbleSort(int a[], int size) {
        int outer, inner, temp; // Declares variables for outer loop, inner loop, and swapping.
        for (outer = size - 1; outer > 0; outer--) { // Counts down from the end of the array.
            for (inner = 0; inner < outer; inner++) { // Bubbles up from the beginning of the array.
                if (a[inner] > a[inner + 1]) { // Compares adjacent elements.
                    // Swapping the elements if they are in the wrong order.
                    temp = a[inner];
                    a[inner] = a[inner + 1];
                    a[inner + 1] = temp;
                }
            }
        }
    }

    /**
     * Main method to test the bubble sort function with an example.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int[] arr = {3, 60, 35, 2, 45, 320, 5}; // Example array to be sorted.
        System.out.println("Array Before Bubble Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Printing the array before sorting.
        }
        System.out.println();

        bubbleSort(arr, arr.length); // Calling the bubble sort function.

        System.out.println("Array After Bubble Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Printing the array after sorting.
        }
    }
}

//ToDo 3: complete this algorithm, test it, provide its time complexity
