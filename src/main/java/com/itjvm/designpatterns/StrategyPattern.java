package com.itjvm.designpatterns;

import java.util.List;
import java.util.function.Predicate;

import static com.itjvm.designpatterns.common.DataProvider.getEmployeeList;

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

}