package test;

public class FibnoanciEx {

    public static void main(String args[]) {
        int l= 10;

        int[] res = new int[10];
        res[0]=0;
        res[1]=1;

        for(int i=2; i<l; i++){
            res[i]= res[i-2]+res[i-1];
        }

        for(int k:res){
            System.out.print(k+" ");
        }
    }
}
