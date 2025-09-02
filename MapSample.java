package employee;

import java.util.*;

public class MapSample {
    public static void main(String[] args){
        Map<Integer, Employee> employeeMap = new HashMap<>();
        Map<Integer, Employee> employeeMap1 = new HashMap<>();

        Employee employee_1 = new Employee(1, "Z", 2000);
        Employee employee_2 = new Employee(2, "X", 5000);
        Employee employee_3 = new Employee(3, "A", 2000);
        Employee employee_4 = new Employee(4, "B", 2000);

        Employee employee_5 = new Employee(5, "Gopinath", 2000);
        Employee employee_6 = new Employee(6, "Siva", 2000);
        Employee employee_7 = new Employee(7, "Nagaraj", 2000);
        Employee employee_8 = new Employee(8, "Navya", 2000);

        employeeMap.put(1, employee_1);
        employeeMap.put(2, employee_2);
        employeeMap.put(3, employee_3);
        employeeMap.put(4, employee_4);

        employeeMap1.put(5, employee_5);
        employeeMap1.put(6, employee_6);
        employeeMap1.put(7, employee_7);
        employeeMap1.put(8, employee_8);

        // Merge both maps
        employeeMap1.putAll(employeeMap);
        System.out.println("Second MapValue: " + employeeMap1);

        // Iterating keys
        for (Integer key : employeeMap.keySet()) {
            Employee value = employeeMap.get(key);
            System.out.println(value);
        }

        // Get only values
        Collection<Employee> value = employeeMap.values();
        System.out.println("All Employee Values: " + value);



        // Check if empty
        boolean result = employeeMap.isEmpty();
        System.out.println("Is Map Empty? " + result);

        // Size of map
        System.out.println("Size of the HashMap: " + employeeMap.size());

        // Check if a key exists
        if (employeeMap.containsKey(10)){
            System.out.println("Yes");
        } else {
            System.out.println("NO");
        }

        // Entry set
        Set<Map.Entry<Integer, Employee>> set = employeeMap.entrySet();
        System.out.println("Set Value: " + set);

        // Key set
        Set<Integer> setkey = employeeMap.keySet();
        System.out.println("Key Set Value: " + setkey);

        // Sort employees by name
        employeeMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getEmployeeName)))
                .forEach(System.out::println);


    }
}
