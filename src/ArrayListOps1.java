import java.util.*;

public class ArrayListOps1 {
  public static void main(String[] args) {

    ArrayList<Float> random = new ArrayList<Float>();
    random.add(2f);
    random.add(4f);
    random.add(5f);
    random.add(10f);
    random.add(99.9f);
    List<Integer> arrayList = new ArrayList<Integer>();
    arrayList.add(1);
    arrayList.add(2);

    ListIterator<Integer> listIterator = arrayList.listIterator();
    while(listIterator.hasNext()) {
      System.out.print(listIterator.next());
      listIterator.previous();
    }
ArrayList<Integer> al = new ArrayList();
al.add(1);
    al.add(2);
    al.add(3);
    al.add(4);
    al.add(5);
    al.add(6);
    iterate(al);
    System.out.println(random.contains(5f));
    ArrayList<Student1> studentList = new ArrayList<Student1>();
    studentList.add(new Student1("Sujit", 1));
    studentList.add(new Student1("Siddharth", 2));
    studentList.add(new Student1("Karanpreet", 3));
    studentList.add(1,new Student1("Hari", 4));
    studentList.add(0, new Student1("Tricha", 5));
    ArrayList<String> shape = new ArrayList<String>();
    shape.add("Square");
    shape.add("Triangle");
    shape.add(2, "Circle");
    shape.add(1, "Rhombus");
    System.out.println(shape.get(2));

    //printStudentList(studentList);
  }
  public static void iterate(List<Integer> num) {
    ListIterator<Integer> it = num.listIterator(num.size());
    while(it.hasPrevious()) {
      if(it.hasPrevious()) {
        System.out.println(it.previous());
      }
      it.previous();
    }
  }
  public static void printStudentList(ArrayList<Student1> students) {
    for(Student1 s : students) {
      System.out.println(s.getDetails());
    }
  }
}

class Student1 {
  private final String name;
  private final int rollNumber;

  public Student1(String name, int rollNumber) {
    this.name = name;
    this.rollNumber = rollNumber;
  }

  public String getDetails() {
    return
      "name = " + this.name + '\n' +
      "roll number = " + this.rollNumber + '\n';
  }
}

/*
  SUMMARY
  =======
  1. ArrayList Simple way to representation a dataset which is a collection of elementary data items.
  2. This is a type-safe approach of creating containers. Any attempt to add an element which is
      type-incompatible with the declared contained type will fail at the static type checking stage,
      resulting in a compile error.

*/
