package serviceNowInte;

public class Hacker1 {

    //Given a string , print the compressed string
    //Eg: "aabbcaa  op: "a2b2c1a2"

    public static void main(String args[]) {
        String s= "aabccaa";
        String res="";

        for(int i=0; i<s.length(); i++) {
            res= res+s.charAt(i);
            int count=1;
            for(int j=i+1; j<s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    count++;
                }else{
                    break;
                }
            }
            res= res+count;
            i=i+count-1;
        }
        System.out.println(res);
    }
}
