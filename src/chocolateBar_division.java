import java.util.Scanner;

public class chocolateBar_division {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int d = s.nextInt();
        int m = s.nextInt();
        numberOfSubArrays(arr, n, d, m);
    }
    // Method to find number of subarrays of size m whose sum of elements is d
    static void numberOfSubArrays(int[] arr, int n, int d, int m) {
        int ways = 0;
        int newSum = 0;
        int oldSum = 0;
        for (int i = 0; i < n; i++) {
            if (i >= m) {
                newSum = oldSum - arr[i - m] + arr[i];
                oldSum = newSum;
            } else {
                oldSum = oldSum + arr[i];
            }
            if(i>=m-1 && (oldSum==d||newSum==d))
            {
                ways++;
            }
        }
        System.out.println(ways);
    }
}