package practice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FirstLetterToCapitalAndSort {
    public static void main(String[] args) {
        String str="&3nayan &4kumar &1my &2name";  //outpu=My Name Nayan Kuamr
        String[] strings=str.split(" ");
        String string=
        Arrays.stream(strings).sorted()
                .map(c->c.substring(2))
                .map(w->Character.toUpperCase(w.charAt(0))+w.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));

        System.out.println(string);
    }
}
