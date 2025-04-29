package serviceNowInte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Hacker4 {

    //welcometojava , 3 substring length
    //op: [wel, elc, lco, com, ome, met, eto, toj, oja, jav, ava]
    //ava wel  ==> find smallest  & largest substring

    public static void main(String args[]) {
        String s= "welcome to java";
        s= s.replaceAll(" ", "");
        int l=3;

        ArrayList li= new ArrayList();
        ArrayList li1= new ArrayList();
        for(int i=0; i<s.length()-2; i++){
            li.add(s.substring(i, i+3));
            li1.add(s.substring(i, i+3));
        }
        System.out.println("unsorted array:" +li);

        Collections.sort(li);
        System.out.println("sorted list"+li);

        System.out.println(li.get(0)+"  "+ li.get((li.size())-1));

        //Second method

        sortUsingHascode(li1);
        System.out.println(li1.getFirst()+"  "+ li1.getLast());
    }

    public static List<String> sortUsingHascode(List<String> li) {

        for(int i=0; i<li.size(); i++){
            for(int j=i+1; j<li.size(); j++){
                if(li.get(i).charAt(0)>li.get(j).charAt(0)) {
                    String temp= li.get(i);
                    li.set(i, li.get(j));
                    li.set(j, temp);
                }
            }
        }
        System.out.println("sorted list"+li);

        return li;
    }
}
