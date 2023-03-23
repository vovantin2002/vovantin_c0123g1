package bai_15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SuDungLopIllegalTriangleException {
    public static void main(String[] args) {
            try {
                check();
            } catch (IllegalTriangleException e) {
                throw new RuntimeException(e);
            } catch (InputMismatchException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Day la ba canh cua tam giac");
    }

    public static boolean check() throws IllegalTriangleException {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap canh thu nhat cua tam giac: ");
        int a = sc.nextInt();
        System.out.println("nhap canh thu hai cua tam giac: ");
        int b = sc.nextInt();
        System.out.println("nhap canh thu ba cua tam giac: ");
        int c = sc.nextInt();
        if (a + b <= c || c + b <= a || a + c <= b) {
            throw new IllegalTriangleException("day khong phai ba canh cua tam giac ");
        } else if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("day khong phai ba canh cua tam giac ");
        } else {
            return true;
        }

    }

    public static class IllegalTriangleException extends Exception {
        public IllegalTriangleException(String message) {
            super(message);
        }

    }
}
