package com.mycompany.baitapchuong1;

public class Bai2 {

    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4};
        String[] strArray = {"tao", "chuoi", "cam"};

        printArray(intArray);
        printArray(strArray);
    }
}

