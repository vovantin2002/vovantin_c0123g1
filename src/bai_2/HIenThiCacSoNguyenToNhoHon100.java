package bai_2;

public class HIenThiCacSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int count = 0;
        int n = 0;
        for (int i = 1; i < 100; i++) {
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
        }
    }
}


