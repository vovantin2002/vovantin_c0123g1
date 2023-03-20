//package bai_tap_them.service;
//
//import java.util.Scanner;
//
//public class StudentIml implements IManagement {
//    static ArrayList<Student> students = new ArrayList<>();
//
//    static {
//        students.add(new Student(1, "01234", "nam", "Vo Van Tin", "CO123G1", 7));
//
//    }
//
//    static Scanner  sc = new Scanner(System.in);
//
//    @Override
//    public void add() {
//
//        System.out.println("Nhap ma hoc vien ");
//        int code = Integer.parseInt(sc.nextLine());
//        int count = 0;
//        for (int i = 0; i < students.size(); i++) {
//            if (code == students.get(i).getCode()) {
//                System.out.println("Ma da ton tai ");
//                return;
//            } else {
//                count++;
//            }
//        }
//        if (count == students.size()) {
//        }
//        System.out.println("Nhap ten ");
//        String name = sc.nextLine();
//        System.out.println("Nhap ngay sinh ");
//        String birday = sc.nextLine();
//        System.out.println("Nhap gioi tinh  ");
//        String gender = sc.nextLine();
//        System.out.println("Nhap lop  ");
//        String classs = sc.nextLine();
//        System.out.println("Nhap diem  ");
//        double ponit = Double.parseDouble(sc.nextLine());
//        Student student = new Student(code, name, birday, gender, classs, (int) ponit);
//        students.add(student);
//    }
//
//    @Override
//    public void update() {
//
//    }
//
//    @Override
//    public void detele() {
//        System.out.println("Nhap ma muon xoa :");
//        Scanner sc = new Scanner(System.in);
//        int code = Integer.parseInt(sc.nextLine());
//        for (int i = 0; i < students.size(); i++) {
//            if (students.get(i).getCode() == code) {
//                System.out.println("Ban co muon xoa ma:  " + code + " nay khong  " +
//                        "\n 1. Co " +
//                        "\n 2. Khong ");
//                System.out.println("Chon chuc nang ");
//                int choss = Integer.parseInt(sc.nextLine());
//                switch (choss) {
//                    case 1:
//                        students.remove(students.get(i));
//                        System.out.println("Ban xoa thanh cong ");
//                        break;
//                    case 2:
//                        System.out.println("Ban khong xoa ");
//                }
//                return;
//            }
//        }
//        System.out.println("Khong tim thay ma hoc vien ");
//    }
//
//    public void display() {
//        System.out.println("Hien thi danh sach: ");
//        for (Student s : students) {
//            System.out.println(s);
//        }
//    }
//}
