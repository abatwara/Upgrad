
import java.util.*;

class Queue_MaxAtLast{
    static Queue<Integer> q = new LinkedList<Integer>();

    public static void func() {

        List<Integer> list = new ArrayList<>();
        while (!q.isEmpty())
            list.add(q.remove());
        int temp = Integer.MIN_VALUE;
        for(int num : list)
        {
            if(num>temp)
                temp=num;
        }
        for(int num : list)
        {
            if(num!=temp)
                q.add(num);
        }
        q.add(temp);

    }

    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int j = 0; j < n; j++) {
            q.add(in.nextInt());
        }
        func();
        System.out.println(q);
    }
}
