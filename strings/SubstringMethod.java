package strings;

import java.util.Arrays;

public class SubstringMethod {
    public static void main(String[] args) {
        String string = "123Nayan";
        String substring = string.substring(3);
        System.out.println(substring);

        String substring1 = string.substring(0, 3);
        System.out.println(substring1);

//        String substring(int beginIndex)
//        ->beginIndex: The starting index (inclusive) from where the substring begins.
//        -> It extracts all characters from beginIndex to the end of the string.
/*        If beginIndex equals the length of the string, it returns an empty string.
        If beginIndex is greater than the string length, it throws a StringIndexOutOfBoundsException.
        String str = "Hello";
        String sub = str.substring(6);  // Throws StringIndexOutOfBoundsException
        -----------------------------------------------------------------------------------
                String substring(int beginIndex, int endIndex)

        beginIndex: The starting index (inclusive) from where the substring begins.
        endIndex: The ending index (exclusive), which marks where the substring stops.
                It extracts characters starting at beginIndex and ending just before endIndex.*/

        String str = "Hello, World!";
        String sub = str.substring(0, 5);  // "Hello"
        System.out.println(sub);           // Output: Hello


        String fileName = "example.txt";
        String extension = fileName.substring(fileName.lastIndexOf(".") + 1);  // "txt"
        System.out.println(extension);  // Output: txt


        String url = "https://www.example.com";
        String domain = url.substring(url.indexOf("www."), url.indexOf(".com") + 4);  // "www.example.com"
        System.out.println(domain);  // Output: www.example.com


        //Returns the index of the first occurrence of the specified substring.
        String str3 = "Hello World";
        int index = str3.indexOf("World");  // 6
        System.out.println(index);         // Output: 6

        /*14. lastIndexOf(int ch)
        Returns the index of the last occurrence of the specified character.*/
        String str4 = "Hello World";
        int indexx = str4.lastIndexOf('o');  // 7
        System.out.println(indexx);         // Output: 7

       /* 17. trim()
        Removes leading and trailing spaces from the string.*/
        String str5 = "  Hello World  ";
        String trimmed = str5.trim();  // "Hello World"
        System.out.println(trimmed);  // Output: Hello World

        /*18. isEmpty()
        Checks if the string is empty.*/
        String str6 = "";
        boolean isEmpty = str6.isEmpty();
        System.out.println(isEmpty);  // Output: true

        /*19. replace(char oldChar, char newChar)
        Replaces all occurrences of the specified old character with the new character.*/

        String str7 = "Hello World";
        String replaced = str7.replace('o', 'a');  // "Hella Warld"
        System.out.println(replaced);

        /*20. replace(CharSequence target, CharSequence replacement)
        Replaces each occurrence of the specified string with another string.*/

        String str8 = "Hello World";
        String replaced1 = str8.replace("World", "Java");  // "Hello Java"
        System.out.println(replaced1);                    // Output: Hello Java


       /* 21. split(String regex)
        Splits the string based on the specified regular expression (delimiter).*/

        String str9 = "one,two,three";
        String[] parts = str9.split(",");
        System.out.println(Arrays.toString(parts));  // Output: [one, two, three]


        /*22. join(CharSequence delimiter, CharSequence... elements)
        Joins multiple strings with a delimiter.*/

        String result = String.join(", ", "one", "two", "three");
        System.out.println(result);  // Output: one, two, three


      /*  Performance Consideration
        In older versions of Java (prior to Java 7), substring() would create a new String object that shared
        the same character array as the original string, which could cause memory leaks. However, starting from Java 7,
                the substring() method creates a new character array for the substring, so this issue no longer exists.*/

        String str1 = "abc";
        String str2 = "xyz";
        int result1 = str1.compareTo(str2);  // Negative because "abc" is less than "xyz"
        System.out.println(result1);         // Output: -23

        String str11 = "ABC";
        String str21 = "abc";
        System.out.println(str11.compareToIgnoreCase(str21));  // Output: 0

        String str111 = "Hello";
        char[] chars = str111.toCharArray();
        System.out.println(Arrays.toString(chars));  // Output: [H, e, l, l, o]

        int num = 100;
        String string1r = String.valueOf(num);  // "100"
        System.out.println(string1r);           // Output: 100








    }
}
