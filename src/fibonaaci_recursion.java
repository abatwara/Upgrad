import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.util.Scanner;

public class fibonaaci_recursion {

    public static void main(String args[]) throws Exception
    {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
       System.out.println( fibonacci(num));
    }

    static int fibonacci(int n)
    {
        if(n<2)
            return n;
        else
            return (fibonacci(n-1)+fibonacci(n-2))%10;
    }
}
