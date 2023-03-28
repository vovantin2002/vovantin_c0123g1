package bai_17.controller;

import bai_17.model.Product;
import bai_17.service.ProductService;

import java.util.Scanner;

import static bai_17.model.Product.add;
import static bai_17.model.Product.search;

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
