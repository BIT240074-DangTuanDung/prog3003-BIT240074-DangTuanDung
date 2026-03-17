package com.store.bai1;

import java.util.HashMap;

public class Bai1{
    public static void main(String[] args) {

       
        HashMap<Integer, String> employees = new HashMap<>();

       
        employees.put(101, "Anna");
        employees.put(102, "Peter");
        employees.put(103, "Mary");

      
        System.out.println("Danh sách nhân viên:");
        System.out.println(employees);

        
        String name = employees.get(102);
        System.out.println("Nhân viên có ID 102: " + name);

   
        if (!employees.containsKey(105)) {
            employees.put(105, "Unknown");
        }

        System.out.println("Danh sách sau khi kiểm tra ID 105:");
        System.out.println(employees);
    }
}