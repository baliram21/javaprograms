package practice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Str {
    public static void main(String[] args) {
        String s = "nayan kumar";
        String[] str=s.split(" ");

        String string=Arrays.stream(str)
                .map(w->Character.toUpperCase(w.charAt(0))+w.substring(1)
                        .toLowerCase())
                .collect(Collectors.joining(" "));
        System.out.println(string);

    }
}
