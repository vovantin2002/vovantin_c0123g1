package bai_5;

import java.util.Scanner;

public class Student {
    private String name = "John";
    private String classes = "CO2";

    Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten sinh vien : ");
        String name = scanner.nextLine();
        System.out.println("Ten sinh vien da nhap: " + name);
        System.out.println("Nhap lop : ");
        String classes = scanner.nextLine();
        System.out.println("Lop da nhap " + classes);
        Student student = new Student();
        student.setName(name);
        student.setClasses(classes);

    }

}

