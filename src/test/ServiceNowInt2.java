package test;

import java.io.CharConversionException;
import java.util.ArrayList;
import java.util.List;

public class ServiceNowInt2 {
    public static void main(String args[]){
        String s= "tstattttttheetsht";  //satttttttttheesh
        char arr[]= s.toCharArray();
        String fin="";
        String res="";
        int in=0;
        for(int i=0; i<s.length(); i++){

            String temp=""+s.charAt(i);
            for(int j=i+1; j<s.length(); j++){
                if(s.charAt(i)==s.charAt(j)){
                    temp=temp+s.charAt(j);
                }else{
                    break;
                }
            }
            if(fin.length()<temp.length()){
                fin=temp;
                in=i;
            }
        }
       //swapping  tstattttttheetsht
        List<Integer> li= new ArrayList<>();
       for(int i=0; i<arr.length; i++){
           if(arr[i]==fin.charAt(in)){
               li.add(i);
           }
       }
       System.out.println(li);
       for(int i=0; i<in; i++){
           if(!(li.contains(i))){
               res=res+s.charAt(i);
           }
       }
       int si= (in-res.length())+fin.length();
       System.out.println(si);

       for(int i=0; i<si; i++){
           res= res+fin.charAt(in);
       }

        System.out.println(in+fin.length());
        String temp="";
        for(int i=res.length(); i<s.length(); i++){
            if(!(li.contains(i))){
                temp=temp+s.charAt(i);
            }
        }
        int s2= s.length()-(temp.length()+res.length());
        System.out.println(s2);
        for(int i=0; i<s2; i++){
            res= res+fin.charAt(in);
        }
        res= res+temp;
        System.out.println(res);
    }
}
