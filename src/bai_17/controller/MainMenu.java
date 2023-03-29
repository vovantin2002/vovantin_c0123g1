package bai_17.controller;

import bai_17.models.Product;
import bai_17.service.ProductService;

import java.util.Scanner;

public class MainMenu {

    static ProductService productService = new ProductService();
    static Scanner sc = new Scanner(System.in);


    public static void display() {
        Product[] products = new Product[0];
        for (Product p : products) {
            System.out.println(p.getId() + " - " + p.getName() + " - " + p.getPrice() +
                    " - " + p.getQuantity() + " - " + p.getDescribe());
        }
    }


}
