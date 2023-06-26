package test;

import java.util.Arrays;

public class Median {
    public static void main(String args[]) {
        int nums1[]= {1,3};
        int nums2[]= {2,4};
        int res[] = new int[nums1.length+nums2.length];
        for(int i=0; i<nums1.length; i++){
            res[i]= nums1[i];
        }
        for(int j=0; j<nums2.length; j++){
            res[nums1.length+j]= nums2[j];
        }
        Arrays.sort(res);
       int mid= res.length/2;
        if(res.length%2==0){
           double sum= res[mid-1]+res[mid];
           double s= (sum/2);
           System.out.println(s);
        }else{
            double s= (double)res[mid];
            System.out.println(s);
        }
    }
}
