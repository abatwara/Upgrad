import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of users registered in UpgradBook : ");
        int size = scanner.nextInt();
        int key = scanner.nextInt();
        int[] userIDs = new int[size+1];
        System.out.println("Please enter the userID of users registered in UpgradBook : ");
        for (int i = 1; i <= size; i++) {
            userIDs[i] = scanner.nextInt();
        }
        //int index = findIndex(userIDs,key);
        int index = findEndIndex(userIDs,1,2,key);
        //int index = binarySearch(userIDs,4,5,5);
        if(index!=-1)
            System.out.println(index);
        else
            System.out.println("NOT_FOUND");
    }
    static int binarySearch(int arr[], int start, int end, int key)
    {
        if (end>=start)
        {
            int mid = start + (end - start)/2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] > key)
                return binarySearch(arr, start, mid - 1, key);
            else
                return binarySearch(arr, mid + 1, end, key);
        }
        return -1;
    }
    static int findIndex(int[] inputArr, int key) {

        int start = 1;
        int end = 2;
        int endvalue = inputArr[end];
        while (endvalue < key) {
            start = end;
            end = 2 * end;
            try {
                endvalue = inputArr[end];
            } catch (ArrayIndexOutOfBoundsException e) {
                break ;
            }
        }
        return binarySearch(inputArr, start, end, key);
    }
    static int findEndIndex(int[] inputArr, int start, int end, int key) {
        try {
            int endvalue = inputArr[end];
            if (endvalue < key && start!=end)
                return findEndIndex(inputArr, end, 2 * end, key);
            else
                return binarySearch(inputArr, start, end, key);
        } catch (ArrayIndexOutOfBoundsException e) {
            return findEndIndex(inputArr, start, (start + (end - start) / 2), key);
        }
    }
}
