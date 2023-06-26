package test;

public class SortingOf2Arrays {

    public static void  main(String args[]) {
        int a[]= {1,3,5,7,8};
        int b[]= {2,3,4,6,8};
        int res[] = new int[a.length+b.length];
        int count=0;

        //Merging of 2 arrays
//        for(int i=0; i<a.length; i++) {
//            res[i]= a[i];
//        }
//        int c=0;
//        for(int i=a.length; i<res.length; i++) {
//            res[i]= b[c];
//            c++;
//        }

      //// Bubble sort
//        for(int i=0; i<res.length; i++) {
//            int temp=0;
//            for(int j=i+1; j<res.length; j++) {
//                if(res[i]>res[j]) {
//                    temp= res[i];
//                    res[i]=res[j];
//                    res[j]= temp;
//                    count++;
//                }
//            }
//        }

//        //Insertion sort
//        int fin[]= new int[res.length];
//        for(int i=0; i< res.length; i++) {
//            int key= res[i];
//            int j=i-1;
//            while(j>=0 && res[j]>=key) {
//                res[j+1]= res[j];
//                j=j-1;
//                count++;
//            }
//            res[j+1]= key;
//        }

        for (int s: a) {
            System.out.print(s+ " ");
        }
        System.out.println(count);
    }
}
