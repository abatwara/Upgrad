public class Inharitance {

    public  static void main(String args[])
    {
        B b = new B();
        b.hi();
    }
}

class A{

    void hello()
    {
     System.out.println("Hello");
    }
}
class B extends A{
    void hi()
    {
        super.hello();
    }
}
