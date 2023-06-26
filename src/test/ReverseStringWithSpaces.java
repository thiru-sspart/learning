package test;

import java.util.ArrayList;
import java.util.List;

public class ReverseStringWithSpaces {
    public static void main(String args[]) {
        String s= "My name is Thiru";
        String temp= s.replaceAll(" ", "");
        StringBuffer fin= new StringBuffer();
        List<Integer> li = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==' '){
                li.add(i);
            }
        }
        for(int i=temp.length()-1; i>=0; i--){
            fin=fin.append(temp.charAt(i));
        }
        for(int i=0; i<li.size(); i++){
            fin = fin.insert(li.get(i), " ");
        }
        System.out.println(fin);


    }
}
