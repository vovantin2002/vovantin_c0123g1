package bai_5;

import java.util.Scanner;

public class TestCircle {

    private double radius;
    String color;


    public TestCircle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public double getArea() {
        return (Math.pow(getRadius(), 2)) * 3.14;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap radius: ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("nhap color: ");
        String b = sc.nextLine();
        TestCircle circle = new TestCircle(a, b);
        System.out.println("radius = " + circle.getRadius());
        System.out.println( "Area = " + circle.getArea());
        System.out.println( "color = " + circle.getColor() );
    }


}
