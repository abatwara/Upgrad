import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StackUsingQueue {

    /*implementing queue using linked list */
    Queue< Integer > q = new LinkedList< Integer >();

    /* Push operation of stack using queue*/
    void push(int x) {
        int size = q.size();
        q.add(x);
        while (size>=1)
        {
            q.add(q.remove());
            size--;
        }

    }

    /*Removes the top element of the stack*/

    int pop() {
        if(q.isEmpty())
        {
            return -1;
        }
        return q.remove();
    }


    /*Returns the element at the top of the stack */
    int top() {
        if(q.isEmpty())
        {
            return -1;
        }
        return q.peek();
    }


    public static void main(String[] args) {
        StackUsingQueue obj = new StackUsingQueue();
        Scanner in = new Scanner(System.in);

        /*Enter the number of elements you want to add in the stack */

        int n = in .nextInt();

        /*Enter the elements of the stack */
        for (int i = 0; i < n; i++) {
            obj.push( in .nextInt());
        }

        if(obj.top()!=-1) {
            System.out.println(obj.top());
            obj.pop();
            if (obj.top() != -1)
                System.out.println(obj.top());
            else
                System.out.println("Stack is empty");
        }
        else
            System.out.println("Stack is empty");
    }
}