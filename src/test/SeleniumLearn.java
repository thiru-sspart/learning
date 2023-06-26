package test;

import java.util.ArrayList;
import java.util.List;

public class SeleniumLearn {
    public static void main(String args[]) {
        String input = "my name is thiru";
        String t= input.replaceAll(" ", "");
        String temp="";
        for(int i=t.length()-1; i>=0; i--){
            temp= temp+t.charAt(i);
        }
        String output="";
        List<Integer> in= new ArrayList();
        for(int i=0; i<input.length(); i++){
//            if(input.charAt(i) != null){
//            }else
//                in.add(i);
        }

        for(int i=0; i< input.length(); i++){
            int j= temp.length()-1;
            if(i==in.get(i)){
                output= output+" ";
            }
        }
//        output= output+temp.charAt(j);


    }
}
