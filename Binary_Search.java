import java.util.Scanner;

public class Binary_Search {
 
    /* Description: Recursive binary search program that accepts user input,
     * sorts the array, and prints low, high, and mid for every recursive
     * call so the shrinking search interval can be observed until the
     * target is found or the interval becomes empty.
     * Programmed by: <Alea Rawan Barrida> <BSIT> <48079> <Data Structure and Algorithms>
     * Last Modified: September 11, 2026
     * Version: 1.0
     * Acknowledgements: to our understanding DSA Instructure, ma'am Pauline Rivas (^3^)
     */
 
    public static int bSearch(int[] arr, int target, int low, int high) {
 
        // Display the current call before doing anything else
        System.out.println("binarySearch(" + low + ", " + high + ", " + target + ")");
 
        // Base case: target is not found
        if (low > high) {
            return -1;
        }
 
        // Find the middle index
        int mid = low + (high - low) / 2;
        System.out.println("   mid = " + mid + ", array[mid] = " + arr[mid]);
 
        // If target is found at the middle
        if (arr[mid] == target) {
            return mid;
        }
 
        // If target is smaller, search the left half
        if (target < arr[mid]) {
            return bSearch(arr, target, low, mid - 1);
        }
 
        // Otherwise, search the right half
        return bSearch(arr, target, mid + 1, high);
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
 
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
 
        // Binary search requires the array to be sorted in ascending order
        java.util.Arrays.sort(numbers);
 
        System.out.print("Sorted array:");
        for (int num : numbers) {
            System.out.print(" " + num);
        }
        System.out.println();
 
        System.out.print("Enter target value: ");
        int target = sc.nextInt();
 
        int result = bSearch(numbers, target, 0, numbers.length - 1);
 
        if (result == -1) {
            System.out.println("Target not found.");
            System.out.println("Index: -1");
        } else {
            System.out.println("Target found.");
            System.out.println("Index: " + result);
        }
 
        sc.close();
    }
}
 

