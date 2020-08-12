
import java.util.*;

public class factorial_lastdigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print(lastNonZeroDigit(n));
    }

    // Method to find the last digit of n!
    static int lastNonZeroDigit(int n) {
        n = fact(n);
        while (n % 10 == 0 && n > 0)
            n = n / 10;
        return n % 10;
    }

    static int fact(int n) {
        if (n == 0)
            return 1;
        else
            return n * fact(n - 1);
    }
}
