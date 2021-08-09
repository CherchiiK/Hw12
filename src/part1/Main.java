package part1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main implements Comparator<Employee> {
    public static void main(String[] args) {
        Employee employee = new Employee("Vlad", "Styopin", 1666);
        Employee employee1 = new Employee("Dima", "Styopin", 2000);
        Employee employee2 = new Employee("Ivan", "Stishko", 2100);
        Employee employee3 = new Employee("Akshan", "Vladimirov", 2100);

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(employee);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        for (Employee e:employees) {
            System.out.println(e.toString());
        }

        Collections.sort(employees);

        for (Employee e:employees) {
            System.out.println(e.toString());
        }

        for (Employee e:employees) {
            System.out.println(e.toString());
        }
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getSalary() == o2.getSalary()) {
            return o1.getSalary().compareTo(o2.getSalary());
        }
    }
}