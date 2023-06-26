package test;

public class StringsEx {

    public static void main(String args[]) {
        String s= new String("hellow");
        s.concat("hi");
        System.out.println(s);
        String s1= "Hwllo";
        s1.concat("hi");
        System.out.println(s1);
        String s2= new String("hellow");
        StringBuilder str = new StringBuilder("Hi");
        str.append("Hi");
        System.out.println(str);

    }
}
