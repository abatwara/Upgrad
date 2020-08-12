
import java.util.Scanner;
class Fib_DP {
    static int fib(int n) {
        /* Declare an array to store Fibonacci numbers */
        /* Assign the 0th, 1st, and 2nd numbers of the Fibonacci series to 0, 1, and 2 respectively */
        /* Add the previous three numbers in the series, and store them */
        /* Return the nth element in the series */
        int a = 0, b = 1, c = 2;
        int d = a + b + c;
        switch (n) {
            case 1: {
                return a;
            }
            case 2: {
                return b;
            }
            case 3: {
                return c;
            }
            default: {

                for (int i = 5; i <= n; i++) {
                    a = b;
                    b = c;
                    c = d;
                    d = a + b + c;
                }

                return d;
            }
        }
    }

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        // Enter the number n
        int n = scan.nextInt();
        System.out.println(fib(n));
        scan.close();
    }
}