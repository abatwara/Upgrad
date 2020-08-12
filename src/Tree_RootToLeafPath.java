import java.util.Scanner;

public class Tree_RootToLeafPath {

    public static class Node9
    {
        int data;
        Node9 left, right;

        Node9(int item)
        {
            data = item;
            left = right = null;
        }
    }

    public static class BinaryTree3
    {
        Node9 root;
        BinaryTree3() {
            root = null;
        }

        // Method to construct a binary tree from the given array (Do not edit the code given below)
        public Node9 insertNode9(int[] elementsArr, Node9 Node9, int i){
            if(i < elementsArr.length){
                Node9 = new Node9(elementsArr[i]);
                Node9.left = insertNode9(elementsArr,Node9.left,2 * i + 1);
                Node9.right = insertNode9(elementsArr,Node9.right,2 * i + 2);
            }
            return Node9;
        }

        void printPaths(Node9 Node9)
        {
            int path[] = new int[1000];
            print(Node9, path, 0);
        }

        void print(Node9 Node9, int path[], int pathLen)
        {
            if(Node9==null)
                return;
            path[pathLen] = Node9.data;
            pathLen++;
            if(Node9.left==null&&Node9.right==null)
                printArray(path,pathLen);
            else
            {
                print(Node9.left,path,pathLen);
                print(Node9.right,path,pathLen);
            }
        }

        void printArray(int ints[], int len)
        {
            int i;
            for (i = 0; i < len; i++)
            {
                System.out.print(ints[i] + " ");
            }
            System.out.println("");
        }

    }
    public static void main(String args[])
    {
        BinaryTree3 tree = new BinaryTree3();

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
            }
            tree.root = tree.insertNode9(elementsArr,tree.root,0);
            tree.printPaths(tree.root);
        }


    }
}