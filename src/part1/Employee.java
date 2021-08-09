package part1;

public class Employee implements Comparable<Employee> {
    private int id;
    private String firstName;
    private String lastname;
    private double salary;
    static int counter = 1;

    public Employee() {
    }

    public Employee(String firstName, String lastname, double salary) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.salary = salary;
        this.id = counter;
        counter++;
    }

    public Employee(String firstName, String lastname) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.id = counter;
        counter++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        if (this.getId() == o.getId()) {
            return 0;
        } else if (this.getId() < o.getId()) {
            return -1;
        } else return 1;
    }

    public String toString() {
        return "Id: " + getId() + "\n" +
                "Name: " + getFirstName() + " " + getLastname() + "\n"
                + "Salary: " + getSalary() + "\n";
    }
}
