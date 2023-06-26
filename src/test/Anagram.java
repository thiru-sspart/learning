package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Anagram {
    public static void main(String args[]) {
        String s1= "army";
        String s2= "mary";

       char a1[] = s1.toCharArray();
       char a2[] = s2.toCharArray();
       Arrays.sort(a1);
       Arrays.sort(a2);
        if(Arrays.equals(a1, a2)) {
            System.out.println("test.Anagram");
        }else {
            System.out.println("Not test.Anagram");
        }
    }
}
