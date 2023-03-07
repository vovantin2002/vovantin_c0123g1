package bai_2;

import java.util.Arrays;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int x = 4;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                System.out.println(i);
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
