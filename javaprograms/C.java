package javaprograms;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


import java.util.Map;

public class C {
    public static void main(String[] args) {
        String s = "nayan is a good boy a good boy name is nayan kumar";
        String[] str=s.split(" ");
        String reverseStr="";
        String revSententance="";
        for (int i=str.length-1;i>=0;i--){
            revSententance=revSententance+str[i]+" ";
        }
        System.out.println(revSententance);

        for ( String s1:str){
            String rev="";
            for (int i=s1.length()-1;i>=0;i-- ){
                rev=rev+s1.charAt(i);
            }
            reverseStr=reverseStr+rev+" ";
        }
        System.out.println(reverseStr);


        Map<String,Integer> map= new HashMap<>();
        Map<char[],Long> map1=Arrays.stream(str).map(String::toCharArray)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map1.entrySet());
        for (Map.Entry<String,Integer> entry:map.entrySet()){

        }
    }

    public static class StringSplit {

         void bySplitMethod(String string){

         }
    }
}


