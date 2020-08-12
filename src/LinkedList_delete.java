import java.util.*;

public class LinkedList_delete {
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
        int index = s.nextInt();
        deleteNodeAtGivenIndex(index);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    // Method to delete the node at the given index of the LinkedList
    static void deleteNodeAtGivenIndex(int index) {
        int count = 1;
        Node temp = head;
        Node prev = head;
        if(head !=null)
        {
            if(index==1)
            {
                head = head.next;
            }
            else {
                while (count != index) {
                    prev = temp;
                    temp = temp.next;
                    if (temp == null) {
                        return;
                    }
                    count++;
                }
                prev.next = temp.next;
            }
        }
    }
}
