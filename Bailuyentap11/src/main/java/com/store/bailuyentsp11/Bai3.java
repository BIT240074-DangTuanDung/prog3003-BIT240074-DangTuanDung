package com.store.bailuyentsp11;

import java.util.*;
import java.util.stream.Collectors;

public class Bai3 {

    // Class Employee
    static class Employee {
        private final String name;
        private final double salary;

        public Employee(int id, String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }
    }

    // Main
    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
            new Employee(1, "An", 900),
            new Employee(2, "Binh", 1200),
            new Employee(3, "Cuong", 1500),
            new Employee(4, "Dung", 800)
        );

        // Stream xử lý
        List<String> result = list.stream()
                .filter(e -> e.getSalary() > 1000) 
                .map(Employee::getName)          
                .sorted()                         
                .collect(Collectors.toList());   

        System.out.println("Danh sach nhan vien luong > 1000:");
        System.out.println(result);
    }
}