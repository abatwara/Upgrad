
import java.util.Scanner;
class DP_JumpingJack
{
    public static int minJump(int n)
    {
        int f[] = new int[n+1];
        /* Declare an array to store the minimum jumps. */
        /* Initialise the base condition */
        f[0]=0;
        f[1]=0;
        /* fill in the array to find Minimum Jumps from a certain distance */
        for(int i=2;i<=n;i++)
        {
            if(i%2==0 && i%3==0)
                f[i]=1+Math.min(f[i/2]+1,f[i/3]);
            else if(i%2==0)
                f[i]=Math.min(f[i/2],f[i-1])+1;
            else if(i%3==0)
                f[i]=Math.min(f[i/3],f[i-1])+1;
            else
                f[i]=f[i-1]+1;

        }
        return f[n];
    }

    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        int distance = scan.nextInt();
        if(distance>0){
            System.out.println(minJump(distance));
        }
        else {
            System.out.println("Distance should be a positive integer");
        }

    }
}
