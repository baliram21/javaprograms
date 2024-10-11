package javaprograms;

import java.util.HashMap;
import java.util.Map;

public class StringsProgramms1 {
    public static void main(String[] args) {
        String string = "nayan is a good boy a gooood boy name is nayan kumar";
        countWordsInString(string);
        reverseWordsInSamePlace(string);
        reveseWordInString(string);
        findLongestWord(string);
        changeFirstLetterInCapitalInString(string);

    }

    private static void changeFirstLetterInCapitalInString(String string) {
    }

    private static void findLongestWord(String string) {
        String[] str=string.split(" ");
        String longestWord="";
        int maxCount=0;
        for (String s:str){
            if (s.length()>maxCount){
                maxCount=s.length();
                longestWord=s;
            }
        }
        System.out.println("Longest word in sentance :- "+longestWord);
    }

    private static void reveseWordInString(String string) {
        String rev="";
        String[] str=string.split(" ");
        for (int i=str.length-1;i>=0;i--){
            rev=rev+str[i]+" ";
        }
        System.out.println(rev);
    }

    private static void reverseWordsInSamePlace(String string) {
        String[] str=string.split(" ");
        String reverseWord="";
        for (String s :str){
            String rev="";
            for (int i=s.length()-1;i>=0;i--){
                rev=rev+s.charAt(i);
            }
            reverseWord=reverseWord+rev+" ";
        }
        System.out.println("Revese of each word in the Sentance ");
        System.out.println(reverseWord);
    }

    private static void countWordsInString(String string) {
        String[] strings=string.split(" ");
        Map<String,Integer> map=new HashMap<>();
        for (String s:strings){
            Integer count= map.get(s);
            if (count==null){
                map.put(s,1);
            }else {
                map.put(s,count+1);
            }
        }
        System.out.println("Counting each word in a sentance :- ");
        System.out.println(map);
    }
}
