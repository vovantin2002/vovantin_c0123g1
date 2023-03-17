package bai_11;

import java.util.Scanner;
import java.util.Stack;

public class ChuyenDoiTuHeThapPhanSangNhiPhan {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack1 = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so can chuyen doi: ");
        int a = sc.nextInt();
        System.out.println(a);
        int cout = 0;
        for (int i = 0; i < 1000; i++) {
            stack.push(a % 2);
            a = a / 2;

            if (a == 0) {
                break;
            }
            cout++;
        }
        System.out.println(cout);
        for (int i = cout; i >= 0; i--) {
            stack1.push(stack.get(i));
        }
        System.out.println("mang sau khi chuyen doi: " + stack1);
    }

}
