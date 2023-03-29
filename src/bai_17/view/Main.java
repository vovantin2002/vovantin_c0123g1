package bai_17.view;

import bai_17.models.Product;
import bai_17.service.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static List<Product> productList = new ArrayList<>();


    public static void main(String[] args) {
        while (true) {
            System.out.println("DANH SACH QUAN LY SAN PHAM: \n" +
                    "--------------------------------\n" +
                    "1. hien thi danh sach san pham\n" +
                    "2.them moi san pham\n" +
                    "3.tim kiem san pham\n" +
                    "nhap lua chon cua ban: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    display((ArrayList<Product>) productList);
                    break;
                case 2:
                    add((ArrayList<Product>) productList);
                    break;
                case 3:
                    search((ArrayList<Product>) productList);
                    break;
                default:
                    System.out.println("Vui long chon lai ");
            }
        }
    }

    public static void display(ArrayList<Product> productList) {
        System.out.println("========= DANH SACH QUAN LY SAN PHAM: =========");
        System.out.printf("%-10s%-20s%-15s%-15s%-30s\n", "ID", "Name", "Price", "Quantity", "Describe");
        for (Product product : productList) {
            System.out.printf("%-10d%-20s%-15.2f%-15d%-30s\n",
                    product.getId(), product.getName(), product.getPrice(), product.getQuantity(), product.getDescribe());
        }
        System.out.println();
    }

    public static void add(ArrayList<Product> productList) {
        Product product = new Product();

        System.out.println("========= THEM MOI SAN PHAM =========");
        System.out.print("Nhap ID san pham: ");
        product.setId(Integer.parseInt(sc.nextLine()));

        System.out.print("nhap ten san pham: ");
        product.setName(sc.nextLine());

        System.out.print("nhap gia san pham: ");
        product.setPrice(Float.parseFloat(sc.nextLine()));

        System.out.print("nhap so luong san pham: ");
        product.setQuantity(Integer.parseInt(sc.nextLine()));

        System.out.print("nhap mo ta san pham: ");
        product.setDescribe(sc.nextLine());

        productList.add(product);
        System.out.println("them moi san pham thanh cong!");
    }

    public static void search(ArrayList<Product> productList) {
        System.out.println("========= TIM KIEM SAN PHAM =========");
        System.out.print("nhap ten san pham can tim kiem: ");
        String name = sc.nextLine();
        for (Product product : productList) {
            if (product.getName().contains(name)) {
                System.out.printf("%-10s%-20s%-15s%-15s%-30s\n", "ID", "Name", "Price", "Quantity", "Describe");
                System.out.printf("%-10d%-20s%-15.2f%-15d%-30s\n",
                        product.getId(), product.getName(), product.getPrice(), product.getQuantity(), product.getDescribe());

                break;
            }
        }
    }
}
