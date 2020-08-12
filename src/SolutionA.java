import java.util.Scanner;

public class SolutionA {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of users registered in UpgradBook : ");
        int size = scanner.nextInt();

        int[] userIDs = new int[size+1];
        System.out.println("Please enter the userID of users registered in UpgradBook : ");
        for (int i = 1; i <= size; i++) {
            userIDs[i] = scanner.nextInt();
        }

        int index = binarySearchIndex(userIDs,1,userIDs.length-1);
        //if index is outside range means there is no instace where arr[index]=index
        if(index>0 && index<userIDs.length)
            System.out.println("The index where User ID is equal to it's index is: "+index);
        else
            System.out.println("NOT_FOUND");
    }

    /**
     *
     * This method will return the index where arr[index]=index.
     * @param arr Array containing the UserIDs of the students
     * @param start - start index of the array
     * @param end - end index of the array
     * @return - index where Index and UserID are same
     */
    static int binarySearchIndex(int arr[], int start, int end)
    {
        int index = start + (end - start)/2;
        if(end==0)
            return -1;
        if (end>=start)
        {
            //If index is found than we are discarding the right array as lesser element can be found in left array
            if (arr[index] == index)
                return binarySearchIndex(arr,start,index-1);
            else if (arr[index] > index)
                return binarySearchIndex(arr, start, index - 1);
            else
                return binarySearchIndex(arr, index + 1, end);
        }
        //finally it will be least index where arr[index]=index
        return index;
    }
}
