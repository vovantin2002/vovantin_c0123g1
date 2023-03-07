package bai_2;

import java.util.Scanner;


public class MaxMang2Chieu {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Nhap do dai thu nhat: "+" ");
        int b = a.nextInt();
        System.out.print("Nhap do dai thu hai "+" ");
        int c = a.nextInt();
        float[][] arr = new float[b][c];
        float max = arr[0][0];
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Nhap phan tu thu: " + i + "-" + j+" ");
                arr[i][j] = a.nextFloat();
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    System.out.println("Giá trị lớn nhất: " + max + " . Có tọa độ là" + i + "-" + j+" ");
                }
            }
        }
    }
}