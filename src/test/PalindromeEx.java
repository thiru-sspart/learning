package test;

public class PalindromeEx {
    public static void main(String args[]) {
        int x= 1331;
//        int sum=0;
//        while(x>0){
//            int n= x%10;
//            sum= sum*10+n;
//            x=x/10;
//        }
//        System.out.println(sum);

//        StringBuilder s= new StringBuilder(String.valueOf(x));
//        System.out.println(s);
//        System.out.println(s.reverse());
//        String th = ""+s.reverse();
//        System.out.println(s.equals(th));
//        if(s.equals(s.reverse())){
//            System.out.println("pass");
//        }

        String st = String.valueOf(x); // Convert to String
        int n = st.length(); // Store the String length to int n

        for (int i=0; i<n/2; i++) {
            // We check whether the elements at the same distance from
            // beginning and from ending are same, if not we return false
            if (st.charAt(i) != st.charAt(n-i-1))
                System.out.println(st.charAt(n-i-1));
                System.out.println("flase");
        }

        // if no flaws are found we return true
        System.out.println("true");

    }
}
