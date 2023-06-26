package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Duplicates {
    public static void main(String args[]) {
       String s= "thtuhths";

        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
           if(map.containsKey(s.charAt(i))){
               map.put(s.charAt(i), map.get(s.charAt(i))+1);
           }else{
               map.put(s.charAt(i), 1);
           }
       }
        System.out.println(map.size());
//        for (Map.Entry<Character, Integer> m : map.entrySet()) {
//            if(m.getValue() == 3) {
//                System.out.println(m.getKey());
//        }getKey

        }
    }
//}
