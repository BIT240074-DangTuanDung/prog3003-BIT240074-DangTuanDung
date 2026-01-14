/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.baitapchuong1;

class Test<T> {
    private T value;

    public void set(T t) {
        this.value = t;
    }

    public T get() {
        return value;
    }
}

public class Bai1 {
    public static void main(String[] args) {
        Test<Integer> testInt = new Test<>();
        testInt.set(100);
        System.out.println("Integer: " + testInt.get());

        Test<String> testString = new Test<>();
        testString.set("toi la robot");
        System.out.println("String: " + testString.get());
    }
}
