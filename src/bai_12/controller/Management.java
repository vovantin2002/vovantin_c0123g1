package bai_12.controller;

import bai_12.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Management {
    private ArrayList<Product> productList = new ArrayList<>();

    public ArrayList<Product> getProductList() {
        return productList;
    }

    //hàm thêm sản phẩm
    public void addProduct(Product product) {
        productList.add(product);
    }

    //hàm xóa sản phẩm
    public void removeProduct(int id) {
        productList.removeIf(product -> product.getId() == id);
    }

    //hàm sửa sản phẩm
    public void updateProduct(int id, String name, double price, int quantity) {
        for (Product product : productList) {
            if (product.getId() == id) {
                product.setName(name);
                product.setPrice(price);
                product.setQuantity(quantity);
            }
        }
    }

    //hàm hiển thị sản phẩm
    public void displayProductList() {
        System.out.println("List of products:");
        System.out.println("ID\tName\t\tPrice\tQuantity");
        for (Product product : productList) {
            System.out.printf("%d\t%-10s\t%.2f\t%d\n", product.getId(), product.getName(), product.getPrice(), product.getQuantity());
        }
    }

    //hàm tìm kiếm sản phẩm
    public void searchProduct(String name) {
        ArrayList<Product> result = new ArrayList<>();
        for (Product product : productList) {
            if (product.getName().contains(name)) {
                result.add(product);
            }
        }
        System.out.println("Tìm kiếm kết quả:");
        System.out.println("ID\tName\t\tPrice\tQuantity");
        for (Product product : result) {
            System.out.printf("%d\t%-10s\t%.2f\t%d\n", product.getId(), product.getName(), product.getPrice(), product.getQuantity());
        }
    }

    //hàm sắp xếp sản phẩm theo tên
    public void sortProductByName() {
        Collections.sort(productList, Comparator.comparing(Product::getName));
    }

    //hàm sắp xếp sản phẩm theo giá
    public void sortProductByPrice(boolean increasingOrder) {
        if (increasingOrder) {
            Collections.sort(productList, Comparator.comparing(Product::getPrice));
        } else {
            Collections.sort(productList, Comparator.comparing(Product::getPrice).reversed());
        }
    }
}

