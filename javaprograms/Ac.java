package javaprograms;

import java.util.HashMap;
import java.util.Map;

public class Ac {
    public static void main(String[] args) {
        int[] a = {2, 4, 2, 5, 6, 5, 7, 5};
        Map<Integer, Integer> map = new HashMap<>();

        // Count occurrences of each element in the array
        for (int n : a) {
            Integer count = map.get(n);
            if (count == null) {
                map.put(n, 1);
            } else {
                map.put(n, count + 1); // Increment the count correctly
            }
        }
        System.out.println(map);
        // Print the counts for each element
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }
}
