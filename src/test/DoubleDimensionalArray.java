package test;

public class DoubleDimensionalArray {
    public static void main(String args[]) {
        int a[][] = { {1,2,3,4},
                      {5,6,7,8}};

      // To print pairs not in same or col
        int tr= 11;
        for(int i=0; i<a.length; i++) {
            for(int j=0; j<a[0].length; j++) {
                for(int k=i; k<a.length; k++){
                    for(int l=0; l<a[0].length; l++){
                        if(i!=k && j!=l && a[i][j]+a[k][l]==tr){
                            System.out.println(a[i][j]+" "+a[k][l]);
                        }
                    }
                }
            }
        }

        // To print pairs not in same row or col
        for(int i=0; i<a.length; i++) {
            for(int j=0; j<a[0].length; j++) {
                for(int k=i; k<a.length; k++){
                    for(int l=0; l<a[0].length; l++){
                        if(a[i][j]+a[k][l]==tr){
                            System.out.println(a[i][j]+" "+a[k][l]);
                        }
                    }
                }
            }
        }


    }
}
