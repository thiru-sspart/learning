package test;

public class ConstructorEx extends OverloadEx {
    ConstructorEx() {
       // this(1);
        System.out.println("In this con");
    }

    ConstructorEx(int a) {
        System.out.println(a);
    }

    public static void main(String args[]) {
        ConstructorEx e= new ConstructorEx();
    }
}
