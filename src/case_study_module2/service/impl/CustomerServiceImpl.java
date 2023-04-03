package case_study_module2.service.impl;

import case_study_module2.model.person.Customer;
import case_study_module2.model.person.Employee;
import case_study_module2.model.person.Person;
import case_study_module2.service.ICustomerService;

import java.util.LinkedList;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    Scanner sc = new Scanner(System.in);
    public static Customer customer = new Customer();
    private static LinkedList<Customer> customers = new LinkedList<>();

    static {
        // Khởi tạo dữ liệu mẫu
        customers.add(new Customer("1", "Nguyen Van A", "nam", "19", "HN"));
        customers.add(new Customer("2", "Tran Thi B", "nu", "20", "HCM"));
    }


    public void add() {
        System.out.println("Enter id: ");
        String id;
        id = sc.nextLine();
        System.out.println("Enter name: ");
        String name;
        name = sc.nextLine();
        System.out.println("Enter gender: ");
        String gender;
        gender = sc.nextLine();
        System.out.println("Enter age: ");
        String age = sc.nextLine();
        System.out.println("Enter address: ");
        String address = sc.nextLine();
        Customer customer1 = new Customer(id, name, gender, age, address);
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
                System.out.print("Enter gender: ");
                String gender;
                gender = sc.nextLine();
                System.out.print("Enter age: ");
                String age = sc.nextLine();
                System.out.print("Enter address:");
                String address = sc.nextLine();
                Customer customer2 = new Customer(id, name, gender, age, address);
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
