package test;

import java.util.HashSet;
import java.util.Iterator;

public class ExamF implements Sample{

    public static void main(String args[]) {
        System.out.println(x);
        HashSet<String> s = new HashSet<>();
        final int i= 4;
        s.add("I");
        s.add("am an developer");
        s.add("and");
        s.add("test.Test");
        s.add("and");
        s.add("engineer");
//    i= 9;
//throws compile time error

        Iterator<String> itr = s.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        Sample.m2();
        m2();
    }

    public final void m1() {
        System.out.println("in final method");
    }

    @Override
    public void add() {

    }

    static void m2() {
        System.out.println("in implemented class m2");
    }
}
