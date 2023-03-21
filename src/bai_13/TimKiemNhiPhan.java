package bai_13;

import java.util.Arrays;
import java.util.Scanner;

public class TimKiemNhiPhan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("nhap vao do dai mang");
        int n=sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            System.out.println("nhap vao phan tu thu: "+i);
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int min=arr[0];
        for (int i = 0; i <n ; i++) {
            if(min>arr[i]){
                min=arr[i];

            }
        }
    }
}
