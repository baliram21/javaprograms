package javaprograms;

import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StrinSplit {
    public static void main(String[] args) {
        String str="+91-9891674009";

        byStringMethod(str);
        byPatternMethod(str);
        byStringTokenizer(str);

    }

    private static void byStringTokenizer(String str) {
        StringTokenizer stringTokenizer=new StringTokenizer(str,"-");
        while (stringTokenizer.hasMoreTokens()){
            String st=stringTokenizer.nextToken();
            System.out.println(st);
        }
    }

    private static void byPatternMethod(String str) {
        List<String> strings =Pattern.compile("-").splitAsStream(str)
                .collect(Collectors.toList());
        for (String s:strings){
            System.out.println(s);
        }
    }

    public static void byStringMethod(String str){
       String[] strings= str.split("-");
       for (String s:strings){
           System.out.println(s);
       }
    }

}
