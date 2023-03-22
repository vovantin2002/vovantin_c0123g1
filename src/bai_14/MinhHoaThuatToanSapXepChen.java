package bai_14;

import java.util.Arrays;

public class MinhHoaThuatToanSapXepChen {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 78, 9, 2};
        for (int i = 0; i < arr.length; i++) {
            int indexMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[indexMin]) {
                    indexMin = j;
                }
            }
            if (indexMin != i) {
                int temp = arr[i];
                arr[i] = arr[indexMin];
                arr[indexMin] = temp;
                System.out.println("Lan thu " + i + ": " + Arrays.toString(arr));
            }
        }
    }
}

