import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

    public static int[] sort(int[] randomNumbers) {
        return mergeSort(randomNumbers, 0, randomNumbers.length - 1);
    }

    public static int[] mergeSort(int[] numbers, int first, int last) {
        // first denotes the starting index of the "numbers" array
        // last denotes the ending index of the "numbers" array
        if(first<last) {
            int m = (first + last) / 2;

            mergeSort(numbers, first, m);
            mergeSort(numbers, m+1, last);
            merge(numbers, first, last, m);
        }
        return numbers;
    }

    /// .......
    // Write the Merge function here which uses the merge sort to sort the array in decreasing order...
    /// .......

    public static int[] merge(int[] numbers, int first, int last, int m)
    {
        int n1 = m-first+1;
        int n2 = last-m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for(int i=0;i<n1;i++)
        {
            L[i] = numbers[first+i];
        }
        for(int i=0;i<n2;i++)
        {
            R[i] = numbers[m+1+i];
        }
        int k=first;
        int i=0;
        int j=0;
        while (i<L.length&& j<R.length)
        {
            if(L[i]>=R[j])
            {
                numbers[k] = L[i];
                i++;
            }
            else
            {
                numbers[k] = R[j];
                j++;
            }
            k++;
        }
        while (i<L.length)
        {
            numbers[k] = L[i];
            i++;
            k++;
        }
        while (j<R.length)
        {
            numbers[k] = R[j];
            j++;
            k++;
        }
        return numbers;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = scanner.nextInt();
        }
        int[] sortedNumbers;
        sortedNumbers = sort(randomNumbers);
        System.out.println(Arrays.toString(sortedNumbers));
    }
}
