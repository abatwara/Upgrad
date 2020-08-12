import java.util.*;

//class representing Structure of node in the linked list
class Node {
    int data;
    Node next;
};

class Source {

    //creates a new node with the given 'data' and returns that node
    Node newNode(int data) {

        Node newNode = new Node();

        newNode.data = data;
        newNode.next = null;

        return newNode;
    }

    // Driver program to test above
    public static void main(String args[]) {

        //array list whose each element is the head of each linked list
        ArrayList<Node> arr = new ArrayList<>();
        Source obj = new Source();

        Scanner in = new Scanner(System.in);

        // Number of linked lists
        int k = in.nextInt();

        // Number of elements in each linked list
        int n = in.nextInt();

        Node tmp = null;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {

                //head node of the linked list
                if (j == 0) {
                    int dt = in.nextInt();
                    arr.add(obj.newNode(dt));
                } else {
                    int dt = in.nextInt();
                    tmp = arr.get(i);
                    for (int m = 1; m < j; m++) {
                        tmp = tmp.next;
                    }
                    tmp.next = obj.newNode(dt);
                }
            }
        }

        Node head = mergeKSortedLists(arr, k);
        printList(head);
    }

    public static Node mergeKSortedLists(
            ArrayList<Node> arr, int k) {
        Node head = null, last = null;

        // priority_queue 'pq' implemeted
        // as min heap with the
        // help of 'compare' function
        PriorityQueue<Node> pq
                = new PriorityQueue<>(
                new Comparator<Node>() {
                    public int compare(Node a, Node b) {
                        return a.data - b.data;
                    }
                });

        // push the head nodes of all
        // the k lists in 'pq'
        for (int i = 0; i < k; i++)
            if (arr.get(i) != null)
                pq.add(arr.get(i));

        // loop till 'pq' is not empty
        while (!pq.isEmpty()) {
            // get the top element of 'pq'
            Node top = pq.peek();
            pq.remove();

            // check if there is a node
            // next to the 'top' node
            // in the list of which 'top'
            // node is a member
            if (top.next != null)
                // push the next node in 'pq'
                pq.add(top.next);

            // if final merged list is empty
            if (head == null) {
                head = top;
                // points to the last node so far of
                // the final merged list
                last = top;
            } else {
                // insert 'top' at the end
                // of the merged list so far
                last.next = top;

                // update the 'last' pointer
                last = top;
            }
        }
        // head node of the required merged list
        return head;
    }

    // function to print the singly linked list
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}

