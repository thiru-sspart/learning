package test;

public class subArray {
    public static void main(String args[]) {

        int arr[] = { 15, 2, 4, 8, 7, 5, 10, 27 };
        int n = arr.length;
        int sum = 23;
        subArraySum(arr, n, sum);
    }
    static  int subArraySum(int arr[], int n, int sum) {

        int c, i, j;
        for (i = 0; i < n; i++) {
            c = arr[i];
            for (j = i + 1; j <= n; j++) {
                if (c == sum) {
                    int p = j - 1;
                    System.out.println(i + " " + p);
                    return 1;
                }
                if (c > sum || j == n) {
                    break;
                }
                c = c + arr[j];
            }
        }
        System.out.println("No ");
        return 0;

    }
}
