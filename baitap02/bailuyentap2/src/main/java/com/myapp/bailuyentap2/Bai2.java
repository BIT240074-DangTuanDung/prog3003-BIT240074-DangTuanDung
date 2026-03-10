package com.myapp.bailuyentap2;

public class Bai2 {

    // Class Computer
    static class Computer {

        private final String HDD;
        private final String RAM;
        private final boolean bluetooth;

        // Constructor private
        private Computer(ComputerBuilder builder) {
            this.HDD = builder.HDD;
            this.RAM = builder.RAM;
            this.bluetooth = builder.bluetooth;
        }

        public void showInfo() {
            System.out.println("HDD: " + HDD);
            System.out.println("RAM: " + RAM);
            System.out.println("Bluetooth: " + bluetooth);
            System.out.println("----------------------");
        }

        // Static Builder Class
        static class ComputerBuilder {

            private String HDD;
            private String RAM;
            private boolean bluetooth;

            public ComputerBuilder(String HDD, String RAM) {
                this.HDD = HDD;
                this.RAM = RAM;
            }

            public ComputerBuilder setBluetooth(boolean bluetooth) {
                this.bluetooth = bluetooth;
                return this;
            }

            public Computer build() {
                return new Computer(this);
            }
        }
    }

    // Hàm main để chạy
    public static void main(String[] args) {

        // Máy tính có Bluetooth
        Computer computer1 = new Computer.ComputerBuilder("1TB", "16GB")
                .setBluetooth(true)
                .build();

        // Máy tính không có Bluetooth
        Computer computer2 = new Computer.ComputerBuilder("500GB", "8GB")
                .build();

        System.out.println("Computer 1:");
        computer1.showInfo();

        System.out.println("Computer 2:");
        computer2.showInfo();
    }
}