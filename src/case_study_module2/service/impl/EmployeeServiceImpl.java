package case_study_module2.service.impl;

import case_study_module2.model.person.Employee;
import case_study_module2.service.IEmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    //    IRepositoryEmployee iRepositoryEmployee = new RepositoryEmployee();
    static List<Employee> employeeList = new ArrayList<>();
    static Employee employee = new Employee();
    public static Scanner sc = new Scanner(System.in);

    static {
        employeeList.add(new Employee("01", "Tin", "nam", "18", "Quang Nam"));
        employeeList.add(new Employee("02", "Tinn", "nam", "19", "Quang Nam"));
        employeeList.add(new Employee("03", "Tinnn", "nam", "20", "Quang Nam"));
    }

    @Override
    public void displayEmployee() {
        for (Employee e : employeeList) {
            System.out.println(e.toString());
        }
    }


    @Override
    public void addEmployee() {
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
        Employee employee = new Employee(id, name, gender, age, address);
        employeeList.add(employee);
        System.out.println("successfully added new!");
    }

    @Override
    public void editEmployee() {
        System.out.print("enter the id to edit: ");
        String id = sc.nextLine();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equals(id)) {
                System.out.print("Enter id: ");
                id = sc.nextLine();
                System.out.print("Enter name: ");
                String name;
                name = sc.nextLine();
                System.out.print("Enter gender: ");
                String gender = sc.nextLine();
                System.out.print("Enter age: ");
                String age = sc.nextLine();
                System.out.print("Enter address: ");
                String address = sc.nextLine();
                Employee employee = new Employee(id, name, gender, age, address);
                employeeList.set(i, employee);
                System.out.println("successful fix");
            }
        }
    }
}
