package javaprograms;

public class CheckStringRotation {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "bcda";

        if (isStringsRotated(s1, s2)) {
            System.out.println(s2 + " is a rotation of " + s1);
        } else {
            System.out.println(s2 + " is not a rotation of " + s1);
        }
    }

    public static boolean isStringsRotated(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        } else if (str1.length() != str2.length()) {
            return false;
        } else {
            String concatenated = str1 + str1;
            return concatenated.contains(str2);
        }
    }
}
