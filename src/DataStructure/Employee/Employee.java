package DataStructure.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {

    String name;
    double salary;
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }




    public static void main(String[] args) {

//        List<Employee> list = new ArrayList<>();
//
//        list.add(new Employee("Sam", 123213));
//        list.add(new Employee("Anu", 456));
//        list.add(new Employee("Rn", 7123));
//        list.add(new Employee("Shawn", 234));
//        list.add(new Employee("Don", 3456));
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i).name);
//        }

        Scanner scanner = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < 5 ; i++) {
            System.out.println("Employee" + i);
            System.out.println("Name" );
            String name = scanner.nextLine();
            System.out.println("Salary" );
            double salary = scanner.nextDouble();

            Employee employee = new Employee(name, salary);
            list.add(employee);
        }

    }
}
