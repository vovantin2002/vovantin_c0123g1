package bai_4;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return (b * b) - 4 * a * c;
    }

    public double getRoot1() {
        if (this.getDiscriminant() < 0) ;
        return ((-b + Math.sqrt(this.getDiscriminant())) / (2 * a));
    }

    public double getRoot2() {
        if (this.getDiscriminant() < 0);
        return ((-b - Math.sqrt(this.getDiscriminant())) / (2 * a));
    }

    public static void main(String[] args) {
        double a, b, c;
        System.out.println("Nhap a,b,c: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        QuadraticEquation k = new QuadraticEquation(a, b, c);
        if (k.getDiscriminant() < 0) System.out.println("The equation has no roots");
        else if (k.getDiscriminant() == 0) System.out.println("Phuong trinh co mot nghiem: " + k.getRoot1());
        else {
            System.out.println("Phuong trinh co hai nghiem: ");
            System.out.println("Nghiem thu nhat: " + k.getRoot1());
            System.out.println("Nghiem thu hai: " + k.getRoot2());
        }
    }

}
