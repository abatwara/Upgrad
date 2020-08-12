
import java.util.*;

public class Queue_LinkiedList {
    class Node {
        char data;
        Node next;
        public Node(char new_data) {
            data = new_data;
            next = null;
        }
    }

    Node top;

    // Push and pop operations
    public void push(char new_data) {

        Node new_node = new Node(new_data);
        if (top == null) {

            top = new_node;
        } else {
            new_node.next = top;
            top = new_node;


        }
    }

    public Node pop() {
        Node node = top;
        top = top.next;
        return node;
    }

    // prints contents of stack
    public void display(Node node) {
        Node temp = node;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // Reverses the stack using simple
    // linked list reversal logic.
    public Node reverse() {
        Node current = top;
        Node next = null;
        Node prev = null;
        while (current!=null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        top = prev;
        return top;
    }

    public static void main(String[] args) {
        Queue_LinkiedList obj = new Queue_LinkiedList();
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        for (int i = 0; i < n; i++) {
            obj.push( in .next().charAt(0));

        }
        if(n==0)
        {
            System.out.println("the stack is empty");
        }
        else {
            obj.display(obj.top);
            System.out.println(" ");
            // reverse
            Node temp = obj.reverse();
            obj.display(temp);
        }

    }
}