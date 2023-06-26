package test;

public  interface Sample {
    int x=10;
     void add();

     static void m2() {
         System.out.println("in m2");
     }

     default int addI() {
         return 0;
     }
}
