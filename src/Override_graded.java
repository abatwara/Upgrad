import java.util.*;

  class Shape1{
    public  void display()
    {
        System.out.println("Enter a valid number of sides!");
    }
}
class Circle extends Shape1{
     public void display()
     {

            System.out.println("The shape is a circle");
     }
}
class Triangle extends Shape1{
    public void display()
    {
            System.out.println("The shape is a triangle");
    }
}
class Rectangle extends Shape1{
    public void display()
    {
            System.out.println("The shape is a rectangle");
    }
}

public class Override_graded {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Shape1 obj = new Triangle();
        Shape1 obj1 = new Rectangle();
        int numberOfSides = in.nextInt();
        Shape1 shape ;
        switch (numberOfSides)
        {
            case 0:
                shape = new Circle();
                break;
            case 3:
                shape = new Triangle();
                break;
            case 4:
                shape = new Rectangle();
                break;
                default:
                shape = new Shape1();
        }
        shape.display();
    }
}


