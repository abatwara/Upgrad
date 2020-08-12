public class Graded {
    public static void main(String[] args) {

        Person1 p = new Person1("Ankit");
        System.out.println(p.getName());

    }
}

class Person1 {
    private String name;
    public Person1(String name) {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }
}