class Employee {

    private int empId;
    private String empFirstName;
    private String empSecondName;
    private double empSalary;

    public Employee(int empId, String empFirstName, String empSecondName, double empSalary) {
        this.empId = empId;
        this.empFirstName = empFirstName;
        this.empSecondName = empSecondName;
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpFirstName() {
        return empFirstName;
    }

    public String getEmpSecondName() {
        return empSecondName;
    }

    public double getEmpSalary() {
        return empSalary;
    }
}

public class Emp {
    public static void main(String[] args) {

        Employee E1 = new Employee(101512031, "Sushil", "Kumar", 45000.58);
        Employee E2 = new Employee(101512032, "Tara", "Sharma",51000.99);
        System.out.println("employee full name "+E1.getEmpFirstName()+" "+E1.getEmpSecondName());
        System.out.println("employee annual package "+E1.getEmpSalary()*12);
        System.out.println("employee full name "+E2.getEmpFirstName()+" "+E2.getEmpSecondName());
        System.out.println("employee annual package "+E2.getEmpSalary()*12);

    }
}