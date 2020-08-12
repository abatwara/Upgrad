
import java.util.Scanner;
class BubbleSort_swaps {
    static int totalBubbleSortSwaps(int[] array, int M) {

        int size = array.length;
        int var = 0;
        int totalSwaps = 0;
        for (int i=0; i < M; i++)
        {
            for (int j=1;j<size-i;j++)
            {
                if(array[j-1]<array[j])
                {
                    var = array[j];
                    array[j] = array[j-1];
                    array[j-1] = var;
                    totalSwaps++;
                }
            }
        }

        return totalSwaps;
    }

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int iteartions = scanner.nextInt();
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(totalBubbleSortSwaps(array,iteartions));
    }
}
