package part1;

import java.util.Comparator;

public class CompareForSalaryAndName implements Comparator<Employee> {

    public int compare(Employee o1, Employee o2) {
        if (o1.getSalary().equals(o2.getSalary())) {
            if (o1.getFirstName().equals(o2.getFirstName())) {
                return o1.getLastname().compareTo(o2.getLastname());
            }
            return o1.getFirstName().compareTo(o2.getFirstName());
        } else return o1.getSalary().compareTo(o2.getSalary());
    }
}
