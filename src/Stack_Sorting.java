import java.util.Scanner;
import java.util.Stack;
public class Stack_Sorting {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        sort(stack);
    }

    // Method to sort the elements of the stack in ascending order
    static void sort(Stack<Integer> stack) {

        Stack<Integer> tempStack = new Stack<>();
        tempStack.push(stack.pop());
        while (!stack.empty())
        {
            if(tempStack.peek()<stack.peek())
                tempStack.push(stack.pop());
            else
            {
                Integer temp  = stack.pop();
                while (!tempStack.empty() && tempStack.peek()>temp)
                {
                    stack.push(tempStack.pop());
                }
                tempStack.push(temp);
                while (!stack.empty() && stack.peek()>tempStack.peek())
                    tempStack.push(stack.pop());
            }
        }
        System.out.println(tempStack);
    }
}