package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicatesL {
    public static void main(String args[]) {
//        String s= "aagfedg";
//        char[] c= {'A', 'B'};
//        Map<Character, Integer> map= new HashMap<>();
//        for(int i=0; i<s.length(); i++) {
//            if(map.containsKey(s.charAt(i))) {
//                map.put(s.charAt(i), map.get(s.charAt(i))+1);
//            }else{
//                map.put(s.charAt(i), 1);
//            }
//        }
//
//        for (Map.Entry<Character, Integer> m: map.entrySet()) {
//           if(m.getValue() == 1) {
//               System.out.println(m.getKey());
//           }
//        }
        List<String> li = new ArrayList();
        li.add("a");
        li.add("b");

        if(li.contains("a")){
            System.out.println("done");
        }

    }
}
