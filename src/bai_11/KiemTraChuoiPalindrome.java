package bai_11;

import java.util.Scanner;

public class KiemTraChuoiPalindrome {
    public static void main(String[] args) {
        System.out.println("nhap chuoi muon kiem tra: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String uppercaseString = str.toUpperCase();
        System.out.println("chuoi da nhap chuyen thanh chu hoa: " + uppercaseString);
        System.out.println(istPalindrom(uppercaseString));
    }

    static boolean istPalindrom(String uppercaseString) {
        int n = uppercaseString.length();
        for (int i = 0; i < n / 2; i++) {
            if (uppercaseString.charAt(i) != uppercaseString.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
