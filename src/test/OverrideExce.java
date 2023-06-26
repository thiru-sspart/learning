package test;

public class OverrideExce extends OverrideEx {

    public  void sum() {
        super.sum();
        System.out.println("child class");
    }

    public static void main(String args[]) {
        OverrideExce e= new OverrideExce();
       e.sum();
//       super.

    }

}
