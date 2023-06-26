package test;

import java.util.HashSet;
import java.util.Set;

public class SetsEx {
    public static void main(String args[]) {
//        Set<Integer> set = new HashSet<>();
//        set.add(1);
//        set.add(2);
//        for (Integer a:set) {
//            System.out.println(a);
//        }

        //test.Duplicates using sets
        String s= "bacdhd";
        Set<Character> seen = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            if(!(seen.add(s.charAt(i)))){
                System.out.println(s.charAt(i));
                break;
            }else{
                seen.add(s.charAt(i));
            }
        }
    }
}
