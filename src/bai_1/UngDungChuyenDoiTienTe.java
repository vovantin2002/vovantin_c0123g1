package bai_1;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate = 23000;
        System.out.println("nhap vao usd: ");
        int usd = Integer.parseInt(scanner.nextLine());
        System.out.println("So tien la :" + (usd * rate));
    }
}