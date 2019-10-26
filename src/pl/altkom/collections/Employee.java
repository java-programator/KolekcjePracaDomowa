package pl.altkom.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employee implements Comparable<Employee> {
    private final String firstName;
    private final String lastName;
    private double salary;

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static List<Employee> createEmployees() {
        List<Employee> result = new ArrayList<>();
        result.add(new Employee("Paweł", "Bogdan", 3000));
        result.add(new Employee("Adam", "Mickiewicz", 5000));
        result.add(new Employee("Juliusz", "Słowacki", 6000));
        result.add(new Employee("Adam", "Mickiewicz", 5000));
        result.add(new Employee("Jan", "Kowalski", 2000));
        result.add(new Employee("Anna", "Nowak", 4000));
        result.add(new Employee("Maria", "Konopnicka", 6500));
        result.add(new Employee("Eliza", "Orzeszkowa", 2500));
        result.add(new Employee("Emilia", "Plater", 2220));
        return result;
    }

    @Override
    public int compareTo(Employee employee) {
        int res1 = employee.firstName.compareTo(firstName);
        if (res1 == 0) {
            return employee.lastName.compareTo(lastName);
        } else {
            return res1;
        }
    }
}
