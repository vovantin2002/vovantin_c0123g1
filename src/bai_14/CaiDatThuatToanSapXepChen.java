package bai_14;

import java.util.Arrays;

public class CaiDatThuatToanSapXepChen {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 78, 9, 2};
        int x;
        int pos;
        for (int i = 1; i < arr.length; i++) {
            x = arr[i];
            pos = i;
            while (0 < pos && x < arr[pos - 1]) {
                arr[pos] = arr[pos - 1];
                pos--;
                System.out.println("Lần thu " + i + "- " + pos + " " + Arrays.toString(arr));
            }
            arr[pos] = x;

            System.out.println("Sau lan thu " + i + ": " + Arrays.toString(arr));
        }
    }
}
