import java.io.IOException;

public class Main {
    public static void main(String args[]) {
        int a[] = {1,2,3,4,5};
        for (int num1 : a)
        {
            for(int num2 : a)
            {
                System.out.println(num1+num2);
            }
        }
    }

    static void fun1() {
        try {
            fun2();
            System.out.print("B");
        } catch (Exception e) {
            System.out.print("C");
        }
    }

    static void fun2() throws IOException {
        fun3();
        System.out.print("D");
    }

    static void fun3() throws IOException {
        throw new IOException();
    }
}