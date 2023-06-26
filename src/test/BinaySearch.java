package test;

public class BinaySearch {

    public static  void  main(String args[]) {
        int ar[]= {1,3,5,7,9,11, 13, 14};
        System.out.println(ret(ar, 0, ar.length-1, 11));
    }

    public static int ret(int ar[], int init, int max, int se) {
        if(max>=init) {
            int mid= (init+max)/2;

            if(ar[mid] ==  se) {

                
                return mid;
            }
            if(ar[mid] > se) {
                return ret(ar, init, mid-1, se);
            }
            return ret(ar, mid+1, max, se);
        }
        return -1;
    }
}