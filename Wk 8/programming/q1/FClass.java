import java.util.*;
import java.util.stream.*;



// Define class FClass
class FClass {
    // Define query method
    public static Stream<Employee> query(List<Employee> employees, String department, double salary) {
        return employees.stream()
                .filter(e -> e.getDepartment().equals(department) && e.getSalary() >= salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var eList = new ArrayList<Employee>();
        eList.add(new Employee("Jack", "HR", 30000));
        eList.add(new Employee("Aria", "HR", 40000));
        eList.add(new Employee("Nora", "IT", 50000));
        eList.add(new Employee("Bella", "IT", 60000));
        eList.add(new Employee("Jacob", "IT", 70000));
        eList.add(new Employee("James", "HR", 80000));

        String d = sc.next();       // Read department
        double s = sc.nextInt();    // Read salary

        var st = query(eList, d, s);
        st.forEach(n -> System.out.println(n));
    }
}
