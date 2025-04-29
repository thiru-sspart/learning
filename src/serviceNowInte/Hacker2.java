package serviceNowInte;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Hacker2 {

    //get subsequence in string

    //String s1= abc, s2 = abcbabc  --> op: 5 outcomes of abc

    //a b c b a b c
    //0 1 2 3 4 5 6

    // 0 1 2         --> 1
    // 0 1         6 -->2
    // 0     3     6 -->3
    // 0         5 6  --> 4
    //         4 5 6 --> 5

   public static void main(String args[]) {
    String s= "abcbabc";
    String res= "abc";
    ArrayList<String> li= new ArrayList<>();
   for(int i=0; i<s.length(); i++) {
    if(s.charAt(i) == res.charAt(0)){
     for(int j=i+1; j<s.length(); j++){
       for(int k=j+1; k<s.length(); k++){
        li.add(""+s.charAt(i)+s.charAt(j)+s.charAt(k));
       }
     }
    }
   }
   int count= li.stream().filter(n-> n.equals(res)).collect(Collectors.toList()).size();
    System.out.println(count);
   }
 }

