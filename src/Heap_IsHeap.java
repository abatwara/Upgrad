import java.util.Scanner;

public class Heap_IsHeap {
    public static boolean  isHeap(int[] arr,  int n){
        //Write your code here
        //Check if the array element is less than it's child element in the array,
        //and if they are less return false else return true

        for(int i=0;i<n;i++)
        {
            int left_child = 2*(i+1)-1;
            int right_child = 2*(i+1);
            if(left_child<n&&right_child<n&&(arr[i]<arr[left_child]||arr[i]<arr[right_child]))
                return false;
        }
        return true;
    }
    public static int[] getArrayInput(int size, Scanner scanner) {
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray1 = scanner.nextInt();
        int arr[] = getArrayInput(sizeArray1, scanner);
        int n = arr.length;
        String x = isHeap(arr, n)? "Yes": "No";

        System.out.println(x);
    }

}
