package com.itjvm.designpatterns;

import java.util.List;
import java.util.function.Predicate;

public class StrategyPattern {


    public static void main(String[] args) {
        List<Employee> employeeList = getEmployeeList();

        // Different strategies
        System.out.println(getEmployee(employeeList, employee -> employee.salary() > 2000));
        System.out.println(getEmployee(employeeList, Employee::isWorking));
        System.out.println(getEmployee(employeeList, employee -> !employee.isWorking()));
    }

    private static List<Employee> getEmployee(List<Employee> employeeList, Predicate<Employee> selector) {
        return employeeList.stream().filter(selector).toList();
    }

    private static List<Employee> getEmployeeList() {
        return List.of(new Employee("John", 5000, 101, true),
                new Employee("Mac", 3000, 102, true),
                new Employee("Jatin", 2000, 103, true),
                new Employee("Leo", 1000, 104, false));
    }
}
