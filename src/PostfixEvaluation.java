import java.util.Scanner;
import java.util.Stack;

class PostfixEvaluation{

    public static void main(String arg[]) {
        Stack<Integer> s = new Stack<Integer>();
        Scanner in = new Scanner(System.in);
        String exp = in.nextLine();
        int a, b;
        for(int i=0;i<exp.length();i++)
        {
            Character ch = exp.charAt(i);
            switch (ch)
            {
                case '^':
                    a= s.pop();
                    b = s.pop();
                    s.push(b^a);
                    break;
                case '/':
                    a= s.pop();
                    b = s.pop();
                    s.push(b/a);
                    break;
                case '*':
                    a= s.pop();
                    b = s.pop();
                    s.push(b*a);
                    break;
                case '+':
                    a= s.pop();
                    b = s.pop();
                    s.push(b+a);
                    break;
                case '-':
                    a= s.pop();
                    b = s.pop();
                    s.push(b-a);
                    break;
                default:
                    s.push(Integer.parseInt(ch.toString()));
            }
        }
        System.out.println(s.pop());
    }

}
