package case_study_module2.repository.impl;

import case_study_module2.model.person.Employee;
import case_study_module2.repository.IRepositoryEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepositoryEmployee implements IRepositoryEmployee {
    static List<Employee> employeeList = new ArrayList<>();
    static Employee employee = new Employee();
    public static Scanner sc = new Scanner(System.in);

    static {
        employeeList.add(new Employee("01", "Tin","nam", "18", "Quang Nam"));
        employeeList.add(new Employee("02", "Tinn", "nam","19", "Quang Nam"));
        employeeList.add(new Employee("03", "Tinnn", "nam","20", "Quang Nam"));
    }

    Scanner scanner = new Scanner(System.in);


    @Override
    public void displayEmployee() {
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }

    @Override
    public void addEmployee() {
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
        Employee employee = new Employee(id, name,gender, age, address);
        employeeList.add(employee);
    }

    @Override
    public void editEmployee() {
        System.out.println("Nhap id can sua");
        String id = sc.nextLine();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equals(id) ) {
                System.out.println("Nhap id");
                id = sc.nextLine();
                System.out.println("Nhap ten");
                String name;
                name = sc.nextLine();
                System.out.println("Nhap gioi tinh");
                String gender= sc.nextLine();
                System.out.println("Nhap tuoi");
                String age = sc.nextLine();
                System.out.println("Nhap dia chi");
                String address = sc.nextLine();
                Employee employee = new Employee(id, name,gender, age, address);
                employeeList.set(i, employee);
            }
        }
    }
}
