package javaprograms;

import java.util.*;

public class StringProgramms {
    public static void main(String[] args) {
        String name= "rammayyannnn";

        removeDuplicate1(name);
        removeDuplicate2(name);
        removeDuplicate3(name);
        removeDuplicate4(name);
        countEachCharacter(name);
        findMaxOccuringCharacter(name);
        findDuplicateCharacterInString(name);
        countEachCharAndArangeinAsc(name);
        arrangeEachCharAndArangeinAsc(name);

    }

    private static void arrangeEachCharAndArangeinAsc(String name) {
        Map<Character,Integer> map= new HashMap<>();
        for (char c :name.toCharArray()){
            Integer count=map.get(c);
            if (count==null){
                map.put(c,1);
            }else{
                map.put(c,count+1);
            }
        }
        StringBuilder sb= new StringBuilder();
        List<Map.Entry<Character,Integer>> entries=new ArrayList<>(map.entrySet());
        //Collections.sort(entries,Comparator.comparing(Map.Entry::getValue));
        Collections.sort(entries,(e1,e2)->e1.getValue().compareTo(e2.getValue()));
       // Collections.sort(entries,(e1,e2)->e1.getKey().compareTo(e2.getKey()));

        for(var entry:entries){
            char c= entry.getKey();
            int count=entry.getValue();
            for (int i=0;i<count;i++){
                sb.append(c);
            }

        }
        System.out.println(sb);

    }

    private static void countEachCharAndArangeinAsc(String name) {
        Map<Character,Integer> map= new HashMap<>();
        for (char c :name.toCharArray()){
            Integer count=map.get(c);
            if (count==null){
                map.put(c,1);
            }else{
                map.put(c,count+1);
            }
        }
        System.out.println("Frequency of each character :- ");
        List<Map.Entry<Character,Integer>> entries=new ArrayList<>(map.entrySet());
        //Collections.sort(entries,(e1,e2)->e1.getValue().compareTo(e2.getValue()));
        Collections.sort(entries,Comparator.comparing(Map.Entry::getValue));

        System.out.println(entries);
    }

    private static void findDuplicateCharacterInString(String name) {
        Map<Character,Integer> map= new HashMap<>();
        for (char c :name.toCharArray()){
            Integer count=map.get(c);
            if (count==null){
                map.put(c,1);
            }else{
                map.put(c,count+1);
            }
        }
        System.out.println("Duplicate Characters are :- ");
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }
    }

    private static void findMaxOccuringCharacter(String name) {
        Map<Character,Integer> map= new HashMap<>();
        for (char c :name.toCharArray()){
            Integer count=map.get(c);
            if (count==null){
                map.put(c,1);
            }else{
                map.put(c,count+1);
            }
        }

        int maxCount=0;
        char maxChar='0';
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()>maxCount){
                maxCount= entry.getValue();
                maxChar= entry.getKey();
            }
        }
        System.out.println("Maximum Occuring Character is "+maxChar + " and it occures "+maxCount+" times");
    }

    private static void countEachCharacter(String name) {
        Map<Character,Integer> map= new HashMap<>();
        for (char c :name.toCharArray()){
            Integer count=map.get(c);
            if (count==null){
                map.put(c,1);
            }else{
                map.put(c,count+1);
            }
        }
        System.out.println("Counting of each character in string:- ");
        for (Map.Entry<Character,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }
    }

    private static void removeDuplicate4(String name) {
        StringBuilder sb4=new StringBuilder();
        for (int i=0;i<name.length();i++){
            char c=name.charAt(i);
            int idx=name.indexOf(c,i+1);
            if (idx==-1){
                sb4.append(c);
            }
        }
        System.out.println(sb4);
    }

    private static void removeDuplicate3(String name) {
        StringBuilder sb3=new StringBuilder();
        Set<Character> set=new LinkedHashSet<>();
        for (int i=0;i<name.length();i++){
            set.add(name.charAt(i));
        }
        for(Character c:set){
            sb3.append(c);
        }
        System.out.println(sb3);
    }

    private static void removeDuplicate2(String name) {
        StringBuffer sb=new StringBuffer();
        name.chars().distinct().forEach(c->sb.append((char) c));
        System.out.println(sb.toString());
    }

    private static void removeDuplicate1(String name) {
        StringBuffer sb1=new StringBuffer();
        for (int i=0; i<name.length();i++){
            boolean duplicate=false;
            for (int j=i+1; j<name.length();j++){
                if (name.charAt(i)==name.charAt(j)){
                    duplicate=true;
                    break;
                }
            }
            if (!duplicate){
                sb1.append(name.charAt(i));
            }
        }
        System.out.println(sb1);


    }
}
