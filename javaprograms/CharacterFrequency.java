package javaprograms;

import java.util.*;

public class CharacterFrequency {
    public static void main(String[] args) {
        String name = "rammayyannnn";

        // Step 1: Create a map to store character frequencies
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Step 2: Count the frequency of each character
        for (char ch : name.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Step 3: Convert the map entries to a list for sorting
        List<Map.Entry<Character, Integer>> charCountList = new ArrayList<>(charCountMap.entrySet());

        // Step 4: Sort the list based on the frequency of characters (ascending order)
        charCountList.sort(Map.Entry.comparingByValue());

        // Step 5: Print the characters and their frequencies in ascending order
        for (Map.Entry<Character, Integer> entry : charCountList) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
