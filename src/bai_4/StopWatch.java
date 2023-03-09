package bai_4;

import java.util.Scanner;

public class StopWatch {
    public static long start() {
        long k = System.currentTimeMillis();
        return k;
    }

    public static long stop() {
        long h = System.currentTimeMillis();
        return h;
    }

    public static long getElapsedTime(long m, long n) {
        long c = n - m;
        return c;
    }

    public static void main(String[] args) {
        long m = start();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 0 de tinh thoi gian: ");
        int end = sc.nextInt();
        if (end == 0) {
            long n = stop();
            System.out.println(n);
            System.out.println("Thoi gian can tinh  :" + getElapsedTime(m, n) + " milisSecond");
        }
    }
}
