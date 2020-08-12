import java.util.Scanner;
import java.util.Stack;

class DuplicateParanthesis {
    public static String findDuplicateParenthesis(String inputString) {
        Stack<Character> stack = new Stack<>();
        boolean dup = false;
        for(int i=0;i<inputString.length();i++)
        {
            if(inputString.charAt(i)!=')')
                stack.push(inputString.charAt(i));
            else if(!stack.empty() && stack.peek()!='(')
            {
                while (!stack.empty() && stack.pop()!='(') {
                    continue;
                }
            }
            else
            {
                dup=true;
            }
            if(dup)
                break;
        }
        if(dup)
            return "Input string contains duplicate parenthesis";
        else
            return "Input string does not contain duplicate parenthesis";
    }


    public static void main(String[] args){
        DuplicateParanthesis obj = new DuplicateParanthesis();
        String inputString = new String();
        Scanner in = new Scanner(System.in);
        inputString = in.nextLine();
        System.out.println(obj.findDuplicateParenthesis(inputString));

    }

}

