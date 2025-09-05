package mapExamples;

import employee.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {

        TreeMap<Integer, Employee> treeMap = new TreeMap<>();

        // Create Employee objects
        Employee employee_1 = new Employee(1, "Z", 2000);
        Employee employee_2 = new Employee(2, "X", 5000);
        Employee employee_3 = new Employee(3, "A", 2000);
        Employee employee_4 = new Employee(4, "B", 2000);


        treeMap.put(1,employee_1);
        treeMap.put(2,employee_2);
        treeMap.put(3,employee_3);
        treeMap.put(4,employee_4);

        List<Employee> sortedByName = new ArrayList<>(treeMap.values());
        sortedByName.sort(Comparator.comparing(Employee::getEmployeeName));
        System.out.println("Values sorted by Name: " + sortedByName);

        System.out.println("TreeMap: " + treeMap);


    }
}