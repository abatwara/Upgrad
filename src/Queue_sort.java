import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Queue_sort {
    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            queue.add(s.nextInt());
        sort(queue);
    }

    // Method to sort the queue
    static void sort(Queue<Integer> queue) {
        Queue<Integer> tempQ = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty())
        {
            int temp = queue.remove();
            while (!stack.isEmpty()&&stack.peek()<temp)
            {
                queue.add(stack.pop());
            }
            stack.push(temp);
        }
        while (!stack.empty())
            tempQ.add(stack.pop());
        System.out.println(tempQ);

    }
}