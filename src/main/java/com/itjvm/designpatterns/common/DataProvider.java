package com.itjvm.designpatterns.common;

import com.itjvm.designpatterns.Department;
import com.itjvm.designpatterns.Employee;

import java.util.List;

public class DataProvider {

    public static List<Employee> getEmployeeList() {
        return List.of(new Employee("John", 5000, 101, true, 201),
                new Employee("Mac", 3000, 102, true, 201),
                new Employee("Jatin", 2000, 103, true, 202),
                new Employee("Leo", 1000, 104, false, 202));
    }

    public static List<Department> getDepartmentList() {
        return List.of(new Department("HR", 201, getEmployeeList()),
                new Department("IT", 202, getEmployeeList()));
    }
}
