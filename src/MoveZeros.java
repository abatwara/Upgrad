import java.util.*;

public class MoveZeros {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        moveZerosToEnd(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    // Method to find move all zeros to the end of the array
    static void moveZerosToEnd(int[] arr) {
        int zero_count = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                zero_count++;
                for (int j=i;j<arr.length-zero_count;j++)
                {
                    int temp  = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
