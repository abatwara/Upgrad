import java.util.Scanner;

class Insertionsort_String {

    public static void main(String ss[]) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String firstNames[] = new String[size];
        String lastNames[] = new String[size];
        for (int i = 0; i < size; i++) {
            firstNames[i] = scanner.next().toLowerCase();
        }
        for (int i = 0; i < size; i++) {
            lastNames[i] = scanner.next().toLowerCase();
        }

        for(int i=1;i<size;i++)
        {
            int j=i;

            while (j>0 && firstNames[j].compareTo(firstNames[j-1])<0)
            {
                String temp = firstNames[j-1];
                firstNames[j-1] = firstNames[j];
                firstNames[j] = temp;
                j--;
            }
        }
        for(int i=1;i<size;i++)
        {
            int j=i;

            while (j>0 && lastNames[j].compareTo(lastNames[j-1])>0)
            {
                String temp = lastNames[j-1];
                lastNames[j-1] = lastNames[j];
                lastNames[j] = temp;
                j--;
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.println(firstNames[i]);
        }
        for (int i = 0; i < size; i++) {
            System.out.println(lastNames[i]);
        }
    }
}
