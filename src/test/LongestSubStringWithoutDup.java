package test;

public class LongestSubStringWithoutDup {
    public static void main(String args[]) {
        String s= "pwwkew";
        int lar=0;
        for(int i=0; i<s.length(); i++){
            int res=0;
            String temp= ""+s.charAt(i);
            for(int j=i+1; j<s.length(); j++){
                if(!(temp.contains(""+s.charAt(j)))){
                    temp= temp+s.charAt(j);
                }else{
                    break;
                }
            }
            res= temp.length();
            if(lar<res){
                lar= res;

            }
        }
        System.out.println(lar);

    }
}
