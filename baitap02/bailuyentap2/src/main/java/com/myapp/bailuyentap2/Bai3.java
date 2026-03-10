package com.myapp.bailuyentap2;

import java.util.concurrent.CompletableFuture;

public class Bai3 {

    public static void main(String[] args) {

        // Task 1: Xác thực khách hàng
        CompletableFuture<String> validateCustomer =
                CompletableFuture.supplyAsync(() -> {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                    }
                    System.out.println("Xác thực khách hàng hoàn thành");
                    return "Customer Valid";
                });

        // Task 2: Xuất vé
        CompletableFuture<String> issueTicket =
                CompletableFuture.supplyAsync(() -> {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                    }
                    System.out.println("Xuất vé hoàn thành");
                    return "Ticket Issued";
                });

        // Kết hợp 2 task
        CompletableFuture<String> result =
                validateCustomer.thenCombine(issueTicket,
                        (a, b) -> "Hệ thống đặt vé hoàn thành");

        System.out.println(result.join());
    }
}
