import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Files {
    public static void main(String args[]) throws FileNotFoundException
    {
        File f = new File("C:\\Upgrad_PGD\\quiz_numbers.txt");
        Scanner scan = new Scanner(f);
        int sum = 0;
        int count = 0;
        while (scan.hasNext())
        {
            sum+=scan.nextInt();
            count++;

        }
        double avg = (double) sum/(double) count;
        System.out.println(count);
        System.out.println(avg);
    }
}
