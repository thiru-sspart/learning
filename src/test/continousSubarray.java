package test;

public class continousSubarray {
    public  static void main(String args[]) {
        int a[]= {-2,-3,4,-1,-2,1,5,-3};
        System.out.println(subArraySum(a));
    }
    public static int subArraySum(int a[]) {
        int s= a.length;
        int max_so_far= Integer.MIN_VALUE, max_end=0;
        for(int i=0; i<s; i++){
            max_end=max_end+a[i];
            if(max_so_far<max_end){
                max_so_far=max_end;
            }
            if(max_end<0)
                max_end=0;
        }
        return max_so_far;
    }
}
