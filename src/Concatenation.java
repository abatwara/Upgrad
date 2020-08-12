import java.util.Scanner;
public class Concatenation {

    public static void main(String[] args) {

        String name;
        int year;
        Scanner input= new Scanner(System.in);
        name=input.nextLine();
        year=input.nextInt();
System.out.println("Hello "+name+"\nFree services till:"+(year+4));
    }
}
