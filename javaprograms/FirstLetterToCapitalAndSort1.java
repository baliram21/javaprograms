package javaprograms;

import java.util.Arrays;
import java.util.Comparator;

public class FirstLetterToCapitalAndSort1 {
    public static void main(String[] args) {
        String str = "&3nayan &4kumar &1my &2name";

        // Split the string into parts based on spaces
        String[] words = str.split(" ");

        // Sort the words based on the numeric value after the '&' symbol
        Arrays.sort(words, Comparator.comparingInt(word -> Character.getNumericValue(word.charAt(1))));

        // Remove the numeric prefix and capitalize the first letter of each word
        String result = Arrays.stream(words)
                .map(word -> word.substring(2)) // Remove the '&' and number
                .map(FirstLetterToCapitalAndSort1::capitalize)          // Capitalize the first letter
                .reduce((word1, word2) -> word1 + " " + word2) // Join words with a space
                .orElse("");

        System.out.println(result);  // Output: My Name Nayan Kumar
    }

    // Method to capitalize the first letter of a word
    private static String capitalize(String word) {
        if (word == null || word.isEmpty()) {
            return word;
        }
        return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
    }
}
