package com.myapp.baithigiuaki;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class main {

    public static double calculateAverageGpa(List<Student> students) {
        double sum = 0;
        for (Student s : students) {
            sum += s.getGpa();
        }
        return sum / students.size();
    }

    public static void main(String[] args) {

        StudentManager<Student> manager = new StudentManager<>();

        manager.add(new Student("SV01", "Dang Tuan Dung", 3.9));
        manager.add(new Student("SV02", "Vu Tung Duong", 4.0));
        manager.add(new Student("SV03", "Bui Minh Tu", 3.9));

        System.out.println("Dang tinh GPA trung binh...");

        
        CompletableFuture<Double> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000); 
                return calculateAverageGpa(manager.getAll());
            } catch (Exception e) {
                throw new RuntimeException("Loi khi tinh GPA", e);
            }
        });

        future.thenAccept(avg -> {
            System.out.println("Diem trung binh GPA cua he thong la: " + avg);
        }).exceptionally(ex -> {
            System.out.println("Da xay ra loi: " + ex.getMessage());
            return null;
        });

        System.out.println("Main thread van tiep tuc chay...");

        future.join();
    }
}