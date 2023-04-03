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
        employeeList.add(new Employee("01", "Tin", "09/05/2002", "nam", "92527340", "0778298952", "hjakdncaj@gmail.com","ds","18", "Quang Nam"));
        employeeList.add(new Employee("02", "tincute", "09/05/2002", "nam", "92527340", "0778298952", "hjakdncaj@gmail.com","dscs","18", "Quang Nam"));
        employeeList.add(new Employee("03", "vovantin", "09/05/2002", "nam", "92527340", "0778298952", "hjakdncaj@gmail.com","sasds","18", "Quang Nam"));
    }

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
        System.out.print("Enter ability: ");
        String ability = sc.nextLine();
        System.out.print("Enter position: ");
        String position = sc.nextLine();
        System.out.print("Enter salary: ");
        String salary = sc.nextLine();
        Employee employee = new Employee(id, name, birthday, gender, identityCard, phoneNumber, email, ability, position, salary);
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
                System.out.print("Enter ability: ");
                String ability = sc.nextLine();
                System.out.print("Enter position: ");
                String position = sc.nextLine();
                System.out.print("Enter salary: ");
                String salary = sc.nextLine();
                Employee employee = new Employee(id, name, birthday, gender, identityCard, phoneNumber, email, ability, position, salary);
                employeeList.set(i, employee);
                System.out.println("successful fix");
            }
        }
    }
}
