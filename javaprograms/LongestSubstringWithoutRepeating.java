package javaprograms;

import java.util.HashSet;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println("Longest substring: " + longestSubstringWithoutRepeating(str));
    }

    public static String longestSubstringWithoutRepeating(String str) {
        int maxLength = 0;
        int start = 0;
        int longestStart = 0;  // To store the starting index of the longest substring
        HashSet<Character> set = new HashSet<>();

        for (int end = 0; end < str.length(); end++) {
            char ch = str.charAt(end);

            // Remove characters from the start until there are no duplicates
            while (set.contains(ch)) {
                set.remove(str.charAt(start));
                start++;
            }

            // Add the current character to the set
            set.add(ch);

            // Update the maximum length and store the start of the longest substring
            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                longestStart = start;  // Update the starting index of the longest substring
            }
        }

        // Return the longest substring
        return str.substring(longestStart, longestStart + maxLength);
    }
}
