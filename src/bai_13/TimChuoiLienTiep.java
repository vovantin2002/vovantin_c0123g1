package bai_13;

import java.util.Scanner;

public class TimChuoiLienTiep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao mot chuoi: ");
        String str = sc.nextLine();
        System.out.println(str);
        char max = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > max) {
                max = str.charAt(i);
                System.out.print(max);
            }
        }
    }
}
