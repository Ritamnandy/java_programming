
class HRManager {

    private final String employeeName;

    public HRManager(String employeeName) {
        this.employeeName = employeeName;
    }

    public void addEmployee() {
        System.out.println("Adding employee:- " + employeeName);

    }

    public void work() {
        System.out.println("Managing employees");
    }
}

public class Employee extends HRManager {

    private final double salary;

    public Employee(String employeeName, int salary) {
        super(employeeName);
        this.salary = salary;
    }

    void getSalary() {
        System.out.println("Salary of employee is:- " + salary);
    }

    @Override
    public void work() {
        System.out.println("Working as an employee");
    }

    public static void main(String[] args) {
        Employee e = new Employee("Rohit", 50000);
        e.addEmployee();
        e.getSalary();
        e.work();
        HRManager h = new HRManager("Pankaj");
        h.addEmployee();
        h.work();
    }
}
