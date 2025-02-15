package Interview;

public class CompareVersions {

    public static void main(String args[]) {
        // 1.2.0 & 1.2.1  ---> -1
        //1.2.0 & 1.2.0   ---> 0
        //1.2.1 & 1.2.0  ----> 1
        System.out.println(compareString("1.5.45678", "1.5.4587"));
    }

    public static int compareString(String int1, String int2) {
        return -1;
    }
}
