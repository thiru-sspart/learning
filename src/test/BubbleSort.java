package test;

public class BubbleSort {
    public static void main(String args[]) {
        int ar[]= {5,4,3,2,1};
        for(int i=0; i<ar.length; i++) {
            for(int j=i+1; j<ar.length; j++) {
                int temp=0;
                if(ar[i] > ar[j]) {
                    temp= ar[i];
                    ar[i]= ar[j];
                    ar[j]= temp;
                }
                System.out.println(ar[i]+ "+"+ ar[j]);
            }
        }
        for (int a:ar
             ) {
            System.out.println(a);

        }
    }
}
