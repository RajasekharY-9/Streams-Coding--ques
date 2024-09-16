import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private int age;
    
    // Constructor
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // toString method for displaying employee details
    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + '}';
    }
}

public class EmployeeSortExample {

    public static void main(String[] args) {
        // Creating a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 30));
        employees.add(new Employee("Bob", 25));
        employees.add(new Employee("Charlie", 35));
        employees.add(new Employee("David", 28));

        // Sorting by age using lambda expression
        employees.sort(Comparator.comparingInt(employee->employee.getAge()));
      //  employees.sort(Comparator.comparingInt(Employee::getAge));

        System.out.println("Sorted by Age:");

        employees.forEach(x-> System.out.println(x));
        //employees.forEach(System.out::println);

        // Sorting by name using lambda expression
        employees.sort(Comparator.comparing(Employee::getName));

        System.out.println("\nSorted by Name:");
        employees.forEach(System.out::println);

        Integer [] arr={1,1,2,3,3};
        List<Integer> uniqueList=Arrays.stream(arr).distinct().collect(Collectors.toList());
        System.out.println(uniqueList);
        StringBuilder sb = new StringBuilder("hi");
    }
}
