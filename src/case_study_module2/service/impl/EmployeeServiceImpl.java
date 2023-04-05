package case_study_module2.service.impl;

import case_study_module2.model.person.Employee;
import case_study_module2.service.IEmployeeService;
import case_study_module2.util.read_and_write.ReadAndWriteEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static case_study_module2.util.vaidate.Check.checkBirthday;

public class EmployeeServiceImpl implements IEmployeeService {
    //    IRepositoryEmployee iRepositoryEmployee = new RepositoryEmployee();
    static List<Employee> employeeList = ReadAndWriteEmployee.readEmployeeFromFile();
    public static Employee employee = new Employee();
    public static Scanner sc = new Scanner(System.in);
    static List<Employee> arrayListEmployee = new ArrayList<>();
    @Override
    public void displayEmployee() {
        for (Employee e : employeeList) {
            System.out.println(e.toString());
        }
    }


    @Override
    public void addEmployee() {
        System.out.print("Enter id: ");
       String id = sc.nextLine();
        System.out.print("Enter name: ");
        String name;
        name = sc.nextLine();
        String birthday;
        birthday =checkBirthday();
        System.out.print("Enter gender: ");
        String gender = sc.nextLine();
        System.out.print("Enter identityCard: ");
        String identityCard = sc.nextLine();
        System.out.print("Enter phoneNumber: ");
        String phoneNumber = sc.nextLine();
        System.out.print("Enter email: ");
        String email = sc.nextLine();
        System.out.print("Enter ability: ");
        String ability = sc.nextLine();
        System.out.print("Enter position: ");
        String position = sc.nextLine();
        System.out.print("Enter salary: ");
        String salary = sc.nextLine();
        Employee employee = new Employee(id, name, birthday, gender, identityCard, phoneNumber, email, ability, position, salary);
        ReadAndWriteEmployee.writeEmployeeToFile(employee);
        employeeList.add(employee);
        System.out.println("successfully added new!");
    }

    @Override
    public void editEmployee() {
        arrayListEmployee = ReadAndWriteEmployee.readEmployeeFromFile();
        System.out.print("enter the id to edit: ");
        String id = sc.nextLine();
        for (int i = 0; i < arrayListEmployee.size(); i++) {
            if (arrayListEmployee.get(i).getId().equals(id)) {
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
                System.out.print("Enter ability: ");
                String ability = sc.nextLine();
                System.out.print("Enter position: ");
                String position = sc.nextLine();
                System.out.print("Enter salary: ");
                String salary = sc.nextLine();
                Employee employee = new Employee(id, name, birthday, gender, identityCard, phoneNumber, email, ability, position, salary);
                arrayListEmployee.set(i, employee);
                ReadAndWriteEmployee.writeEmployeeToFile(employee);
                System.out.println("successful fix");
            }
        }



    }
}
