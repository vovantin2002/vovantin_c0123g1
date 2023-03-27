package bai_17.model;

import java.util.Scanner;

public class Product {
    private  static Scanner sc=new Scanner(System.in);
    private static int id;
    private static String name;
    private static float price;
    private static int quantity;
    private static String describe;

    public Product(int id, String name, float price, int quantity, String describe) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.describe = describe;
    }

    public Product() {
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    public String getInfoToCsv(){
        return id+","+name+","+price+","+quantity+","+describe;
    }
    public static void add() {
        System.out.println("nhap id: ");
        id = Integer.parseInt(sc.nextLine());
        System.out.println("nhap ten: ");
        name = sc.nextLine();
        System.out.println("nhap gia: ");
        price= Float.parseFloat(sc.nextLine());
        System.out.println("nhap so luong: ");
        quantity= Integer.parseInt(sc.nextLine());
        System.out.println("nhap mo ta: ");
        describe=sc.nextLine();
    }

    public static void search() {

    }
}
