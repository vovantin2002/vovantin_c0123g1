import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        while (true) {
            String sdt = "[A-Z][a-z]{0,5}(\\s+[A-Z][a-z]{0,5}){1,6}";
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap ten muon kiem tra: ");
            String sdt1 = sc.nextLine();
            boolean check = sdt1.matches(sdt);
            System.out.println("ket qua tra ve la: ");
            System.out.println(check);
        }
    }
}
