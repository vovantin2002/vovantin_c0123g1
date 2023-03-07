package bai_2;


import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Nhap phan tu mang dau tien: ");
            arr1[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Nhap phan tu mang thu hai: ");
            arr2[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i];
        }
        System.out.println("mang thu 3 la: " + Arrays.toString(arr3));
    }
}
