import java.util.Scanner;

public class UngDungDocSoThanhChu {


    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so can doc: ");
        int so = Integer.parseInt(scanner.nextLine());

        System.out.println("So ban da nhap : " + so);
        if (0 <= so && so <= 12) {
            switch (so) {
                case 0:
                    System.out.println("Zero ");
                    break;
                case 1:
                    System.out.println("One  ");
                    break;
                case 2:
                    System.out.println("Two  ");
                    break;
                case 3:
                    System.out.println("Three  ");
                    break;
                case 4:
                    System.out.println("Four  ");
                    break;
                case 5:
                    System.out.println("Five  ");
                    break;
                case 6:
                    System.out.println("Six ");
                    break;
                case 7:
                    System.out.println("Seven ");
                    break;
                case 8:
                    System.out.println("Eight ");
                    break;
                case 9:
                    System.out.println("Nine  ");
                    break;
                case 10:
                    System.out.println("Ten  ");
                    break;
                case 11:
                    System.out.println("Eleven   ");
                    break;
                case 12:
                    System.out.println("Twelve  ");
                    break;
                default:
                    System.out.println("out of ability");
            }

        } else if (12 < so && so < 20) {
           so=so/10;
            switch (so) {
                case 3:
                    System.out.println("Thir  "+"teen");
                    break;
                case 4:
                    System.out.println("Four  "+"teen)");
                    break;
                case 5:
                    System.out.println("Five  "+"teen)");
                    break;
                case 6:
                    System.out.println("Six "+"teen)");
                    break;
                case 7:
                    System.out.println("Seven "+"teen)");
                    break;
                case 8:
                    System.out.println("Eight "+"teen)");
                    break;
                case 9:
                    System.out.println("Nine  "+"teen)");
                    break;
                    
        }

    }

}
}
