
import java.util.HashMap;
        import java.util.Map;
        import java.util.Scanner;
        import java.util.Stack;

class InfixToPostfix{

    public static void main(String arg[]) {
        Stack<Character> s = new Stack<Character>();
        Scanner in = new Scanner(System.in);
        Map<Character,Integer> operator = new HashMap<>();
        operator.put('^',3);
        operator.put('/',2);
        operator.put('*',2);
        operator.put('+',1);
        operator.put('-',1);

        String exp = in.nextLine();
        String postfix = "";
        for(int i=0;i<exp.length();i++)
        {
            Character ch = exp.charAt(i);
            if(ch=='(')
                s.push(ch);
            else if(ch==')') {
                while (!s.empty()&& s.peek() != '(')
                    postfix += s.pop();
                s.pop();
            }
            else if(operator.keySet().contains(ch))
            {
                while (!s.empty()&& operator.keySet().contains(s.peek()) &&operator.get(s.peek())>=operator.get(ch))
                {
                    postfix+=s.pop();
                }
                s.push(ch);
            }
            else
                postfix+=ch;
        }
        while (!s.empty())
            postfix+=s.pop();
        System.out.println(postfix);
    }

}
