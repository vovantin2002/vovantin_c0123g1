package case_study_module2.controllers;

import case_study_module2.model.facility.House;
import case_study_module2.model.facility.Room;
import case_study_module2.model.facility.Villa;
import case_study_module2.service.impl.CustomerServiceImpl;
import case_study_module2.service.impl.EmployeeServiceImpl;
import case_study_module2.service.impl.FacilityServiceImpl;
import com.sun.xml.internal.ws.util.StringUtils;

import java.util.InputMismatchException;
import java.util.Scanner;

import static case_study_module2.util.vaidate.Check.*;

public class FuramaController {
    static FacilityServiceImpl facilityService = new FacilityServiceImpl();
    static EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    static CustomerServiceImpl customerService = new CustomerServiceImpl();
    private static boolean check = true;
    private static Scanner sc = new Scanner(System.in);


    public static void displayMainMenu() {
        int choice = -1;
        while (choice != 6) {
            try {
                System.out.println("---------------Furama Controller---------------");
                System.out.println("1.	Employee Management");
                System.out.println("2.  Customer Management");
                System.out.println("3.  Facility Management ");
                System.out.println("4. Booking Management");
                System.out.println("5. Promotion Management");
                System.out.println("6. Exit");
                choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
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
                        break;
                    default:
                        System.out.println("Invalid choice, please enter again.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice, please enter again.");
            }
        }

    }

    public static void employeeMenu() {
        int choice = -1;
        while (choice != 4) {
            try {
                System.out.println("---------------Employee Management---------------");
                System.out.println("1 Display list employees");
                System.out.println("2 Add new employee");
                System.out.println("3 Edit employee`");
                System.out.println("4 Return main menu");
                choice = Integer.parseInt(sc.nextLine());
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
                        System.out.println("Invalid choice, please enter again.");
                        break;

                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice, please enter again.");
            }
        }

    }


    public static void customerMenu() {
        int choice = -1;
        while (choice != 4) {
            try {
                System.out.println("---------------Customer Management---------------");
                System.out.println("1 Display list customers");
                System.out.println("2 Add new customers");
                System.out.println("3 Edit customers`");
                System.out.println("4 Return main menu");
                choice = Integer.parseInt(sc.nextLine());
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
                        System.out.println("Invalid choice, please enter again.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice, please enter again.");
            }
        }

    }

    public static void facilityMenu() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        // Phương thức hiển thị menu Facility Management

        int choice = -1;
        while (choice != 4) {
            try {
                System.out.println("---------------Facility Management ---------------");
                System.out.println("1. Display facility list");
                System.out.println("2. Add new facility");
                System.out.println("3. Display facility maintenance list");
                System.out.println("4. Return previous menu");
                System.out.println("Enter your choice:");
                choice = Integer.parseInt(sc.nextLine());
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
                        System.out.println("Invalid choice, please enter again.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice, please enter again.");
            }
        }
    }


    // Helper methods để tạo đối tượng Facility
    private static Villa createVilla() {
        String idService = checkVillaId();
        String nameService = checkNameService();
        String areaAll = String.valueOf(checkArea());
        String price = String.valueOf(checkPrice());
        String numberHumanMax = String.valueOf(checkNumberHumanMax());
        System.out.print("Enter rentalType:");
        String rentalType = sc.nextLine();
        System.out.print("Enter roomStandard:");
        String roomStandard = sc.nextLine();
        System.out.print("Enter poolArea:");
        String poolArea = sc.nextLine();
        String numOfLevel = String.valueOf(checkFloor());
        return new Villa(idService, nameService, areaAll, price, numberHumanMax, rentalType, roomStandard, poolArea, numOfLevel);

    }

    private static House createHouse() {
        String idService = checkHouseId();
        String nameService = checkNameService();
        String areaAll = String.valueOf(checkArea());
        String price = String.valueOf(checkPrice());
        String numberHumanMax = String.valueOf(checkNumberHumanMax());
        System.out.print("Enter rentalType:");
        String rentalType = sc.nextLine();
        System.out.print("Enter roomStandard:");
        String roomStandard = sc.nextLine();
        String numOfLevel = String.valueOf(checkFloor());
        return new House(idService, nameService, areaAll, price, numberHumanMax, rentalType, roomStandard, numOfLevel);
    }

    private static Room createRoom() {
        String idService = checkRoomId();
        String nameService = checkNameService();
        String areaAll = String.valueOf(checkArea());
        String price = String.valueOf(checkPrice());
        String numberHumanMax = String.valueOf(checkNumberHumanMax());
        System.out.print("Enter rentalType:");
        String rentalType = sc.nextLine();
        System.out.print("Enter freeServiceIncluded:");
        String freeServiceIncluded = sc.nextLine();
        return new Room(idService, nameService, areaAll, price, numberHumanMax, rentalType, freeServiceIncluded);
    }

    public static void bookingMenu() {
        int choice = -1;
        while (choice != 6) {

            try {
                System.out.println("1.	Add new booking");
                System.out.println("2.  Display list booking");
                System.out.println("3.  Create new contract ");
                System.out.println("4. Display list contracts");
                System.out.println("5. Edit contracts");
                System.out.println("6. Return main menu");
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        break;
                    case 2:
                        break;

                    case 3:
                        break;

                    case 4:
                        break;

                    case 5:
                        break;

                    case 6:
                        break;

                    default:
                        System.out.println("Invalid choice, please enter again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice, please enter again.");
            }
        }

    }

    public static void promotionMenu() {
        int choice = -1;
        while (choice != 3) {
            try {
                System.out.println("1 Display list customers use service");
                System.out.println("2 Display list list customers get voucher");
                System.out.println("3 Return main menu");
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:

                        break;
                    case 2:
                        break;

                    case 3:
                        break;

                    default:
                        System.out.println("Invalid choice, please enter again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice, please enter again.");
            }
        }

    }
}
