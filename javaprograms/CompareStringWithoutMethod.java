package javaprograms;

public class CompareStringWithoutMethod {
    public static void main(String[] args) {
        String str1 = "nayan";
        String str2 = "nayan";

        boolean isSame = true;

        if (str1.length() != str2.length()) {
            isSame = false;
        } else {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    isSame = false;
                    break; // Exit the loop if any character doesn't match
                }
            }
        }

        if (isSame) {
            System.out.println("Both are the same");
        } else {
            System.out.println("Both are not the same");
        }
    }
}
