import java.util.Random;

import java.util.Arrays;
import java.util.Random;


class QuickSort {
    public static void main(String args[]) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        sort(arr);
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void sort(int[] arr)
    {
        quicksort(arr,0,arr.length-1);
    }
    public static void quicksort(int[] arr,int start, int end)
    {
        if (start<end)
        {
            int p = partition(arr,start,end);
            quicksort(arr,start,p-1);
            quicksort(arr,p+1,end);
        }
    }
    public static int partition(int[] arr,int start, int end)
    {
        int pivot = arr[end];
        int p=start;
        for(int i=start;i<end;i++)
        {
            if(arr[i]>pivot)
            {
                int temp = arr[i];
                arr[i] = arr[p];
                arr[p] = temp;
                p++;
            }

        }
        int temp = arr[p];
        arr[p] = arr[end];
        arr[end] = temp;
        return p;
    }
}

