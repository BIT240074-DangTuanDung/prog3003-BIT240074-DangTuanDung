package com.mycompany.baitapchuong1;

import java.util.TreeSet;

public class Bai7 {
    public static void main(String[] args) {

        // 1. Tạo TreeSet
        TreeSet<String> names = new TreeSet<>();

        // 2. Thêm các tên
        names.add("John");
        names.add("Alice");
        names.add("Zack");
        names.add("Bob");

        // 3. In danh sách
        System.out.println("Danh sách tên (đã sắp xếp):");
        System.out.println(names);

        // 4. Lấy phần tử đầu và cuối
        System.out.println("Tên nhỏ nhất: " + names.first());
        System.out.println("Tên lớn nhất: " + names.last());
    }
}
