package javaprograms;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxOccurringCharacterJava8 {
    public static void main(String[] args) {
        String str = "rammayyannnn";
        System.out.println("Max occurring character: " + findMaxOccurringChar(str));
    }

    public static char findMaxOccurringChar(String str) {
        return str.chars()  // Convert String to IntStream of characters
                .mapToObj(c -> (char) c)  // Convert each int to a Character object
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))  // Group by character and count occurrences
                .entrySet().stream()  // Convert the Map to a Stream of entries
                .max(Map.Entry.comparingByValue())  // Find the entry with the maximum value (frequency)
                .get()  // Get the result of the max operation (Optional)
                .getKey();  // Return the character (key)
    }
}
