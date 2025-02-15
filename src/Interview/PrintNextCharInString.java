package Interview;

public class PrintNextCharInString {

    public static void main(String args[]) {
        String in ="crazy";

        String a[]= in.split("");

        for(int i=0; i<a.length; i++){
            if(in.charAt(i) == 'z')
                System.out.print('a');
            else{
                Character temp = in.charAt(i);
                System.out.print((char)(temp.hashCode()+1));
            }
        }
    }
}
