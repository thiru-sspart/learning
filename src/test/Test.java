package test;

import java.util.Arrays;

public class Test {
    public static void main(String args[]) {
       String num = "145318";
       Test t = new Test();
       System.out.println(t.getLargeNum(num));
    }

    public int getLargeNum(String num) {
        int res[]= new int[num.length()-1];
        for(int i=0; i<num.length()-2; i++) {
           res[i]= Integer.parseInt(num.charAt(i)+""+num.charAt(i+1));
        }
        Arrays.sort(res);
        return res[res.length-1];
    }
}
