import java.util.*;

public class KthLargest_Stack {
    // This function returns the sorted stack
    public static Stack < Integer > sortStack(Stack < Integer > input) {
        Stack<Integer> sortedStack = new Stack<>();
        while (!input.empty())
        {
            int temp = input.pop();
            while (!sortedStack.empty() && temp<sortedStack.peek())
            {
                input.push(sortedStack.pop());
            }
            sortedStack.push(temp);
        }
        return sortedStack;
    }

    public static void findKthLargestNum(Stack <Integer> sortedStack, int k) {
        while (k>1)
        {
            sortedStack.pop();
            k--;
        }
        System.out.println(sortedStack.peek());
    }


    public static void main(String args[]) {
        Stack < Integer > inputStack = new Stack < Integer > ();
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        for (int i = 0; i < n; i++) {
            inputStack.add( in .nextInt());
        }

        if (inputStack.isEmpty()) {
            System.out.println("stack is empty");
            System.exit(0);
        }

        int k = in .nextInt();
        if (k > inputStack.size()) {
            System.out.println("invalid input");
            System.exit(0);
        }

        // This is the temporary stack

        Stack < Integer > temp = sortStack(inputStack);
        findKthLargestNum(temp, k);

    }
}
