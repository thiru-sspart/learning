package test;

public class Reverse {
    public static void main(String args[]) {
//        String s = "This is Java";
//        String sp1[] = s.split(" ");
//        for(int i=sp1.length-1; i>=0; i--) {
//            System.out.print(sp1[i] + " ");
//        }
//
//        String go= "sihT si avaJ";
        String a = "he is he";
        String sp[]= a.split(" ");
        String res ="";
        for(int i=sp.length-1; i>=0;i--){
            res= res+sp[i]+" ";
        }
        res=res.trim();
        if(res.equals(a)) {
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }


}
