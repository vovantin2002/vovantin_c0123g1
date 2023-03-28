package bai_19;


import java.util.Scanner;

public class ValidateSoDienThoai {
    public static void main(String[] args) {
        String sdt = "[0-9]{2}\\-0[0-9]{9}";
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so dien thoai muon kiem tra: ");
        String sdt1 = sc.nextLine();
//        String sdt1 = "(84)-(0978489648)";
        boolean check = sdt1.matches(sdt);
        System.out.println("ket qua tra ve la: ");
        System.out.println(check);
    }

}
