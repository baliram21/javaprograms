package javaprograms;

import java.util.HashMap;
import java.util.Map;

public class MaxOccurringCharacter {
    public static void main(String[] args) {
        String str = "rammayyannnn";
        System.out.println("Max occurring character: " + findMaxOccurringChar(str));
    }

    public static char findMaxOccurringChar(String str) {
        // Step 1: Create a map to store character frequencies
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Step 2: Count the frequency of each character
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Step 3: Find the character with the maximum frequency
        char maxChar = ' ';
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        // Step 4: Return the character with the highest frequency
        return maxChar;
    }
}
