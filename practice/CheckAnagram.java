package practice;

public class CheckAnagram {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "bcda";
        System.out.println(isAnagram(s1,s2));

    }

    private static boolean isAnagram(String s1, String s2) {
        int[] charCount=new int[256];
        for (int i = 0; i < s1.length(); i++) {
            charCount[s1.charAt(i)]++;
            charCount[s2.charAt(i)]--;

        }
        for (int i = 0; i < charCount.length; i++) {
           if (charCount[i]!=0){
               return false;
           }
        }
        return true;
    }

}
