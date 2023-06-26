package test;

public class FirstOccuInString {
    public static void main(String args[]) {
        String  haystack = "hello";
        String needle = "ll";
        if(haystack.contains(needle)){
            for(int i=0; i<haystack.length(); i++){
                String sam= haystack.substring(i, i+needle.length());
                if(sam.equals(needle)){
                    System.out.println(i);
                    System.out.println(3/2);
                    break;
                }

            }
        }else{
           System.out.println(-1);
        }
    }
}
