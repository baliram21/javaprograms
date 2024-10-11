package javaprograms;

public class StringPallindrome {
    public static void main(String[] args) {
        String string="nayan";
        String reverseString="";

        for (int i=string.length()-1; i>=0; i--){
            reverseString=reverseString+string.charAt(i);
        }
        System.out.println(reverseString);
      /*  There is a small but significant issue in code. In Java, you should not use
        the == operator to compare the contents of two strings. The == operator checks if
        both references point to the same object, not if their contents are the same.
                To compare the contents of two strings, you should use the .equals() method.*/
       // if (string==reverseString)

        if (string.equals(reverseString)){
            System.out.println("String is Pallindrome");
        }else {
            System.out.println("String is not Pallindrome");
        }
        System.out.println("_______________________________________________");

        String s1="nayan";
        String s2="nayan";

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
