package test;

public class LargestSubArray {
    public static void main(String args[]) {
        int in[]= {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSoFar =0;
        int maxEndingHere =0;

        for(int i: in){
            maxEndingHere= maxEndingHere+i;

            maxEndingHere= Integer.max(maxEndingHere, 0);
            maxSoFar= Integer.max(maxSoFar, maxEndingHere);
        }

        System.out.println(maxSoFar);

    }
}
