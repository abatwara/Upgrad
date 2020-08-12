import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Contiguous_HashSet {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();

        //array to store the input elements
        int[] array = new int[n];

        //storing the elements to the array
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        if(array.length==0)
            System.out.println(false);
        else {
            // Write your code here
            Set<Integer> hashset = new HashSet<>();
            for (int i = 0; i < array.length; i++)
                hashset.add(array[i]);

            int count = 0;
            int current = array[0];
            while (hashset.contains(current)) {
                count++;
                current--;
            }
            current = array[0] + 1;
            while (hashset.contains(current)) {
                count++;
                current++;
            }
            if (count == hashset.size())
                System.out.println(true);
            else
                System.out.println(false);
        }
    }
}
