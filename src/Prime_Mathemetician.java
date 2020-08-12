import java.util.Arrays;
import java.util.Scanner;

public class Prime_Mathemetician {
    public static void main(String args[]) {
        System.out.println("Enter the number : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean arr[] = new boolean[n];
        Arrays.fill(arr, true);
        int m = 1;
        for (int p = 2, i = 2; p <= n; p++) {
            while (i < n) {
                if (!arr[i]) {
                    i++;
                    m = 1;
                } else if (m * p == i) {
                    arr[i] = false;
                    m++;
                }
                i++;
            }
            if (arr[p]) {
                System.out.println(p);
            }
        }
    }
}
