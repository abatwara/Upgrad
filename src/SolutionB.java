import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class SolutionB {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of users registered in UpgradBook : ");
        int size = scanner.nextInt();
        System.out.println("Please enter the userID to be searched in UpgradBook : ");
        int key = scanner.nextInt();
        int[] userIDs = new int[size+1];
        System.out.println("Please enter the userID of users registered in UpgradBook : ");
        for (int i = 1; i <= size; i++) {
            userIDs[i] = scanner.nextInt();
        }
        int index = searchUserID(userIDs,key);
        if(index!=-1)
            System.out.println("User ID is present at Index: "+index);
        else
            System.out.println("NOT_FOUND");
    }

    /**
     * This method is needed so user doesn't need to worry about passing start and end values
     * @param arr - Array containg the UserIDs of the students
     * @param key - userid to be searched in Array
     * @return - index of the userId found
     */
    static int searchUserID(int[] arr, int key) {
        // this is needed when there is no element in the array
        //using try catch as can't check lenght of the array
        try {
            int firstelement = arr[1];
        } catch (ArrayIndexOutOfBoundsException e) {
            return -1;
        }
        //this is needed when array has only 1 element
        try {
            int lastElement = arr[2];
            return findIndex(arr, 1, 2, key);
        } catch (ArrayIndexOutOfBoundsException e) {
            if (arr[1] == key)
                return 1;
            else
                return -1;
        }

    }

    /**
     * This method will find the limited range of starta and end and call binary search.
     * @param inputArr Array containg the UserIDs of the students
     * @param start - start of the array
     * @param end - next index of start as end of the array is not known
     * @param key - userid to be searched in Array
     * @return - index of the userId found
     */
    static int findIndex(int[] inputArr, int start, int end, int key) {
        try {
            int endvalue = inputArr[end];
            if (endvalue < key && start<end)
                return findIndex(inputArr, end, 2 * end, key);
            else
                return binarySearch(inputArr, start, end, key);
        } catch (ArrayIndexOutOfBoundsException e) {
            return findIndex(inputArr, start, (start + (end - start) / 2), key);
        }
    }

    /**
     * This is general binary search which can be applied after getitng the start and end values
     * @param arr Array containg the UserIDs of the students
     * @param start - start of the range where key can be found
     * @param end - end of the range where key can be found
     * @param key - userid to be searched in Array
     * @return - index of the userId found
     */
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

}
