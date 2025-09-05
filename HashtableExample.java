package mapExamples;

import employee.Employee;
import java.util.*;

public class HashtableExample {
    public static void main(String[] args) {
        Hashtable<Integer, Employee> hashtable = new Hashtable<>();


        Employee employee_1 = new Employee(1, "Z", 2000);
        Employee employee_2 = new Employee(2, "X", 5000);
        Employee employee_3 = new Employee(3, "A", 2000);
        Employee employee_4 = new Employee(4, "B", 2000);

        hashtable.put(1, employee_1);
        hashtable.put(2,employee_2);
        hashtable.put(3,employee_3);
        hashtable.put(4,employee_4);

        System.out.println("Hashtable : " + hashtable);

        List<Employee> sortedByName = new ArrayList<>(hashtable.values());
        sortedByName.sort(Comparator.comparing(Employee::getEmployeeName));
        System.out.println("Values sorted by Name: " + sortedByName);
    }
}