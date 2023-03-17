package bai_11;


import java.util.Arrays;

public class KiemTraChuoiPalindrome {
    public static void main(String[] args) {
        String str = "AblewasIereIsawElba";
        Character[] arr = new Character[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.toUpperCase().charAt(i);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(istPalindrom(arr));
    }

    static boolean istPalindrom(Character[] str) {
        int n = str.length;
        for (int i = 0; i < n / 2; i++) {
            if (str[i] != str[n - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
