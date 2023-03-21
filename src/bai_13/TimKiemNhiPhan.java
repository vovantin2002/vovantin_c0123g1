package bai_13;

import java.util.Arrays;
import java.util.Scanner;

public class TimKiemNhiPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap vao do dai mang");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhap vao phan tu thu: " + i);
            array[i] = sc.nextInt();
        }
        System.out.println("mang da nhap vao: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("mang sau khi sap xep: " + Arrays.toString(array));
        System.out.println("nhap vao value muon tim kiem: ");
        int value = sc.nextInt();
        System.out.println("vi tri value can tim la: " + TimKiemNhiPhan.binarySearch(array, value));
    }

    public static int binarySearch(int[] arr, int value) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (arr[middle] == value) {
                return middle;
            } else if (value > arr[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;

    }
}
