import java.util.Scanner;


class Node6 {
    int data;
    Node6 left, right;

    Node6(int value) {
        data = value;
        left = right = null;
    }
}

class BST1 {
    Node6 root;

    BST1() {
        root = null;
    }

    // Method to construct a binary Tree6 from the given array
    void insert(int key) {
        root = insertRec(root, key);
    }

    // A recursive function to insert a new key in BST1
    Node6 insertRec(Node6 root, int key) {

        if (root == null) {
            root = new Node6(key);
            return root;
        }

        if (key < root.data)
            root.left = insertRec(root.left, key);
        else if (key > root.data)
            root.right = insertRec(root.right, key);

        return root;
    }

    // Method to find the lowest common ancestor of two Node6s - n1 and n2
    Node6 lca(Node6 Node6, int n1, int n2) {
        if(Node6==null)
            return null;
        if(n1<Node6.data&&n2<Node6.data)
            return lca(Node6.left,n1,n2);
        else if(n1>Node6.data&&n2>Node6.data)
            return lca(Node6.right,n1,n2);
        else
            return Node6;

    }
}

// WARNING: Do not edit the code given below; otherwise the test cases might fail
public class Tree_LCA {
    public static void main(String[] x) {
        BST1 BST1 = new BST1();

        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        if(size>0){
            int[] elementsArr = new int[size];
            for(int i = 0; i < size; i++) {
                elementsArr[i] = sc.nextInt();
                BST1.insert(elementsArr[i]);
            }

            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            Node6 lca = BST1.lca(BST1.root, n1, n2);
            System.out.print(lca.data);
        }
        else
            System.out.println("Size should be a positive integer");
    }
}