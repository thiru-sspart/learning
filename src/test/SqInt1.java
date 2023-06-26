package test;

public class SqInt1 {
    public static void main(String args[]) {
        re(1);

    }
    public static void re(int in){
        if(in<=10){
            System.out.println(in);
            in++;
            re(in);
        }

    }
}
