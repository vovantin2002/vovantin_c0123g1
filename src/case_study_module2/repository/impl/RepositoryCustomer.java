package case_study_module2.repository.impl;

import case_study_module2.model.person.Customer;
import case_study_module2.model.person.Person;
import case_study_module2.repository.IRepositoryCustomer;

import java.util.LinkedList;
import java.util.Scanner;

public class RepositoryCustomer implements IRepositoryCustomer {
    Scanner sc = new Scanner(System.in);
    Customer customer = new Customer();
    private static LinkedList<Customer> customers = new LinkedList<>();

    static {
        // Khởi tạo dữ liệu mẫu
        customers.add(new Customer("1", "Nguyen Van A", "nam", "19", "HN"));
        customers.add(new Customer("2", "Tran Thi B", "nu", "20", "HCM"));
    }


    public void add() {
        System.out.println("Nhap id");
        String id;
        id = sc.nextLine();
        System.out.println("Nhap ten");
        String name;
        name = sc.nextLine();
        System.out.println("Nhap gioi tinh");
        String gender;
        gender = sc.nextLine();
        System.out.println("Nhap tuoi");
        String age = sc.nextLine();
        System.out.println("Nhap dia chi");
        String address = sc.nextLine();
        Customer customer1 = new Customer(id, name, gender, age, address);
        customers.add(customer1);
    }

    public void edit() {
        System.out.println("nhap id muon sua ");
        String id = sc.nextLine();
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId().equals(id)) {
                System.out.println("Nhap id");
                id = sc.nextLine();
                System.out.println("Nhap ten");
                String name;
                name = sc.nextLine();
                System.out.println("Nhap gioi tinh");
                String gender;
                gender = sc.nextLine();
                System.out.println("Nhap tuoi");
                String age = sc.nextLine();
                System.out.println("Nhap dia chi");
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
