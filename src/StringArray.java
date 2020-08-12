import java.util.Scanner;

public class StringArray {

        public static void main(String[] args) {
            String name;
            int marks;

            Scanner input = new Scanner(System.in);
            name = input.nextLine();
            marks = input.nextInt();
            char grade = 'E';
            if(marks>100)
                grade = 'A';
            else if(marks<=100&&marks>80)
                grade = 'B';
            else if(marks<=80&&marks>60)
                grade = 'C';
            else if(marks<=60&&marks>40)
                grade = 'D';
            else if(marks<=40)
                grade = 'E';

            System.out.println("The grade scored by "+name+" is "+grade);



        }
}
