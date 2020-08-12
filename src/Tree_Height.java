import java.util.Scanner;

class Node2 {
    int data;
    Node2 left, right;

    Node2(int value) {
        data = value;
        left = right = null;
    }
}

class Tree2  {
    Node2 root;

    Tree2 () {
        root = null;
    }

    // Method to construct a binary Tree2  from the given array
    public Node2 insertNode(int[] elementsArr, Node2 node, int i) {
        if(i < elementsArr.length){
            node = new Node2(elementsArr[i]);
            node.left = insertNode(elementsArr,node.left,2 * i + 1);
            node.right = insertNode(elementsArr,node.right,2 * i + 2);
        }
        return node;
    }

    // Method to find the height of a binary Tree2 
    public int findHeight(Node2 node) {
        int height;
        if(node==null)
            return 0;
        else
        {
            return getHeight(node,0);
        }

    }
    public int getHeight(Node2 node, int height)
    {
        if(node==null)
            return height;

        height =  getHeight(node.left,height+1);
        return height;
    }
}

// WARNING: Do not edit the code given below; otherwise the test cases might fail
public class Tree_Height  {
    public static void main(String[] x) {
        Tree2  Tree2  = new Tree2 ();

        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        if (size < 0){
            System.out.println("Size should be a positive integer");
        }

        else{
            int[] elementsArr = new int[size];
            for(int i = 0; i < size; i++) {
                elementsArr[i] = sc.nextInt();
            }

            Tree2 .root = Tree2 .insertNode(elementsArr, Tree2 .root, 0);

            System.out.println(Tree2 .findHeight(Tree2 .root));
        }
    }
}