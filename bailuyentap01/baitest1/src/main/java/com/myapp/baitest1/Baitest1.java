package com.myapp.baitest1;

import java.util.ArrayList;
import java.util.Scanner;

class SinhVien {
    private final String mssv;
    private final String ten;
    private final double gpa;

    public SinhVien(String mssv, String ten, double gpa) {
        this.mssv = mssv;
        this.ten = ten;
        this.gpa = gpa;
    }

    public String getMssv() {
        return mssv;
    }

    public String getTen() {
        return ten;
    }

    public double getGpa() {
        return gpa;
    }

    public void hienThi() {
        System.out.println("MSSV: " + mssv +
                           " | Tên: " + ten +
                           " | GPA: " + gpa);
    }
}

public class Baitest1 {

    static ArrayList<SinhVien> danhSach = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    // 1. Thêm sinh viên
    public static void themSinhVien() {
        System.out.print("Nhập MSSV: ");
        String mssv = sc.nextLine();

        System.out.print("Nhập tên: ");
        String ten = sc.nextLine();

        System.out.print("Nhập GPA: ");
        double gpa = Double.parseDouble(sc.nextLine());

        SinhVien sv = new SinhVien(mssv, ten, gpa);
        danhSach.add(sv);

        System.out.println(">>> Thêm sinh viên thành công!\n");
    }

    // 2. Hiển thị danh sách
    public static void hienThiDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sách trống!\n");
            return;
        }

        System.out.println("===== DANH SÁCH SINH VIÊN =====");
        for (SinhVien sv : danhSach) {
            sv.hienThi();
        }
        System.out.println();
    }

    // 3. Tìm kiếm theo tên
    public static void timTheoTen() {
        System.out.print("Nhập tên cần tìm: ");
        String tenCanTim = sc.nextLine();
        boolean timThay = false;

        for (SinhVien sv : danhSach) {
            if (sv.getTen().toLowerCase().contains(tenCanTim.toLowerCase())) {
                sv.hienThi();
                timThay = true;
            }
        }

        if (!timThay) {
            System.out.println("Không tìm thấy sinh viên!\n");
        }
    }

    // 4. Xóa theo MSSV
    public static void xoaTheoMssv() {
        System.out.print("Nhập MSSV cần xóa: ");
        String mssvCanXoa = sc.nextLine();
        boolean daXoa = false;

        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).getMssv().equalsIgnoreCase(mssvCanXoa)) {
                danhSach.remove(i);
                daXoa = true;
                break;
            }
        }

        if (daXoa) {
            System.out.println(">>> Xóa thành công!\n");
        } else {
            System.out.println("Không tìm thấy MSSV!\n");
        }
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("===== MENU =====");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Tìm kiếm theo tên");
            System.out.println("4. Xóa theo MSSV");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");

            int chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1 -> themSinhVien();
                case 2 -> hienThiDanhSach();
                case 3 -> timTheoTen();
                case 4 -> xoaTheoMssv();
                case 0 -> {
                    System.out.println("Thoát chương trình!");
                    return;
                }
                default -> System.out.println("Lựa chọn không hợp lệ!\n");
            }
        }
    }
}
