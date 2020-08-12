import java.util.LinkedList;
import java.util.Queue;

public class Queue_Sort_without_Extra_space {

    public static void main(String args[])
    {
        Queue<Integer> q = new LinkedList<>();
        q.add(5);
        q.add(1);
        q.add(3);
        q.add(4);
        q.add(2);
        int s = q.size();
        for(int j=0;j<s;j++)
        {
            int max_index = -1;
            int max_value = Integer.MIN_VALUE;
            for (int i = 0; i < s; i++)
            {
                int current = q.peek();
                q.poll();
                if (current >= max_value && i < s-j)
                {
                    max_index = i;
                    max_value = current;
                }
                q.add(current);
            }
            for (int i = 0; i < s; i++)
            {
                int current = q.peek();
                q.poll();
                if (i != max_index)
                    q.add(current);
                else
                    max_value = current;
            }
            q.add(max_value);
        }
        System.out.println(q);
    }
}
