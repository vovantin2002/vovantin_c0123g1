package bai_6.circle_and_cylinder;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap radius: ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("nhap color: ");
        String b = sc.nextLine();
        Circle circle = new Circle(a, b);
        System.out.println("radius = " + circle.getRadius());
        System.out.println("Area = " + circle.getArea());
        System.out.println("color = " + circle.getColor());
    }
}
