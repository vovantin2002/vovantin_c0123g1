package baitapthem1.view;

import baitapthem1.model.Person;
import baitapthem1.model.Teacher;
import baitapthem1.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    ArrayList<Person> people = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        main.menu();
    }

    public void menu() {
        int choice;
        do {
            System.out.println("----------------------");
            System.out.println("PERSON MANAGEMENT MENU");
            System.out.println("----------------------");
            System.out.println("1. Add new person");
            System.out.println("2. Remove person");
            System.out.println("3. View all people");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addPerson();
                    break;
                case 2:
                    removePerson();
                    break;
                case 3:
                    viewAllPeople();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while (choice != 0);
    }

    public void addPerson() {
        System.out.println("----------------------");
        System.out.println("ADD NEW PERSON");
        System.out.println("----------------------");
        System.out.println("1. Add new student");
        System.out.println("2. Add new teacher");
        System.out.println("0. Back to main menu");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter student ID: ");
                String studentId = scanner.next();
                System.out.print("Enter student name: ");
                String studentName = scanner.next();
                System.out.print("Enter student date of birth: ");
                String studentDob = scanner.next();
                System.out.print("Enter student gender: ");
                String studentGender = scanner.next();
                System.out.print("Enter student class: ");
                String studentClass = scanner.next();
                System.out.print("Enter student grade: ");
                double studentGrade = scanner.nextDouble();

                Student student = new Student(studentId, studentName, studentDob, studentGender, studentClass, studentGrade);
                people.add(student);
                System.out.println(studentName + " (Student) has been added to the system.");
                break;
            case 2:
                System.out.print("Enter teacher ID: ");
                String teacherId = scanner.next();
                System.out.print("Enter teacher name: ");
                String teacherName = scanner.next();
                System.out.print("Enter teacher date of birth: ");
                String teacherDob = scanner.next();
                System.out.print("Enter teacher gender: ");
                String teacherGender = scanner.next();
                System.out.print("Enter teacher expertise: ");
                String teacherExpertise = scanner.next();

                Teacher teacher = new Teacher(teacherId, teacherName, teacherDob, teacherGender, teacherExpertise);
                people.add(teacher);
                System.out.println(teacherName + " (Teacher) has been added to the system.");
                break;
            case 0:
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }

    public void removePerson() {
        System.out.println("----------------------");
        System.out.println("REMOVE PERSON");
        System.out.println("----------------------");
        System.out.print("Enter person ID to remove: ");
        String id = scanner.next();

        int index = -1;
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getId().equals(id)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Person with ID " + id + " does not exist.");
        } else {
            people.get(index).displayInfo();
            System.out.print("Do you want to remove this person? (Yes/No) ");
            String confirm = scanner.next();
            if (confirm.equalsIgnoreCase("Yes")) {
                people.remove(index);
                System.out.println("Person with ID " + id + " has been removed.");
            } else {
                System.out.println("Person with ID " + id + " has not been removed.");
            }
        }
    }

    public void viewAllPeople() {
        System.out.println("----------------------");
        System.out.println("VIEW ALL PEOPLE");
        System.out.println("----------------------");
        for (Person person : people) {
            System.out.println("----------------------");
            person.displayInfo();
        }
    }
}
