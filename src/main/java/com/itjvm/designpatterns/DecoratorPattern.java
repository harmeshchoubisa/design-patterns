package com.itjvm.designpatterns;

import java.util.List;
import java.util.function.Function;

import static com.itjvm.designpatterns.common.DataProvider.getEmployeeList;

public class DecoratorPattern {

    public static void main(String[] args) {

        Function<List<Employee>, List<Employee>> employeesWithSalaryGreaterThen = employees -> employees.stream().filter(employee -> employee.salary() > 3000).toList();
        Function<List<Employee>, List<Employee>> employeesWhoAreWorking = employees -> employees.stream().filter(Employee::isWorking).toList();
        getEmployees(getEmployeeList(), "getEmployeesWithSalaryGreaterThen3000", employeesWithSalaryGreaterThen);
        getEmployees(getEmployeeList(), "getEmployeesWhoAreWorking", employeesWhoAreWorking);
        getEmployees(getEmployeeList(), "getEmployeesWithSalaryGreaterThen3000 andThen getEmployeesWhoAreWorking", employeesWithSalaryGreaterThen.andThen(employeesWhoAreWorking));
    }

    public static void getEmployees(List<Employee> employees, String message, Function<List<Employee>, List<Employee>> func) {
        System.out.println(message + " : " +func.apply(employees));
    }
}
