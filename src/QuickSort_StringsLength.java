import java.util.Scanner;

class QuickSort_StringsLength {

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String words[] = new String[size];
        for (int i = 0; i < size; i++) {
            words[i] = scanner.next();
        }
        quickSort(words,0,words.length-1);
        for (int i = 0; i < size; i++) {
            System.out.println(words[i].toString());
        }
    }
    public static void quickSort(String array[], int left, int right) {
        if (left < right) {
            int position = partition(array, left, right);
            quickSort(array, left, position - 1);
            quickSort(array, position + 1, right);
        }

    }
    public static int partition(String[] arr,int start, int end)
    {
        String pivot = arr[end];
        int p=start;
        for(int i=start;i<end;i++)
        {
            if(arr[i].length()<=pivot.length())
            {
                String temp = arr[i];
                arr[i] = arr[p];
                arr[p] = temp;
                p++;
            }
        }
        String temp = arr[end];
        arr[end] = arr[p];
        arr[p] = temp;
        return p;

    }
}

