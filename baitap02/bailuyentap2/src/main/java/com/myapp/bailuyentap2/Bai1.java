package com.myapp.bailuyentap2;

import java.util.TreeSet;

public class Bai1 {

    public static void main(String[] args) {

        // Tạo TreeSet
        TreeSet<String> names = new TreeSet<>();

        // Thêm phần tử
        names.add("John");
        names.add("Alice");
        names.add("Zack");
        names.add("Bob");

        // In danh sách
        System.out.println("Danh sách TreeSet:");
        System.out.println(names);

        // Phần tử nhỏ nhất
        System.out.println("Phần tử đầu tiên: " + names.first());

        // Phần tử lớn nhất
        System.out.println("Phần tử cuối cùng: " + names.last());
    }
}
