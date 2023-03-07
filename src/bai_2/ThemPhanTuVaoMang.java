package bai_2;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("nhap vao phan tu cua mang: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("nhap vao x: ");
        int x = scanner.nextInt();
        System.out.println("x da nhap: " + x);
        System.out.println("nhap vao vi tri index: ");
        int index = scanner.nextInt();
        if (index <= -1 || index >= arr.length - 1) {
            System.out.println("khong chen duoc vao mang!");
        }
        System.out.println("vi tri index da nhap: " + index);
        for (int i = 1; i <= arr.length; i++) {
            if (index == i - 1) {

                for (int j = arr.length - 1; j <= i; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[i - 1] = x;
            }
        }
        System.out.println("mang sau khi chen la: ");
        System.out.println(Arrays.toString(arr));
    }
}
