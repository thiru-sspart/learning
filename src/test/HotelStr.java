package test;

import java.util.Arrays;

public class HotelStr {
    public static void main(String args[]) {
        int arrl[] = {1, 2, 10, 5, 5};
        int exit[] = {4, 5, 12, 9, 12};
        int n = arrl.length;
        findMaxGuests(arrl, exit, n);
    }

    static void findMaxGuests(int arrl[], int exit[], int n){
        Arrays.sort(arrl);
        Arrays.sort(exit);
        int i=1; int j=0;
        int guest_in= 1;
        int time= arrl[0];
        int max_g=1;
        while(i<n && j<n){
            if(arrl[i]<=exit[j]){
                guest_in++;
                if(guest_in>max_g){
                    max_g=guest_in;
                    time=arrl[i];
                }
                i++;
            }else{
                guest_in--;
                j++;
            }
        }
        System.out.println(max_g);
    }
}
