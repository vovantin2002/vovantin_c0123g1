package bai_3;

import java.util.Arrays;
import java.util.Scanner;

public class TongCacSoOMotCot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap do dai thu nhat: ");
        int a = scanner.nextInt();
        System.out.println("nhap do dai thu hai: ");
        int b = scanner.nextInt();
        float[][] arr = new float[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println("nhap vao phan tu thu: " + i + "-" + j);
                arr[i][j] = scanner.nextFloat();
            }
        }
        System.out.println("mang da nhap la: ");
        System.out.println(Arrays.deepToString(arr));
        System.out.println("nhap cot muon tinh tong: ");
        int x = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (x == j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
