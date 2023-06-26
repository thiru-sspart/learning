package test;

public class InsertionSortEx {

    public static void main(String args[]) {
        int ar[]= {5,2,8,4,1};

//        int res[]= new int[ar.length];

        for(int i=1; i< ar.length; i++) {
            int key= ar[i];
            int j=i-1;
            while(j>=0 && ar[j]>=key) {
                ar[j+1]= ar[j];
                j=j-1;
            }
            ar[j+1]= key;

        }
        for (int re:ar
             ) {
           System.out.println(re);
        }

    }

}
