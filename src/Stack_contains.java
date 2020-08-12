
import java.util.Scanner;
        import java.util.Stack;

public class Stack_contains {

    public static Boolean contains(Stack<Integer> sequence1, Stack<Integer> sequence2) {
        while (!sequence2.empty() && !sequence1.empty())
        {
            if (sequence1.peek()==sequence2.peek())
            {
                sequence2.pop();
                sequence1.pop();
            }
            else {
                sequence2.pop();
            }
        }
        if(sequence1.empty())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        Stack<Integer> sequence1 = new Stack<Integer>();
        Stack<Integer> sequence2 = new Stack<Integer>();
        int boxIndex = 0;
        for (String elem1 : line1.split(" ")) {
            sequence1.add(Integer.parseInt(elem1));
        }
        for (String elem2 : line2.split(" ")) {
            sequence2.add(Integer.parseInt(elem2));
        }
        Boolean isSubsequence = contains(sequence1, sequence2);
        System.out.println(isSubsequence);
    }
}
