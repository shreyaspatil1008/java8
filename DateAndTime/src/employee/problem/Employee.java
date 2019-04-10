package employee.problem;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
    private final int id;
    private final String name;
    private final float salary;
    private final LocalDate dateOfJoining;
    private final LocalDate dateOfBirth;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getId() == employee.getId() &&
                Float.compare(employee.getSalary(), getSalary()) == 0 &&
                getName().equals(employee.getName()) &&
                getDateOfJoining().equals(employee.getDateOfJoining()) &&
                getDateOfBirth().equals(employee.getDateOfBirth());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getSalary(), getDateOfJoining(), getDateOfBirth());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", dateOfJoining=" + dateOfJoining +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Employee(int id, String name, float salary, LocalDate dateOfJoining, LocalDate dateOfBirth) {

        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dateOfJoining = dateOfJoining;
        this.dateOfBirth = dateOfBirth;
    }
}
