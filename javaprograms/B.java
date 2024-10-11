package javaprograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class B {
    public static void main(String[] args) {
        String s = "akabbcddeeem";

        List<Character> characters=s.chars().mapToObj(c->(char)c).distinct().toList();
        System.out.println(characters);
        Map<Character, Long> countMap=s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(countMap);

        Map<Character,Integer> map= new LinkedHashMap<>();

        for (int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            Integer count=map.get(c);
            if (count==null){
                map.put(c,1);
            }else {
                map.put(c,count+1);
            }
        }
        System.out.println(map);
        for (Map.Entry<Character,Integer> entry:map.entrySet()){
            if (entry.getValue()==1){
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
