import java.util.*;

public class ThirdLargest {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        thirdMaxInteger(arr);
    }

    // Method to find the third maximum integer in the array
    static void thirdMaxInteger(int[] arr) {
        if(arr.length<3)
        {
            System.out.println("The array doesn't have a third maximum element");
        }
        else
        {
            int max = 0,smax = 0,tmax = 0;
            for (int i=0;i<arr.length;i++)
            {
                if(arr[i]>max)
                {
                    tmax = smax;
                    smax = max;
                    max = arr[i];

                }
                else if(arr[i]>smax)
                {
                    tmax = smax;
                    smax = arr[i];

                }
                else if(arr[i]>tmax)
                {
                    tmax = arr[i];
                }
            }
            if(tmax==smax || smax==max)
            {
                System.out.println("The array doesn't have a third maximum element");
            }
            else
            {
                System.out.println(tmax);

            }

        }
    }
}