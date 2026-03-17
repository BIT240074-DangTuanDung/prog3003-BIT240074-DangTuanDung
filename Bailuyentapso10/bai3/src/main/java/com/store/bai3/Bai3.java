package com.store.bai3;

public class Bai3{

    public static void main(String[] args) {

   
        WorkerThread t1 = new WorkerThread();
        t1.start();

     
        Thread t2 = new Thread(new WorkerRunnable());
        t2.start();

    }
}


class WorkerThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread đang chạy...");
    }

}


class WorkerRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Runnable đang chạy...");
    }

}