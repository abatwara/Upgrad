import java.util.Arrays;
import java.util.Scanner;

class Node8
{
    int value;
    Node8 leftchild, rightchild;

    Node8(int item)
    {
        value = item;
        leftchild = rightchild = null;
    }
}

class BinaryTree4
{
    Node8 root;
    static int preIndex = 0;
    static int index=0;

    Node8 constructTree(int in[], int pre[], int inStrt, int inEnd)
    {
        if (inStrt > inEnd)
            return null;

        Node8 tNode8 = new Node8(pre[preIndex++]);

        if (inStrt == inEnd)
            return tNode8;

        int inIndex = search(in, inStrt, inEnd, tNode8.value);

        tNode8.leftchild = constructTree(in, pre, inStrt, inIndex - 1);
        tNode8.rightchild = constructTree(in, pre, inIndex + 1, inEnd);

        return tNode8;
    }

    int search(int arr[], int strt, int end, int value)
    {
        int i;
        for (i = strt; i <= end; i++)
        {
            if (arr[i] == value)
                return i;
        }
        return i;
    }

    int sumBinaryTree4(Node8 Node8)
    {
        if(Node8==null)
            return 0;
        if(Node8.leftchild==null&&Node8.rightchild==null)
            return Node8.value;
        else
            Node8.value+=sumBinaryTree4(Node8.leftchild)+sumBinaryTree4(Node8.rightchild);
        return Node8.value;
    }

    void printPostorder(Node8 Node8)
    {
        if (Node8 == null)
            return;

        // first recur on left subtree
        printPostorder(Node8.leftchild);

        // then recur on right subtree
        printPostorder(Node8.rightchild);

        // now deal with the Node8
        System.out.print(Node8.value + " ");
    }

    void inOrder(Node8 Node8, int array[])
    {
        if (Node8 == null)
            return;
        inOrder(Node8.leftchild, array);
        array[index++] = Node8.value;
        inOrder(Node8.rightchild, array);

    }

    Node8 ArrayToBST(int arr[], int start, int end) {
        if(start>end)
            return null;
        int mid = (start+end)/2;
        Node8 Node8 = new Node8(arr[mid]);
        if(start==end)
            return Node8;
        //int index = search(arr,start,end,Node8.value);

        Node8.leftchild = ArrayToBST(arr,start,mid-1);
        Node8.rightchild  = ArrayToBST(arr,mid+1,end);
        return Node8;
    }
}
class Tree_BalancedBST{

    // driver program to test above functions
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int in[] = new int[len];
        int pre[] = new int[len];
        for(int i=0;i<len;i++){
            in[i] = scanner.nextInt();
        }
        for(int i=0;i<len;i++){
            pre[i] = scanner.nextInt();
        }
        BinaryTree4 tree = new BinaryTree4();
        Node8 root = tree.constructTree(in, pre, 0, len - 1);
        tree.sumBinaryTree4(root);
        int inSumTree[] = new int[len];
        tree.inOrder(root, inSumTree);
        Arrays.sort(inSumTree);
        Node8 bstRoot = tree.ArrayToBST(inSumTree, 0, len-1);
        tree.printPostorder(bstRoot);

    }
}
