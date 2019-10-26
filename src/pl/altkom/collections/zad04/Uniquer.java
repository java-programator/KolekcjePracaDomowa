package pl.altkom.collections.zad04;

import pl.altkom.collections.Employee;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Uniquer {
    public static void main(String[] args) {
        List<Employee> employees = Employee.createEmployees();
        // dodaj kod, który usunie pracowników, którzy się powtarzają
        Set<Employee> set = new TreeSet<>();
        set.addAll(employees);
        for (Employee e : set) {
            System.out.println(e);
        }
    }
}
