import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws Exception {
        while (true) {
            String sdt = "[A-Z][a-z]{0,5}(\\s+[A-Z][a-z]{0,5}){1,6}";
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap ten muon kiem tra: ");
            String sdt1 = sc.nextLine();
            boolean check = sdt1.matches(sdt);
            System.out.println("ket qua tra ve la: ");
            System.out.println(check);
        }
//        final String REGEX_BIRTHDAY = "(^\\d{2}/\\d{2}/\\d{4}$)";
//        Scanner scanner = new Scanner(System.in);
//        String birth;
//        boolean check;
//        do {
//            System.out.println("Enter birthdayy: ");
//            birth = scanner.nextLine();
//            check = birth.matches(REGEX_BIRTHDAY);
//            System.out.println(check);
//        } while (!check);

        //


    }



}
