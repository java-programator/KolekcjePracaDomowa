package pl.altkom.collections.zad02;

import pl.altkom.collections.Employee;

import java.util.List;
import java.util.function.UnaryOperator;

class Raise implements UnaryOperator<Employee> {

    @Override
    public Employee apply(Employee employee) {
        double salary = employee.getSalary();
        employee.setSalary(salary*1.1);
        return employee;
    }
}

public class Updater {
    public static void main(String[] args) {
        List<Employee> employees = Employee.createEmployees();
        // dodaj kod, który da każdemu pracownikowi 10% podwyżki
        // skorzystaj z funkcji replaceAll
//        for (Employee e : employees) {
//            double salary = e.getSalary();
//            e.setSalary(1.1 * salary);
//        }

        Raise r = new Raise();
        employees.replaceAll(r);

        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
