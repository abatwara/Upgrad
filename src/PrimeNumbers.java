import java.util.Scanner;


public class PrimeNumbers {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        primesLessThanOrEqualTon(n);
    }

    // Method to print all primes less than or equal to n in ascending order
    static void primesLessThanOrEqualTon(int n) {
        boolean prime = false;
        for(int i=2;i<=n;i++)
        {
            if(prime_check(13)) {
                System.out.print(i+" ");
                prime = true;
            }
        }
        if(!prime)
        {
            System.out.println("There are no prime numbers less than "+n);
        }
    }
    public static boolean prime_check(int n)
    {
        if(n<=1)
            return false;
        else if(n<=3)
            return true;
        else if(n%2==0||n%3==0)
            return false;
        int i=5;
        while (i<n)
        {
            if(n%i==0 || n%(i+2)==0)
                return false;
            i+=6;
        }
        return true;

    }
}

