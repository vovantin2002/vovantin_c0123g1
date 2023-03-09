public class GiaiThuat {
    public static void main(String[] args) {
        int k = 10;
        int a = k / 2;
        int b = k / 2;
        int c = 0;
        for (int i = 0; i < k - 1; i++) {
            if (i < 5) {
                a--;
                b++;
                c++;
            } else {
                a++;
                b--;
                c--;
            }
            for (int j = 0; j < k + 1; j++) {
                if (j == a || j == b) {
                    System.out.print(c);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
