package com.store.bailuyentsp11;

public class Bai1 {

    // Generic Method
    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4};
        String[] strArray = {"Java", "Python", "C++"};

        System.out.println("Mang Integer:");
        printArray(intArray);

        System.out.println("Mang String:");
        printArray(strArray);
    }
}