package case_study_module2.util.vaidate;

import java.util.Scanner;

public class Check {
    static Scanner scanner = new Scanner(System.in);

    public static String checkBirthday() {
//        Kiểm tra định dạng của ngày sinh
        final String REGEX_BIRTHDAY = "^((0[1-9])|((1|2)[0-9])|3[0-1])/((0[1-9])|1[0-2])/((19((2[4-9])|([3-9][0-9])))|200[0-5])$";
        Scanner scanner = new Scanner(System.in);
        String birth = null;
        boolean check;
        do {
            check = true;
            System.out.println("Enter birthday: ");
            birth = scanner.nextLine();
            check = birth.matches(REGEX_BIRTHDAY);
        } while (!check);
        return birth;
    }

    public static int checkPrice() {
        boolean flag;
        int price;
        do {
            flag = true;
            System.out.println("Enter price: ");
            price = Integer.parseInt(scanner.nextLine());
            if (price > 0) {
                flag = false;
            }
        } while (flag);
        return price;
    }

    public static int checkNumberHumanMax() {
        boolean flag;
        int numberHumanMax;
        do {
            flag = true;
            System.out.println("Enter numberHumanMax: ");
            numberHumanMax = Integer.parseInt(scanner.nextLine());
            if (numberHumanMax > 0 && numberHumanMax < 20) {
                flag = false;

            }
        } while (flag);
        return numberHumanMax;
    }

    public static int checkFloor() {
        boolean flag;
        int floor;
        do {
            flag = true;
            System.out.println("Enter number of level: ");
            floor = Integer.parseInt(scanner.nextLine());
            if (floor > 0) {
                flag = false;
            }
        } while (flag);
        return floor;
    }

    public static String checkRoomId() {
        boolean flag;
        String id;

        do {
            flag = true;
            System.out.println("Enter room ID: ");
            id = scanner.nextLine();
            flag = id.matches("^(SVRO-[0-9]{4})$");
        } while (!flag);
        return id;
    } public static String checkHouseId() {
        boolean flag;
        String id;

        do {
            flag = true;
            System.out.println("Enter House ID: ");
            id = scanner.nextLine();
            flag = id.matches("^(SVHO-[0-9]{4})$");
        } while (!flag);
        return id;
    }

    public static String checkVillaId() {
        boolean flag;
        String id;
        do {
            flag = true;
            System.out.println("Enter villa ID: ");
            id = scanner.nextLine();
            flag = id.matches("^(SVVL-[0-9]{4})$");
        } while (!flag);
        return id;
    }

    public static String checkNameService() {
        boolean check;
        String nameService;

        do {
            check = true;
            System.out.println("Enter service name: ");
            nameService = scanner.nextLine();
            check = nameService.matches("^[A-Z][a-z]*([\\s][A-Z][a-z]*)*$");
        } while (!check);
        return nameService;
    }

    public static int checkArea() {
        boolean check;
        int areaAll;

        do {
            check = true;
            System.out.println("Enter area: ");
            areaAll = Integer.parseInt(scanner.nextLine());
            if (areaAll > 30) {
                check = false;
            }
        } while (check);
        return areaAll;
    }

}
