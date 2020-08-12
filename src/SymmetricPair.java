import java.util.HashMap;
import java.util.Scanner;

        import java.util.HashMap;
        import java.util.Scanner;

class SymmetricPair {

    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);

        //number of pairs in the array
        int n = in.nextInt();
        int arr[][] = new int[n][2];

        // store the input pairs to an array "arr"
        for (int i = 0; i < n; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }
        HashMap<Integer,Integer> map  = new HashMap<>();
        boolean symmetric = false;
        for(int i=0;i<arr.length;i++)
        {

            if(map.get(arr[i][1])!=null&&map.get(arr[i][1])==arr[i][0])
            {
                symmetric = true;
                System.out.println(arr[i][1]+" "+arr[i][0]);
            }
            else {
                map.put(arr[i][0],arr[i][1]);
            }

        }
        if(!symmetric)
            System.out.println("No Symmetric pair");

    }
}
