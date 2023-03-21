package bai_13;

import java.util.Scanner;

public class TimChuoiTangDan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao mot chuoi: ");
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        char max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                System.out.print(max);
            }
        }
    }
}
