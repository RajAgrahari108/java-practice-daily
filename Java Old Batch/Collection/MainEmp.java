import java.util.ArrayList;

public class MainEmp {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "ram", 250000);
        Employee e2 = new Employee(2, "Shyam", 350000);
        Employee e3 = new Employee(3, "Ravi", 450000);
    }
    ArrayList<Employee> al= new ArrayList<Employee>();
    al.add(e1);
    al.add(e2);
    al.add(e3);
}

