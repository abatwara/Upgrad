import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Partition_neg_pos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        partitionNegativeAndPositive(n, arr);
    }

    // Method to partition negative and positive numbers without comparing with 0
    static void partitionNegativeAndPositive(int n, int arr[]) {
        List<Integer> l1 = new ArrayList();
        List<Integer> l2 = new ArrayList();
        l1.add(arr[0]);
        for(int i=1;i<n;i++) {
            if ((arr[0] ^ arr[i]) < 0) {
                l2.add(arr[i]);
            } else {
                l1.add(arr[i]);
            }
        }
        for(int i : l1)
            System.out.print(i+" ");
        System.out.println();
        if(l2.size()==0)
        {
            if(l1.get(0)>=0)
                System.out.println("Array doesn't have negative numbers");
            else
                System.out.println("Array doesn't have positive numbers");
        }
        else {
            for (int i : l2)
                System.out.print(i + " ");
        }

    }
}
