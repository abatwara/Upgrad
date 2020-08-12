import java.util.Scanner;
class Node4 {
    int data;
    Node4 left, right;

    Node4(int value) {
        data = value;
        left = right = null;
    }
}

class Tree4 {
    Node4 root;

    Tree4() {
        root = null;
    }

    // Method to construct a binary Tree4 from the given array
    public Node4 insertNode4(int[] elementsArr, Node4 Node4, int i) {
        if(i < elementsArr.length){
            Node4 = new Node4(elementsArr[i]);
            Node4.left = insertNode4(elementsArr,Node4.left,2 * i + 1);
            Node4.right = insertNode4(elementsArr,Node4.right,2 * i + 2);
        }
        return Node4;
    }

    // Method to print the Tree4 in pre-order traversal
    void preOrderDFS(Node4 Node4) {
        if (Node4 == null)
            return;

        // visit the parent Node4 (parent of left & right children)
        System.out.print(Node4.data + " ");
        // recursively go to left subTree4
        preOrderDFS(Node4.left);
        // recursively go to right subTree4
        preOrderDFS(Node4.right);
    }

    // Method to convert a given binary Tree4 into its mirror image
    public void mirror(Node4 Node4) {
        if(Node4==null)
            return;
        mirror(Node4.left);
        mirror(Node4.right);
        Node4 temp = Node4.left;
        Node4.left = Node4.right;
        Node4.right = temp;
    }
}

// WARNING: Do not edit the code given below; otherwise the test cases might fail
class Tree_mirror {
    public static void main(String[] x) {
        Tree4 Tree4 = new Tree4();

        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        if(size <= 0){
            System.out.println("Size should be a positive integer");
        }

        else{
            int[] elementsArr = new int[size];
            for(int i = 0; i < size; i++) {
                elementsArr[i] = sc.nextInt();
            }

            Tree4.root = Tree4.insertNode4(elementsArr, Tree4.root, 0);

            Tree4.mirror(Tree4.root);

            Tree4.preOrderDFS(Tree4.root);
        }
    }
}