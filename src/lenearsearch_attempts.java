import java.util.*;
class lenearsearch_attempts {
    public int getLinearSearchUnsuccessfulComparisonCount(int[] inputArr, int key) {
        // Write your code here

        int attempts = 0;
        for(int i=0;i<inputArr.length;i++)
        {
            if(inputArr[i]==key)
                break;
            else
                attempts++;
        }
        return attempts;
    }
    public static void main(String args[] ) throws Exception {
        lenearsearch_attempts bs = new lenearsearch_attempts();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        System.out.println(bs.getLinearSearchUnsuccessfulComparisonCount(array, key));
    }
}



