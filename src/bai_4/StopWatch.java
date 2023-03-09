package bai_4;

import java.util.Scanner;

public class StopWatch {
//    long startTime;
//    long endTime;
//    String start;
//    String end;
//
//
//    public long startTime() {
//        if (start == "s") ;
//
//
//        return System.currentTimeMillis();
//
//
//    }
//
//    public long endTime() {
//        if (end == "e") ;
//
//        return System.currentTimeMillis();
//
//    }
//
//    public long getElapsedTime() {
//        return (endTime() - startTime());
//    }
//
//    public static void main(String[] args) {
//
//        System.out.println("nhap s de bat dau: ");
//        Scanner b = new Scanner(System.in);
//        String start = b.nextLine();
//        System.out.println("nhap e de ket thuc: ");
//        String end = b.nextLine();
//
//        StopWatch a = new StopWatch(start,end);
//        System.out.println(a.getElapsedTime());
//    }
//package class_and_object_java.bai_tap;
//
//import java.util.Scanner;
//
//    public class StopWatch {
        long starttime;
        long endTime;


        public StopWatch(long starttime, long endTime) {
            this.starttime = starttime;
            this.endTime = endTime;
        }

        public long getStarttime() {
            return starttime;
        }

        public long getEndTime() {
            return endTime;
        }

        public static long start() {
            long a1 = System.currentTimeMillis();
            return a1;
        }

        public static long stop() {
            long b1 = System.currentTimeMillis();
            return b1;
        }

        public static long getElapsedTime(long a, long b) {
            long c = b - a;
            return c;
        }

        public static void main(String[] args) {
            long a = start();
            System.out.println(a);
            Scanner input = new Scanner(System.in);
            System.out.println("Nhập vào 1 để ngừng thời gian ");
            int click = input.nextInt();
            if (click == 1) {
                long b = stop();
                System.out.println(b);
                System.out.println("Thời gian  đã trôi qua là :" + getElapsedTime(a, b) + " milisSecond");
            }
        }
    }

