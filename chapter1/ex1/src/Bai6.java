package com.mycompany.baitapchuong1;

import java.util.HashSet;

public class Bai6{
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 2, 5, 8, 1};

        HashSet<Integer> set = new HashSet<>();

        for (int n : numbers) {
            set.add(n);
        }

        System.out.println("Cac phan tu duy nhat: " + set);

        // HashSet không đảm bảo thứ tự,
        // nên thứ tự in ra có thể khác mảng ban đầu
    }
}

