import java.util.Scanner;

class Node5 {
    int data;
    Node5 left, right;

    Node5(int value) {
        data = value;
        left = right = null;
    }
}

class Tree5 {
    Node5 root;

    Tree5() {
        root = null;
    }

    // Method to construct a binary Tree5 from the given array
    public Node5 insertNode5(int[] elementsArr, Node5 Node5, int i) {
        if(i < elementsArr.length){
            Node5 = new Node5(elementsArr[i]);
            Node5.left = insertNode5(elementsArr,Node5.left,2 * i + 1);
            Node5.right = insertNode5(elementsArr,Node5.right,2 * i + 2);
        }
        return Node5;
    }

    // Method to traverse the elements of a Tree5 using BFS (level-order traversal) in the spiral order
    void spiralOrder() {
        int height = getheight(root);
        boolean ltr = false;
        for(int i=1;i<=height;i++)
        {
            printlevelordertraversal(root,i,1,ltr);
            ltr = !ltr;
        }

    }
    void printlevelordertraversal(Node5 Node5, int level, int currentlevel, boolean ltr)
    {
        if(Node5==null)
            return;
        if(level==currentlevel)
            System.out.print(Node5.data+" ");
        else {
            if (ltr) {
                printlevelordertraversal(Node5.left, level, currentlevel + 1, ltr);
                printlevelordertraversal(Node5.right, level, currentlevel + 1, ltr);
            } else {
                printlevelordertraversal(Node5.right, level, currentlevel + 1, ltr);
                printlevelordertraversal(Node5.left, level, currentlevel + 1, ltr);
            }
        }
    }
    int getheight(Node5 Node5)
    {
        if(Node5==null)
            return 0;
        int leftheight = 1+getheight(Node5.left);
        int rightheight = 1+getheight(Node5.right);
        if(leftheight>=rightheight)
            return leftheight;
        else
            return rightheight;
    }
}

// WARNING: Do not edit the code given below; otherwise the test cases might fail
class Tree_Spiral_Traversal {
    public static void main(String[] x) {
        Tree5 Tree5 = new Tree5();

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

            Tree5.root = Tree5.insertNode5(elementsArr, Tree5.root, 0);

            Tree5.spiralOrder();
        }
    }
}