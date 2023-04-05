package case_study_module2.service.impl;

import case_study_module2.model.person.Customer;
import case_study_module2.service.ICustomerService;
import case_study_module2.util.read_and_write.ReadAndWriteCustomer;

import java.util.List;
import java.util.Scanner;

import static case_study_module2.util.vaidate.Check.checkBirthday;

public class CustomerServiceImpl implements ICustomerService {
    Scanner sc = new Scanner(System.in);
    private static List<Customer> customers =  ReadAndWriteCustomer.readStudentFromFile();


    public void add() {
        System.out.print("Enter id: ");
        String id = sc.nextLine();
        System.out.print("Enter name: ");
        String name;
        name = sc.nextLine();
        String birthday;
        birthday = checkBirthday();
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
        ReadAndWriteCustomer.writeEmployeeToFile(customer1);
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
                String birthday;
                birthday = checkBirthday();
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
                System.out.println("Enter address: ");
                String address = sc.nextLine();
                Customer customer2 = new Customer(id, name, birthday, gender, identityCard, phoneNumber, email, typeOfCustomer, address);
                ReadAndWriteCustomer.writeEmployeeToFile(customer2);
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
