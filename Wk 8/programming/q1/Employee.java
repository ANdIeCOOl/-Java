import java.util.*;
import java.util.stream.*;

// Define Employee class
class Employee {
    private String name;
    private String department;
    private double salary;

    // Constructor
    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getters
    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    // Override toString method to match expected output format
    @Override
    public String toString() {
        return name + " : " + department + " : " + (int) salary;
    }
}