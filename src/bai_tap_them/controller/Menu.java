package bai_tap_them.controller;

import bai_tap_them.service.StudentIml;

import java.util.Scanner;

public class Menu {
    static StudentIml studentIml = new StudentIml();
    static InstructorIml intructorIml = new IntructorIml();

    static Scanner sc = new Scanner(System.in);

    public static void displayMenuCodyGym() {
        boolean check;
        do {
            check = true;
            System.out.println("Cong Ty:  " +
                    "\n1. Hoc vien" +
                    "\n2. Giang vien" +
                    "\n3. Khac ");
            System.out.println("Neu thuoc la hoc vien thi chon 1, giang vien thi chon 2, con lai chon 3 ");
            int select = Integer.parseInt(sc.nextLine());
            switch (select) {
                case 1:
                    Student();
                    break;
                case 2:
                    Inturtor();
                    break;
                case 3:
                    check = false;
                    break;
            }
        } while (check);
    }

    public static void Student() {

        boolean check;
        do {
            check = true;
            System.out.println("Danh sach quan ly hoc vien" +
                    "\n1. Them moi hoc vien" +
                    "\n2. Xoa hoc vien" +
                    "\n3. Hien thi danh sach" +
                    "\n4. Khac");
            System.out.println("Nhap lua chon");
            int chooss = Integer.parseInt(sc.nextLine());
            switch (chooss) {
                case 1:
                    System.out.println("nhap cac chuc nang ");
                    studentIml.add();
                    break;
                case 2:
                    studentIml.detele();
                    break;
                case 3:
                    System.out.println("Hien thi danh sach hv ");
                    studentIml.display();
                    break;
                case 4:
                    check = false;
                    break;
            }
        } while (check);
    }

    public static void Inturtor() {
        boolean check;
        do {
            check = true;
            System.out.println("Danh sach quan ly giang vien " +
                    "\n1. Them moi gv " +
                    "\n2. Xoa gv " +
                    "\n3. Hien thi danh sach " +
                    "\n4. Khac ");
            System.out.println("Nhap lua chon ");
            int chooss = Integer.parseInt(sc.nextLine());
            switch (chooss) {
                case 1:
                    System.out.println("Nhap chuc nang ");
                    intructorIml.add();
                    break;
                case 2:
                    intructorIml.detele();
                    break;
                case 3:
                    System.out.println("Hien thi danh sach ");
                    intructorIml.display();
                    break;
                case 4:
                    check = false;
                    break;
            }
        } while (check);
    }
}
