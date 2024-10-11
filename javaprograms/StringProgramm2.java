package javaprograms;

import java.util.HashMap;
import java.util.Map;

public class StringProgramm2 {
    public static void main(String[] args) {


        // input= aabbbc || output= a2b3c1
        String str = "aabbbc";
        Map<Character,Integer> map= new HashMap<>();
        for (int i = 0; i < str.length();i++){
            char c=str.charAt(i);
            Integer count=map.get(c);
            if (count==null){
                map.put(c,1);
            }else {
                map.put(c,count+1);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            sb.append(entry.getKey());
            sb.append(entry.getValue());
        }
        System.out.println(sb);
    }

}
