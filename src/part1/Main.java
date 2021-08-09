package part1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main implements Comparator<Employee> {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Anna", "Claus", 1000);
        Employee employee = new Employee("Anna", "Badina", 1000);
        Employee employee2 = new Employee("Ivan", "Stishko", 21340);
        Employee employee3 = new Employee("Akshan", "Vladimirov", 2100);

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(employee);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        System.out.println("Before sort");
        for (Employee e : employees) {
            System.out.println(e.toString());
        }

        Collections.sort(employees);

        System.out.println("After first sort (ID) \n");

        for (Employee e : employees) {
            System.out.println(e.toString());
        }

        Collections.sort(employees, (o1, o2) -> {
            if (o1.getSalary().equals(o2.getSalary())) {
                return 0;
            } else if (o1.getSalary() < o2.getSalary()) {
                return -1;
            } else return 1;
        });

        System.out.println("Second sort (Salary) \n");

        for (Employee e : employees) {
            System.out.println(e.toString());
        }

        Collections.sort(employees, (o1, o2) -> {
            if (o1.getSalary().equals(o2.getSalary())) {
                if (o1.getFirstName().equals(o2.getFirstName())) {
                    return o1.getLastname().compareTo(o2.getLastname());
                }
                return o1.getFirstName().compareTo(o2.getFirstName());
            } else return o1.getSalary().compareTo(o2.getSalary());
        });
        System.out.println("Final (Name if salary equals): ");
        for (Employee e : employees) {
            System.out.println(e.toString());
        }
    }


    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getSalary().equals(o2.getSalary())) {
            return 0;
        } else if (o1.getSalary() < o2.getSalary()) {
            return -1;
        } else return 1;
    }
}