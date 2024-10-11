package practice;

import java.util.Arrays;

public class ARR {
    public static void main(String[] args) {
        int[] a = {5, 6, 7, 2, 3};
        System.out.println("Original Array: " + Arrays.toString(a));

        int[] newArrayAfterInsert = insertElement(a, 3, 10); // Insert 10 at position 3
        System.out.println("Array After Insertion: " + Arrays.toString(newArrayAfterInsert));

        int[] newArrayAfterDelete = deleteElement(newArrayAfterInsert, 3); // Delete element at position 3
        System.out.println("Array After Deletion: " + Arrays.toString(newArrayAfterDelete));
    }

    private static int[] insertElement(int[] a, int pos, int num) {
        // Create a new array with size + 1 to accommodate the new element
        int[] newArr = new int[a.length + 1];

        for (int i = 0; i < pos - 1; i++) {
            newArr[i] = a[i];  // Copy elements before the insertion point
        }

        newArr[pos - 1] = num; // Insert the new element at the desired position

        for (int i = pos; i < newArr.length; i++) {
            newArr[i] = a[i - 1]; // Copy the remaining elements after the insertion point
        }

        return newArr;
    }

    private static int[] deleteElement(int[] a, int pos) {
        // Create a new array with size - 1 to remove the element
        int[] newArr = new int[a.length - 1];

        for (int i = 0; i < pos - 1; i++) {
            newArr[i] = a[i];  // Copy elements before the deletion point
        }

        for (int i = pos - 1; i < newArr.length; i++) {
            newArr[i] = a[i + 1];  // Copy elements after the deletion point
        }

        return newArr;
    }
}
