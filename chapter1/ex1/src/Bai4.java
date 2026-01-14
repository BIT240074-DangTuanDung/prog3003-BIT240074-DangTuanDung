package com.mycompany.baitapchuong1;

import java.util.ArrayList;

public class Bai4 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        fruits.add(1, "Mango");
        fruits.set(fruits.indexOf("Banana"), "Grapes");

        System.out.println("Danh sach: " + fruits);
        System.out.println("Co Apple khong? " + fruits.contains("Apple"));
    }
}
