
import java.util.Scanner;
class MergeSort_descending {

    public static void main(String ss[]) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray1 = scanner.nextInt();
        int sizeArray2 = scanner.nextInt();
        int sortedArray1[] = getArrayInput(sizeArray1, scanner);
        int sortedArray2[] = getArrayInput(sizeArray2, scanner);
        int descendingMerge[]=mergeBothInDescendingOrder(sortedArray1, sortedArray2);

        for(int i=0;i<descendingMerge.length;i++)
        {
            System.out.println(descendingMerge[i]);
        }
    }
    public static int[] getArrayInput(int size,Scanner sc)
    {
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static int[] mergeBothInDescendingOrder(int[] arr1,int[] arr2)
    {
        int[] merged = new int[arr1.length+arr2.length];
        int i=arr1.length-1,j=arr2.length-1;
        int k=0;
        while (i>=0&&j>=0)
        {
            if(arr1[i]>arr2[j])
            {
                merged[k] = arr1[i];
                i--;
            }
            else
            {
                merged[k] = arr2[j];
                j--;
            }
            k++;
        }
        while (i>=0)
        {
            merged[k] = arr1[i];
            i--;
            k++;
        }
        while (j >=0)
        {
            merged[k] = arr2[j];
            j--;
            k++;
        }
        return merged;
    }
}