package case_study_module2.controllers;

import case_study_module2.model.facility.House;
import case_study_module2.model.facility.Room;
import case_study_module2.model.facility.Villa;
import case_study_module2.service.impl.CustomerServiceImpl;
import case_study_module2.service.impl.EmployeeServiceImpl;
import case_study_module2.service.impl.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    static FacilityServiceImpl facilityService = new FacilityServiceImpl();
    static EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    static CustomerServiceImpl customerService = new CustomerServiceImpl();
    private static boolean check = true;
    private static Scanner sc = new Scanner(System.in);

    public static void validateFacilityData(String idService, String nameService, double areaAll, double price, String numberHumanMax, String rentType, int age) throws Exception {

        // Kiểm tra định dạng của mã dịch vụ
        if (!idService.matches("^(SV(VL|HO|RO)-[0-9]{4})$")) {
            throw new Exception("Mã dịch vụ không đúng định dạng!");
        }

        // Kiểm tra định dạng của tên dịch vụ
        if (!nameService.matches("^[A-Z][a-z]*([\\s][A-Z][a-z]*)*$")) {
            throw new Exception("Tên dịch vụ không đúng định dạng!");
        }

        // Kiểm tra diện tích sử dụng
        if (areaAll < 30) {
            throw new Exception("Diện tích không hợp lệ!");
        }

        // Kiểm tra chi phí thuê
        if (price <= 0) {
            throw new Exception("Chi phí thuê không hợp lệ!");
        }

        // Kiểm tra số lượng người tối đa
        int maxCapacityInt = Integer.parseInt(numberHumanMax);
        if (maxCapacityInt <= 0 || maxCapacityInt >= 20) {
            throw new Exception("Số lượng người tối đa phải >0 và nhỏ hơn <20!");
        }


        // Kiểm tra định dạng của kiểu thuê và tiêu chuẩn phòng
        if (!rentType.matches("^[A-Z][a-z]*([\\s][A-Z][a-z]*)*$")) {
            throw new Exception("Kiểu thuê hoặc tiêu chuẩn phòng không đúng định dạng!");
        }

//         Kiểm tra định dạng của ngày sinh
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        Date birthDate = sdf.parse(birthDateString);
//        Date currentDate = new Date();
//         age = (int)((currentDate.getTime() - birthDate.getTime()) / (1000 * 60 * 60 * 24 * 365));
//
//        if(age < 18 || age > 100) {
//            throw new Exception("Ngày sinh không hợp lệ!");
//        }
    }

    public static void displayMainMenu() {

        while (check) {
            System.out.println("---------------Furama Controller---------------");
            System.out.println("1.	Employee Management");
            System.out.println("2.  Customer Management");
            System.out.println("3.  Facility Management ");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");

            switch (sc.nextInt()) {
                case 1:
                    employeeMenu();
                    break;
                case 2:
                    customerMenu();
                    break;
                case 3:
                    facilityMenu();
                    break;
                case 4:
                    bookingMenu();
                    break;
                case 5:
                    promotionMenu();
                    break;
                case 6:
                    System.out.println("Ban da thoat!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please re-enter!");
                    break;
            }
        }

    }

    public static void employeeMenu() {
        int choice = -1;
        while (choice != 4) {
            System.out.println("---------------Employee Management---------------");
            System.out.println("1 Display list employees");
            System.out.println("2 Add new employee");
            System.out.println("3 Edit employee`");
            System.out.println("4 Return main menu");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    employeeService.displayEmployee();
                    break;
                case 2:
                    employeeService.addEmployee();
                    break;
                case 3:
                    employeeService.editEmployee();
                    break;
                default:
                    System.out.println("Please re-enter!");
                    break;

            }
        }

    }


    public static void customerMenu() {
        int choice = -1;
        while (choice != 4) {
            System.out.println("---------------Customer Management---------------");
            System.out.println("1 Display list customers");
            System.out.println("2 Add new customers");
            System.out.println("3 Edit customers`");
            System.out.println("4 Return main menu");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    customerService.display();
                    break;
                case 2:
                    customerService.add();
                    break;
                case 3:
                    customerService.edit();
                default:
                    System.out.println("Please re-enter!");
                    break;
            }
        }

    }

    public static void facilityMenu() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        // Phương thức hiển thị menu Facility Management

        int choice = -1;
        while (choice != 4) {
            System.out.println("---------------Facility Management ---------------");
            System.out.println("1. Display facility list");
            System.out.println("2. Add new facility");
            System.out.println("3. Display facility maintenance list");
            System.out.println("4. Return previous menu");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    facilityService.displayFacility();
                    break;
                case 2:
                    System.out.println("Choose type of facility to add:");
                    System.out.println("1. Add new villa");
                    System.out.println("2. Add new house");
                    System.out.println("3. Add new room");
                    System.out.println("4. Back to menu");
                    int addChoice = sc.nextInt();
                    sc.nextLine();
                    switch (addChoice) {
                        case 1:
                            System.out.println("Enter villa information:");
                            Villa villa = createVilla();
                            facilityService.addNewFacility(villa, 0);
                            System.out.println("Added new villa: " + villa);
                            break;
                        case 2:
                            System.out.println("Enter house information:");
                            House house = createHouse();
                            facilityService.addNewFacility(house, 0);
                            System.out.println("Added new house: " + house);
                            break;
                        case 3:
                            System.out.println("Enter room information:");
                            Room room = createRoom();
                            facilityService.addNewFacility(room, 0);
                            System.out.println("Added new room: " + room);
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    facilityService.displayFacilityMaintenance();
                    break;
                default:
                    System.out.println("Please re-enter!");
                    break;
            }
        }
    }


    // Helper methods để tạo đối tượng Facility
    private static Villa createVilla() {
        System.out.print("Enter idService:");
        String idService = sc.nextLine();
        System.out.print("Enter nameService:");
        String nameService = sc.nextLine();
        System.out.print("Enter areaAll:");
        String areaAll = sc.nextLine();
        sc.nextLine();
        System.out.print("Enter price:");
        String price = sc.nextLine();
        sc.nextLine();
        System.out.print("Enter numberHumanMax:");
        String numberHumanMax = sc.nextLine();
        sc.nextLine();
        System.out.print("Enter rentalType:");
        String rentalType = sc.nextLine();
        System.out.print("Enter age:");
        String age = sc.nextLine();
        sc.nextLine();
        System.out.print("Enter roomStandard:");
        String roomStandard = sc.nextLine();
        System.out.print("Enter poolArea:");
        String poolArea = sc.nextLine();
        System.out.print("Enter numOfLevel:");
        String numOfLevel = sc.nextLine();
        sc.nextLine();
        return new Villa(idService, nameService, areaAll, price, numberHumanMax, rentalType, age, roomStandard, poolArea, numOfLevel);

    }

    private static House createHouse() {
        System.out.print("Enter idService:");
        String idService = sc.nextLine();
        System.out.print("Enter nameService:");
        String nameService = sc.nextLine();
        System.out.print("Enter areaAll:");
        String areaAll = sc.nextLine();
        sc.nextLine();
        System.out.print("Enter price: ");
        String price = sc.nextLine();
        sc.nextLine();
        System.out.print("Enter numberHumanMax:");
        String numberHumanMax = sc.nextLine();
        sc.nextLine();
        System.out.print("Enter rentalType:");
        String rentalType = sc.nextLine();
        System.out.print("Enter age:");
        String age = sc.nextLine();
        sc.nextLine();
        System.out.print("Enter roomStandard:");
        String roomStandard = sc.nextLine();
        System.out.print("Enter numOfLevel:");
        String numOfLevel = sc.nextLine();
        return new House(idService, nameService, areaAll, price, numberHumanMax, rentalType, age, roomStandard, numOfLevel);
    }

    private static Room createRoom() {
        System.out.print("Enter room idService:");
        String idService = sc.nextLine();
        System.out.print("Enter room nameService:");
        String nameService = sc.nextLine();
        System.out.print("Enter areaAll:");
        String areaAll = sc.nextLine();
        sc.nextLine();
        System.out.print("Enter price:");
        String price = sc.nextLine();
        sc.nextLine();
        System.out.print("Enter numberHumanMax:");
        String numberHumanMax = sc.nextLine();
        sc.nextLine();
        System.out.print("Enter rentalType:");
        String rentalType = sc.nextLine();
        System.out.print("Enter age:");
        String age = sc.nextLine();
        sc.nextLine();
        System.out.print("Enter freeServiceIncluded:");
        String freeServiceIncluded = sc.nextLine();
        return new Room(idService, nameService, areaAll, price, numberHumanMax, rentalType, age, freeServiceIncluded);
    }

    public static void bookingMenu() {

        while (check) {
            System.out.println("1.	Add new booking");
            System.out.println("2.  Display list booking");
            System.out.println("3.  Create new contract ");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");

            switch (sc.nextInt()) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:

            }
        }

    }

    public static void promotionMenu() {
        while (check) {
            System.out.println("1 Display list customers use service");
            System.out.println("2 Display list list customers get voucher");
            System.out.println("3 Return main menu");
            switch (sc.nextInt()) {
                case 1:
                case 2:
                case 3:

            }
        }

    }
}
