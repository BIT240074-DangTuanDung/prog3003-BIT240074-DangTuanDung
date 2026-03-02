package com.myapp.baitest2;

import java.util.Scanner;

// 1. Product Interface
interface Payment {
    void pay(double amount);
}

// 2. Concrete Products
class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " bằng Credit Card thành công!");
    }
}

class PayPalPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " bằng PayPal thành công!");
    }
}

class CashPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " bằng Cash thành công!");
    }
}

// 3. Factory Class
class PaymentFactory {

    public static Payment createPayment(String type) {

        if (type.equalsIgnoreCase("credit")) {
            return new CreditCardPayment();
        } else if (type.equalsIgnoreCase("paypal")) {
            return new PayPalPayment();
        } else if (type.equalsIgnoreCase("cash")) {
            return new CashPayment();
        } else {
            throw new IllegalArgumentException("Phương thức thanh toán không hợp lệ!");
        }
    }
}

// 4. Main Class
public class baitest2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== PAYMENT SYSTEM =====");
        System.out.println("1. Credit Card");
        System.out.println("2. PayPal");
        System.out.println("3. Cash");
        System.out.print("Chọn phương thức: ");

        int choice = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập số tiền cần thanh toán: ");
        double amount = Double.parseDouble(sc.nextLine());

        Payment payment = null;

        switch (choice) {
            case 1 -> payment = PaymentFactory.createPayment("credit");
            case 2 -> payment = PaymentFactory.createPayment("paypal");
            case 3 -> payment = PaymentFactory.createPayment("cash");
            default -> {
                System.out.println("Lựa chọn không hợp lệ!");
                return;
            }
        }

        payment.pay(amount);
    }
}
