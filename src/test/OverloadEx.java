package test;

public class OverloadEx {

    OverloadEx() {
        System.out.println("in parent constrctor");
    }
    public void add() {
        System.out.println(" in add woth 0 prarameters");
    }

    public int add(int a, int b) {
        return a+b;
    }

    public int add(int a) {
        return a;
    }

    public void add(String a) {
        System.out.println(a);
    }
    public String add(String b, String a) {
        return b+a;
    }
    public static void main(String args[]) {
        OverloadEx e= new OverloadEx();
        e.add();
        System.out.println(e.add(1));
        System.out.println(e.add(2,3));
      e.add("a");
        System.out.println(e.add("a", "b"));

    }
}
