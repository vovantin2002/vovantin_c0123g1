package bai_2;

import java.util.Scanner;

public class HIenThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        System.out.println("nhap vao so number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(number);
        int count = 0;
        int n = 0;
        while (n < number) {
            for (int i = 1; i > 0; i++) {
                count = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    n++;
                    System.out.println(i);
                }
                if (n == number) {
                    break;
                }
            }
        }
    }
}
