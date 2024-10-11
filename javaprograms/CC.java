package javaprograms;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CC {
    public static void main(String[] args) {
        String s = "akabbcddeeem";

        String[] str = s.split("");

        Map<String, Long> charCount = Arrays.stream(str)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(charCount);

        List<Character> list = s.chars().mapToObj(c -> (char) c).toList();
        System.out.println(list);

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
