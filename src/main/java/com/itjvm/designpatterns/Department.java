package com.itjvm.designpatterns;

import java.util.List;

public record Department(String name, int id, List<Employee> employees) {
}
