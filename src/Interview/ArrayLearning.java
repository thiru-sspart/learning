package Interview;

public class ArrayLearning {

    public static void main(String args[]) {
         int ar[] = {1,2,3,4,5,6,7};

         int sum=0;
         for(int i=0; i<ar.length; i++){
             System.out.println(ar[i]);
             sum=sum+ar[i];
         }
         System.out.println(sum);

         int arr[]= new int[10];

         arr[0]=1;
         arr[9]= 2;

         int arrdo[][] = {{1,2}, {3,4,}};

         for(int i=0; i<arrdo.length; i++){
             for(int j=0; j<arrdo[0].length; j++){
                 System.out.println(arrdo[i][j]);
             }
             System.out.println("");
         }
    }
}
