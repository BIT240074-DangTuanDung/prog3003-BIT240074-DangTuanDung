
package com.myapp.baithigiuaki;

public class Main {

    public static void main(String[] args) {

        StudentManager<Student> manager = new StudentManager<>();

        manager.add(new Student("SV01", "Nguyen Van Duong", 3.8));
        manager.add(new Student("SV02", "Tran Thi Minh Tu", 3.8));
        manager.add(new Student("SV03", "Le Van Ha", 3.7));

        for (Student s : manager.getAll()) {
            System.out.println(s);
        }
    }
}