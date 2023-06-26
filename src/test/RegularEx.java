package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegularEx {
    public static void main(String args[]) {
        String s= "df74@6*g?5hy5t47A";
       String re[]= s.split("[@*?]+");
        for (String r:re
             ) {
           System.out.print(r);
        }
       // System.out.println(re.toString());

    }
}
