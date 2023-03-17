package bai_11;

import java.util.HashSet;
import java.util.Scanner;

public class DemSoLanXuatHienMoiTu {
    public static void main(String[] args) {
        HashSet<String> chuoi = new HashSet<String>();
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao chuoi ki tu: ");
        String a=sc.nextLine();
        String[] arr = new String[Integer.parseInt(a)];
        System.out.println(a);
        for (int i = 0; i <arr.length ; i++) {
            chuoi.add(arr[i]);
        }
        System.out.println(chuoi);
    }

}
