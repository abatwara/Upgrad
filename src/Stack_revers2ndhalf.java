import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;


public class Stack_revers2ndhalf {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        reverseSecondHalf(stack);
        System.out.println(stack);
    }

    // Method to reverse the last half of the elements from the bottom of the stack
    static void reverseSecondHalf(Stack<Integer> stack) {
        List<Integer> list = new ArrayList<>();
        int size = stack.size();
        while (stack.size()>Math.ceil(size/2.0))
        {
            list.add(stack.pop());
        }

        for(int n : list)
        {
            stack.push(n);
        }
    }

}