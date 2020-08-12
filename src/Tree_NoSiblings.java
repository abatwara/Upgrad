import java.util.Scanner;

class Node7 {
    int data;
    Node7 left, right;

    Node7(int value) {
        data = value;
        left = right = null;
    }
}

class BinaryTree2 {
    Node7 root;

    BinaryTree2() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    // A recursive function to insert a new key in BST
    Node7 insertRec(Node7 root, int key) {

        if (root == null) {
            root = new Node7(key);
            return root;
        }

        if (key < root.data)
            root.left = insertRec(root.left, key);
        else if (key > root.data)
            root.right = insertRec(root.right, key);

        return root;
    }

    //Function to print Node7s that dont have a sibling
    void printSingles(Node7 Node7) {
        if(Node7==null)
            return;
        if(Node7.left!=null&&Node7.right==null) {
            System.out.print(Node7.left.data + " ");
            printSingles(Node7.left);
        }
        else if(Node7.left==null&&Node7.right!=null) {
            System.out.print(Node7.right.data + " ");
            printSingles(Node7.right);
        }else{
            printSingles(Node7.left);
            printSingles(Node7.right);

        }
    }
}

// WARNING: Do not edit code below this; failing which your solution may not pass the test case(s)
public class Tree_NoSiblings {
    public static void main(String args[]) {
        BinaryTree2 tree = new BinaryTree2();

        Scanner sc = new Scanner(System.in);
        int size;
        size = sc.nextInt();

        if(size<= 0){
            System.out.println("Size should be a positive integer");
        }

        else{
            int[] elementsArr = new int[size];
            for(int i = 0; i < size; i++){
                elementsArr[i] = sc.nextInt();
                tree.insert(elementsArr[i]);
            }
            tree.printSingles(tree.root);
        }
    }
}