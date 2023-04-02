package case_study_module2.controllers;

import case_study_module2.model.person.Customer;
import case_study_module2.repository.IRepositoryEmployee;
import case_study_module2.service.IEmployeeService;
import case_study_module2.service.IService;
import case_study_module2.service.impl.CustomerServiceImpl;
import case_study_module2.service.impl.EmployeeServiceImpl;

import java.util.Scanner;

import static bai_17.controller.MainMenu.display;
import static bai_17.models.Product.add;
import static case_study_module2.service.IService.edit;

public class FuramaController {
    static EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    static CustomerServiceImpl customerService = new CustomerServiceImpl();
    private static boolean check = true;
    private static Scanner sc = new Scanner(System.in);

    public static void displayMainMenu() {

        while (check) {
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
            }
        }

    }

    public static void employeeMenu() {
        while (check) {
        System.out.println("1 Display list employees");
        System.out.println("2 Add new employee");
        System.out.println("3 Edit employee`");
        System.out.println("4 Return main menu");
            switch (sc.nextInt()) {
                case 1:
                    employeeService.displayEmployee();
                    break;
                case 2:
                    employeeService.addEmployee();
                    break;
                case 3:
                    employeeService.editEmployee();
                    break;
                case 4:
                    break;

            }
        }

    }


    public static void customerMenu() {
        while (check) {
        System.out.println("1 Display list customers");
        System.out.println("2 Add new customers");
        System.out.println("3 Edit customers`");
        System.out.println("4 Return main menu");
            switch (sc.nextInt()) {
                case 1:
                    customerService.display();
                    break;
                case 2:
                    customerService.add();
                    break;
                case 3:
                    customerService.edit();
                case 4:
            }
        }

    }

    public static void facilityMenu() {
        while (check) {
        System.out.println("1 Display list facility");
        System.out.println("2 Add new facility");
        System.out.println("3 Display list facility maintenance");
        System.out.println("4 Return main menu");
            switch (sc.nextInt()) {
                case 1:
                case 2:
                case 3:
                case 4:

            }
        }

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
