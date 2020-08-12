import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Enter the two numbers in the input console
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        System.out.print(lcm(number1, number2));
    }
    public static int lcm(int num1,int num2)
    {
        int lcm_num;
        if(num1>num2)
        {
            lcm_num = num1;
        }
        else
        {
            lcm_num = num2;
        }

        while (true)
        {
            if(lcm_num%num1==0&&lcm_num%num2==0)
            {
                break;
            }
            lcm_num++;
        }
        return lcm_num;
    }
}
