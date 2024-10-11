package javaprograms;

import java.util.*;
import java.util.stream.Collectors;

public class CharacterFrequencyDesc {
    public static void main(String[] args) {
        String name = "rammayyannnn";

        // Stream-based solution: Count, sort in descending order, and print
        name.chars()  // Stream of int (characters)
            .mapToObj(c -> (char) c)  // Convert int to Character
            .collect(Collectors.groupingBy(c -> c, Collectors.counting()))  // Count frequencies
            .entrySet().stream()  // Convert Map to Stream
            .sorted(Map.Entry.<Character, Long>comparingByValue().reversed())  // Sort in descending order
            .forEach(entry -> System.out.println(entry.getKey() + " = " + entry.getValue()));  // Print result
    }
}
