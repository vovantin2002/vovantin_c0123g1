package case_study_module2.service.impl;

import case_study_module2.model.person.Customer;
import case_study_module2.service.ICustomerService;

import java.util.LinkedList;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    Scanner sc = new Scanner(System.in);
    public static Customer customer = new Customer();
    private static LinkedList<Customer> customers = new LinkedList<>();

    static {
        // Khởi tạo dữ liệu mẫu
        customers.add(new Customer("1", "Nguyen Van A", "09/05/2002", "nam", "0932r9", "0982921111", "hjasbc@gmail.com", "Diamond", "HN"));
        customers.add(new Customer("2", "Nguyen Van B", "09/05/2002", "nam", "0932r9", "0982921111", "hjasbc@gmail.com", "Platinium", "HN"));
    }


    public void add() {
        System.out.print("Enter id: ");
        String id = sc.nextLine();
        System.out.print("Enter name: ");
        String name;
        name = sc.nextLine();
        System.out.print("Enter birthday: ");
        String birthday;
        birthday = sc.nextLine();
        System.out.print("Enter gender: ");
        String gender = sc.nextLine();
        System.out.print("Enter identityCard: ");
        String identityCard = sc.nextLine();
        System.out.print("Enter phoneNumber: ");
        String phoneNumber = sc.nextLine();
        System.out.print("Enter email: ");
        String email = sc.nextLine();
        System.out.print("Enter typeOfCustomer: ");
        String typeOfCustomer = sc.nextLine();
        System.out.print("Enter ability: ");
        System.out.println("Enter address: ");
        String address = sc.nextLine();
        Customer customer1 = new Customer(id, name, birthday, gender, identityCard, phoneNumber, email, typeOfCustomer, address);
        customers.add(customer1);
        System.out.println("successfully added new!");
    }

    public void edit() {
        System.out.print("enter the id to edit:  ");
        String id = sc.nextLine();
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId().equals(id)) {
                System.out.print("Enter id: ");
                id = sc.nextLine();
                System.out.print("Enter name: ");
                String name;
                name = sc.nextLine();
                System.out.print("Enter birthday: ");
                String birthday;
                birthday = sc.nextLine();
                System.out.print("Enter gender: ");
                String gender = sc.nextLine();
                System.out.print("Enter identityCard: ");
                String identityCard = sc.nextLine();
                System.out.print("Enter phoneNumber: ");
                String phoneNumber = sc.nextLine();
                System.out.print("Enter email: ");
                String email = sc.nextLine();
                System.out.print("Enter typeOfCustomer: ");
                String typeOfCustomer = sc.nextLine();
                System.out.print("Enter ability: ");
                System.out.println("Enter address: ");
                String address = sc.nextLine();
                Customer customer2 = new Customer(id, name, birthday, gender, identityCard, phoneNumber, email, typeOfCustomer, address);
                customers.set(Integer.parseInt(id), customer2);
            }
        }
    }


    @Override
    public void display() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }


}
