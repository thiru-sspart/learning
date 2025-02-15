package Interview;

// Return first word with the greatest nu,ber of repaeted letters

//eg: hello apple pie --> hello has 2l, apple has 2p but hello is first --> output: hello

//If mo repeated lettters return -1


public class Int1 {
      String s= "This is Thiru";
      String sk="";
      public static void main(String args[]) {

            System.out.println(serachingChallnege("No Words"));
      }

      public static String serachingChallnege(String s) {
            int maxLetter =0;
            String result="";
            String ar[]= s.split(" ");
            for(int i=0; i<ar.length; i++) {
                  int num= solve(ar[i]);
                  if(num>maxLetter){
                        maxLetter= num;
                        result= ar[i];
                  }
            }
            if("".equals(result)){
                  return "-1";
            }
            return result;
      }

      static int solve(String s) {
            int[] ar = new int[256];
            int n= s.length();
            for(int i=0; i<n; i++){
                  ar[s.charAt(i)]++;
            }
            int maxLetter = -1;
            for(int i=0; i<n; i++){
                  int e= ar[s.charAt(i)];
                  if(maxLetter<e){
                        maxLetter= e;
                  }
            }
            return maxLetter;
      }
}
