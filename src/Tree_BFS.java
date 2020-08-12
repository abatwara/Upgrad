import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


class Node3 {
    int data;
    Node3 left, right;

    public Node3(int value) {
        data = value;
        left = right = null;
    }
}

class BinaryTree3 {

    Node3 root;

    BinaryTree3(){
        root = null;
    }

    // Method to construct a binary Tree3 from the given array
    public Node3 insertNode3(int[] elementsArr, Node3 Node3, int i){
        if(i < elementsArr.length){
            Node3 = new Node3(elementsArr[i]);

            Node3.left = insertNode3(elementsArr,Node3.left,2 * i + 1);
            Node3.right = insertNode3(elementsArr,Node3.right,2 * i + 2);
        }
        return Node3;
    }

    // Method to find the largest value in the Tree3
    public int findMax(Node3 Node3)
    {
        int max = Integer.MIN_VALUE;
        if(Node3==null)
            return -1;
        else {
            Queue<Node3> queue = new LinkedList<>();
            queue.add(Node3);
            while (!queue.isEmpty())
            {
                Node3 temp = queue.remove();
                if(max< temp.data)
                    max = temp.data;
                if(temp.left!=null)
                    queue.add(temp.left);
                if(temp.right!=null)
                    queue.add(temp.right);
            }
            return max;
        }
    }
}
// WARNING: Do not edit the code given below; otherwise the test cases might fail
public class Tree_BFS{
    public static void main(String[] x){
        BinaryTree3 Tree3 = new BinaryTree3();

        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        if(size == 0){
            System.out.println("-1");
        }

        else if (size < 0){
            System.out.println("Size should be a positive integer");
        }

        else{
            int[] elementsArr = new int[size];
            for(int i = 0; i < size; i++){
                elementsArr[i] = sc.nextInt();
            }

            Tree3.root = Tree3.insertNode3(elementsArr,Tree3.root,0);

            System.out.println(Tree3.findMax(Tree3.root));
        }
    }
}