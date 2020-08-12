import java.util.*;

public class LinkedList_add {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int n) {
            data = n;
            next = null;
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        head = null;
        if (n > 0) {
            head = new Node(s.nextInt());
            Node temp = head;
            for (int i = 1; i < n; i++) {
                temp.next = new Node(s.nextInt());
                temp = temp.next;
            }
        }
        int k = s.nextInt();
        int index = s.nextInt();
        addAtGivenIndex(k, index);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    // Method to add the element at the front of the LinkedList
    static void addAtGivenIndex(int k, int index) {
        int count = 1;
        Node temp = head;
        Node newnode = new Node(k);
        if(head==null)
        {
            head = newnode;
        }
        else

        {

            while (count!=index)
            {

                temp = temp.next;
                count++;
                if(temp.next==null)
                    break;

            }
            newnode.next = temp.next;
            temp.next = newnode;
        }
    }
}
