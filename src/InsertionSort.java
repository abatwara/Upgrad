import java.util.Scanner;

class InsertionSort {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        array = insertionSort(array);
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }

    static int[] insertionSort(int[] arr)
    {
        int n = arr.length;
        int count=0;
        for(int i=1;i<n;i++)
        {
            int j=i;
            while (j>0 && arr[j-1]>arr[j])
            {
                count++;
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        System.out.println(count);
        return arr;
    }
}
