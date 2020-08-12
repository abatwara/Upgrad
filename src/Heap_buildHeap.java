import java.util.Arrays;
import java.util.Scanner;

public class Heap_buildHeap {

    public static int leftchild(int i) {   //Get index of left child at index i
        return (2*i+1);
    }

    public static int rightchild(int i) {   //Get index of right child at index i
        return (2*i+2);
    }

    private static void heapify(int[] arr, int i, int n) {

        int l = leftchild(i);
        int r = rightchild(i);

        int smallest = i;
        int small_left = i;
        int small_right = i;

        if (l < n && arr[l] < arr[i] ) {
            small_left = l;
        }

        if (r < n && arr[r] < arr[i] ) {
            small_right = r;
        }
        if(arr[small_left]<arr[small_right])
            smallest = small_left;
        else
            smallest = small_right;
        if (smallest != i) {
            swap(arr, i, smallest);
            heapify(arr, smallest,n);
        }

    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void buildHeap(int[] arr){
        int i = arr.length-1;
        while (i >=0) {
            heapify(arr, i--, arr.length);
        }
    }

    public static int[] getArrayInput(int size, Scanner scanner) {
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sizeArray1 = scanner.nextInt();
        int arr[] = getArrayInput(sizeArray1, scanner);
        int n = arr.length;

        buildHeap(arr);

        System.out.println(Arrays.toString(arr));
    }
}

