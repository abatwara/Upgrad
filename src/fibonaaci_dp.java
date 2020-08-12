import java.util.Scanner;

public class fibonaaci_dp {
    public static void main(String args[])
    {

        System.out.println(evenSum(10));

        }

        public static int evenSum(int n) {
        if(n <= 1)
            return 0;

        else if (n % 2 == 0)
            return (n + evenSum(n - 1));
        else
            return evenSum(n - 1);
    }

}
