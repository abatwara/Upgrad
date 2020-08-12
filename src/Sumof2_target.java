import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Sumof2_target
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);

        // number of the elements
        int n = in.nextInt();

        int array[] = new int[n];

        //storing the input integers to an array
        for(int i =0;i<n;i++){
            array[i] = in.nextInt();
        }

        // getting the target sum from input
        int targetSum = in.nextInt();
        boolean flag = false;
        Set<Integer> hashset = new HashSet<>();
        for(int i=0;i<array.length;i++) {
            if (hashset.contains(targetSum - array[i])) {
                flag = true;
                break;
            } else
                hashset.add(array[i]);
        }
        System.out.println(flag);

    }
}
