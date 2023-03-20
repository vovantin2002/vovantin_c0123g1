package bai_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Management management = new Management();

        // Thêm sản phẩm
        management.addProduct(new Product(1, "sản phẩm 1", 10.0, 5));
        management.addProduct(new Product(2, "sản phẩm 2", 20.0, 10));
        management.addProduct(new Product(3, "sản phẩm 3", 15.0, 8));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nHệ thống quản lý sản phẩm");
            System.out.println("==========================\n");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Xóa sản phẩm");
            System.out.println("3. Cập nhật sản phẩm");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm theo tên");
            System.out.println("7. Sắp xếp sản phẩm theo giá");
            System.out.println("0. Thoát");
            System.out.print("\nNhập lựa chọn của bạn : ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("bạn đã thoát!");
                    System.exit(0);
                case 1:
                    System.out.println("Thêm sản phẩm mới:");
                    System.out.print("nhập ID sản phẩm: ");
                    int id = scanner.nextInt();
                    System.out.print("nhập tên sản phẩm: ");
                    String name = scanner.next();
                    System.out.print("nhập giá sản phẩm: ");
                    double price = scanner.nextDouble();
                    System.out.print("nhập số lượng sản phẩm: ");
                    int quantity = scanner.nextInt();
                    management.addProduct(new Product(id, name, price, quantity));
                    System.out.println("Đã thêm sản phẩm thành công!");
                    break;
                case 2:
                    System.out.println(" Xóa sản phẩm:");
                    System.out.print("nhập ID sản phẩm: ");
                    id = scanner.nextInt();
                    management.removeProduct(id);
                    System.out.println("Đã xóa sản phẩm thành công!");
                    break;
                case 3:
                    System.out.println("Cập nhật sản phẩm:");
                    System.out.print("nhập ID sản phẩm: ");
                    id = scanner.nextInt();
                    System.out.print("nhập tên sản phẩm: ");
                    name = scanner.next();
                    System.out.print("nhập giá sản phẩm: ");
                    price = scanner.nextDouble();
                    System.out.print("nhập số lượng sản phẩm: ");
                    quantity = scanner.nextInt();
                    management.updateProduct(id, name, price, quantity);
                    System.out.println("Đã cập nhật sản phẩm thành công!");
                    break;
                case 4:
                    management.displayProductList();
                    break;
                case 5:
                    System.out.println("Tìm sản phẩm theo tên:");
                    System.out.print("Nhập tên sản phẩm: ");
                    name = scanner.next();
                    management.searchProduct(name);
                    break;
                case 6:
                    management.sortProductByName();
                    System.out.println("Danh sách sản phẩm được sắp xếp theo tên!");
                    break;
                case 7:
                    System.out.println("Sắp xếp sản phẩm theo giá:");
                    System.out.println("1. Sắp xếp theo thứ tự tăng dần");
                    System.out.println("2. Sắp xếp theo thứ tự giảm dần");
                    System.out.print("nhập lựa chọn của bạn : ");
                    int order = scanner.nextInt();
                    boolean increasingOrder = (order == 1);
                    management.sortProductByPrice(increasingOrder);
                    System.out.println("Danh sách sản phẩm được sắp xếp theo giá!");
                    break;
                default:
                    System.out.println("lựa chọn không hợp lệ!");
                    break;
            }
        }
    }
}