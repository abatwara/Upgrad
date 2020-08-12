import java.util.Scanner;

public class TwoPerson {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int p1 = s.nextInt();
        int p2 = s.nextInt();
        int s1 = s.nextInt();
        int s2 = s.nextInt();
        twoPeopleMeet(p1, p2, s1, s2);
    }

    // Method to find whether two people meet after jumping for the same number of times
    static void twoPeopleMeet(int p1, int p2, int s1, int s2) {

        if(s1==s2)
            System.out.println("NO");
        else if((p1>p2 && s1>s2) || (p2>p1 && s2>s1))
            System.out.println("NO");
        else if((p1-p2)%(s2-s1)==0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
