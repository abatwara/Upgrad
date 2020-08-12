import java.util.Scanner;
class HCF
{
public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    // Enter number 1 in the Input Console
    int num1 = scan.nextInt();
    // Enter number 2 in the Input Console
    int num2 = scan.nextInt();

    int hcf;
    // Write logic
    if(num1<num2)
    {
        hcf = num1;
    }
    else {
        hcf = num2;
    }
    for (int i=hcf;i>0;i--)
    {
        if(num1%i==0&&num2%i==0)
        {
            hcf = i;
            break;
        }
    }
    System.out.print(hcf);
    scan.close();
}
}