package practice;

import java.util.*;

public class A {
    public static void main(String[] args) {
        String str="nayan";

        //firstNonRepeatingElement(str);
        firstNonRepeatingElement1(str);
        //removeDuplicate1(str);
        //removeDuplicate2(str);
        //removeDuplicate3(str);
        //removeDuplicate4(str);
    }

    private static void firstNonRepeatingElement1(String str) {


    }

    private static void firstNonRepeatingElement(String str) {
        Map<Character,Integer> map=new LinkedHashMap<>();
        for (char c:str.toCharArray()){
            Integer count=map.get(c);
            if (count==null){
                map.put(c,1);
            }else {
                map.put(c,count+1);
            }
        }
        for (var entry:map.entrySet()){
            if (entry.getValue()==1){
                System.out.println(entry.getKey());
                break;
            }
        }
        List<Map.Entry<Character,Integer>> entries=new ArrayList<>(map.entrySet());
        Collections.sort(entries,Comparator.comparing(Map.Entry::getValue));
        System.out.println(entries);
        StringBuilder sb1=new StringBuilder();

        for (Map.Entry entry:entries){
            int cnt= (int) entry.getValue();
            char c= (char) entry.getKey();
            for (int i=0;i<cnt;i++){
              sb1.append(c);
                //System.out.print(entry.getKey());
            }
        }
        System.out.println(sb1);
    }

    private static void removeDuplicate4(String str) {
        Set<Character> set=new HashSet<>();
        for (int i=0; i<str.length();i++){
            set.add(str.charAt(i));
        }
        StringBuilder sb=new StringBuilder();
        for (Character c:set){
            sb.append(c);
        }
        System.out.println("removing element using set ");
        System.out.println(sb);
    }

    private static void removeDuplicate3(String str) {
        StringBuilder sb=new StringBuilder();
        str.chars().distinct().forEach(c->sb.append((char)c));
        System.out.println("removing duplicate element using java 8");
        System.out.println(sb);
    }

    private static void removeDuplicate2(String str) {
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<str.length();i++){
            boolean dup=false;
            for (int j=i+1;j<str.length();j++){
                if (str.charAt(i)==str.charAt(j)&&i!=j){
                    dup=true;
                    break;
                }
            }
            if (!dup){
                sb.append(str.charAt(i));
            }
        }
        System.out.println("after removing duplicate string will be :- ");
        System.out.println(sb);
    }

    private static void removeDuplicate1(String str) {
        StringBuilder sb=new StringBuilder();
        for (int i=0; i<str.length(); i++){
            char c=str.charAt(i);
            int idx=str.indexOf(c,i+1);

            if (idx==-1){
                sb.append(c);
            }
        }
        System.out.println("removing duplicage using indexOf method");
        System.out.println(sb);
    }
}
