package test;

import java.util.regex.*;
public class RegularExp {
    public static void main(String args[]) {
        Pattern pa = Pattern.compile("\\d*[0-9]");
        Matcher m = pa.matcher("65");
        System.out.println(m.matches());

        Pattern pa1 = Pattern.compile("\\d*[a-z][A-Z]");
        Matcher m1 = pa1.matcher("gfgfd");
        System.out.println(m1.matches());
    }
}
