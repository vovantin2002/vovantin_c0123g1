package bai_11;

import java.util.Scanner;
import java.util.Stack;

public class DaoNguocMangSoNguyen {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack1 = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("mang ban dau: " + stack);
        //Dao nguoc mang
        for (int i = 3; i >= 0; i--) {
            stack1.push(stack.get(i));
        }
        System.out.println("mang sau khi dao nguoc: " + stack1);
        //Dao nguoc chuoi
        Stack<String> wstack = new Stack<String>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap va chuoi: ");
        String mWord = scanner.nextLine();
        for (int i = 0; i < mWord.length(); i++) {
            wstack.push(mWord.charAt(i) + "");
        }
        System.out.println("Chuoi dao nguoc: ");
        for (int i = 0; i < mWord.length(); i++) {
            System.out.print(wstack.pop());
        }
    }
}
